package ch.wisv.dienst2.apiclient;

import ch.wisv.dienst2.apiclient.model.MembershipStatus;
import ch.wisv.dienst2.apiclient.model.Person;
import ch.wisv.dienst2.apiclient.model.Student;
import ch.wisv.dienst2.apiclient.util.Dienst2Repository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.SerializationUtils;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Dienst2Model.class)
public class Dienst2ModelTests {
    @Autowired
    private Dienst2Repository dienst2Repository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void person() {
        Person p = dienst2Repository.getPersonFromLdapUsername("mark").get();
        assertEquals(p.getFirstname(), "Mark");
        assertEquals(p.getCity(), "Delft");
        assertEquals(p.getMembershipStatus(), MembershipStatus.MERIT);

        Student s = p.getStudent().get();
        assertEquals(s.getStudy(), "Informatica");
        assertEquals(s.isYearbookPermission(), true);
        assertEquals(s.getPerson(), p.getId());

        testSerialization(p);
        testSerialization(s);

        Person p2 = dienst2Repository.getPerson(2420).get();
        assertEquals(p, p2);
    }

    private void testSerialization(Object object) {
        byte[] serializedObject = SerializationUtils.serialize(object);
        Object deserializedObject = SerializationUtils.deserialize(serializedObject);
        assertEquals(object, deserializedObject);
    }

}
