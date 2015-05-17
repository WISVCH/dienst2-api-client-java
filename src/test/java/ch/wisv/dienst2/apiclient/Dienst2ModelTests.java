package ch.wisv.dienst2.apiclient;

import ch.wisv.dienst2.apiclient.model.Person;
import ch.wisv.dienst2.apiclient.model.Results;
import ch.wisv.dienst2.apiclient.model.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Dienst2Model.class)
public class Dienst2ModelTests {
    @Value("${dienst2.baseurl}")
    private String BASEURL;

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void contextLoads() {
    }

    @Test
    public void person() {
        String url = BASEURL + "/ldb/api/v3/people/?ldap_username={username}";
        ParameterizedTypeReference<Results<Person>> responseType = new ParameterizedTypeReference<Results<Person>>() {
        };
        ResponseEntity<Results<Person>> e = restTemplate.exchange(url, HttpMethod.GET, null, responseType, "mark");
        assertEquals(e.getStatusCode(), HttpStatus.OK);

        Results<Person> r = e.getBody();
        assertEquals(r.getCount(), 1);
        assertEquals(r.getResults().size(), 1);

        Person p = r.getResults().get(0);
        assertEquals(p.getFirstname(), "Mark");
        assertEquals(p.getCity(), "Delft");

//        restTemplate.getForObject(BASEURL + p.getStudent(), Student.class);
        Student s = p.getStudent().get();
        assertEquals(s.getStudy(), "Informatica");
        assertEquals(s.isYearbookPermission(), true);
        assertEquals(s.getPerson(), p.getId());
    }
}
