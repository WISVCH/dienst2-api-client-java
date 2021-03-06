package ch.wisv.dienst2.apiclient;

import ch.wisv.dienst2.apiclient.model.MembershipStatus;
import ch.wisv.dienst2.apiclient.model.Person;
import ch.wisv.dienst2.apiclient.model.Student;
import ch.wisv.dienst2.apiclient.util.Dienst2Repository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.SerializationUtils;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Dienst2Model.class)
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
        assertEquals(p.getMembershipStatus(), MembershipStatus.MERIT);

        Student s = p.getStudent().get();
        assertEquals(s.getStudy(), "Informatica");
        assertEquals(s.getPerson(), p.getId());

        testSerialization(p);
        testSerialization(s);

        Person p2 = dienst2Repository.getPerson(2420).get();
        assertEquals(p, p2);
    }

    @Test
    public void personSurnameWithPreposition() {
        Person p = dienst2Repository.getPerson(2859).get();
        assertEquals(p.getSurnameWithPreposition().substring(0, 3), "de ");
    }

    private void testSerialization(Object object) {
        byte[] serializedObject = SerializationUtils.serialize(object);
        Object deserializedObject = SerializationUtils.deserialize(serializedObject);
        assertEquals(object, deserializedObject);
    }

}
