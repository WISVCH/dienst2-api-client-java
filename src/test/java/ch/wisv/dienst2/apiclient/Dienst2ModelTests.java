package ch.wisv.dienst2.apiclient;

import ch.wisv.dienst2.apiclient.model.Person;
import ch.wisv.dienst2.apiclient.model.Result;
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
        String url = BASEURL + "/dienst2/ldb/api/v2/person/?ldap_username={username}";
        ParameterizedTypeReference<Result<Person>> responseType = new ParameterizedTypeReference<Result<Person>>() {
        };
        ResponseEntity<Result<Person>> e = restTemplate.exchange(url, HttpMethod.GET, null, responseType, "mark");
        assertEquals(e.getStatusCode(), HttpStatus.OK);

        Result<Person> w = e.getBody();
        assertEquals(w.getMeta().getTotalCount(), 1);
        assertEquals(w.getObjects().size(), 1);

        Person p = w.getObjects().get(0);
        assertEquals(p.getFirstname(), "Mark");
        assertEquals(p.getCity(), "Delft");

        Student s = restTemplate.getForObject(BASEURL + p.getStudent(), Student.class);
        assertEquals(s.getStudy(), "Informatica");
        assertEquals(s.isYearbookPermission(), true);
        assertEquals(s.getPerson(), p.getResourceUri());
    }
}
