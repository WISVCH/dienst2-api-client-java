package ch.wisv.dienst2;

import ch.wisv.dienst2.util.Dienst2RestTemplateFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Spring configuration
 */
@Configuration
public class Dienst2ModelConfiguration {

    @Value("${dienst2.apikey}")
    private String API_KEY;

    @Bean
    public RestTemplate restTemplateFactory() {
        Dienst2RestTemplateFactoryBean f = new Dienst2RestTemplateFactoryBean(API_KEY);
        return f.getObject();
    }
}
