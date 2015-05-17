package ch.wisv.dienst2.apiclient;

import ch.wisv.dienst2.apiclient.util.Dienst2RestTemplateFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Spring configuration
 */
@Configuration
public class Dienst2ModelConfiguration {

    @Value("${dienst2.apitoken}")
    private String API_TOKEN;

    @Bean
    public RestTemplate restTemplateFactory() {
        Dienst2RestTemplateFactoryBean f = new Dienst2RestTemplateFactoryBean(API_TOKEN);
        return f.getObject();
    }
}
