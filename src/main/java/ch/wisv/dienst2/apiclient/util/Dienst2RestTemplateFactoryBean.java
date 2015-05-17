package ch.wisv.dienst2.apiclient.util;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

/**
 * Factory to create RestTemplate with API token authentication and property name mapping.
 */
public class Dienst2RestTemplateFactoryBean implements FactoryBean<RestTemplate> {

    private String apiToken;

    public Dienst2RestTemplateFactoryBean(String apiToken) {
        this.apiToken = apiToken;
    }

    @Override
    public RestTemplate getObject() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setInterceptors(Collections.<ClientHttpRequestInterceptor>singletonList(new
                ApiTokenHttpRequestInterceptor(apiToken)));
        restTemplate.setMessageConverters(Collections.singletonList(underscoreMessageConverter()));
        return restTemplate;
    }

    public static MappingJackson2HttpMessageConverter underscoreMessageConverter() {
        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
        builder.propertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
        builder.modulesToInstall(new Jdk8Module());

        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setObjectMapper(builder.build());

        return converter;
    }

    @Override
    public Class<?> getObjectType() {
        return RestTemplate.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
