package ch.wisv.dienst2.apiclient.util;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

/**
 * Factory to create RestTemplate with API key authentication and property name mapping.
 */
public class Dienst2RestTemplateFactoryBean implements FactoryBean<RestTemplate> {

    private String apiKey;

    public Dienst2RestTemplateFactoryBean(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public RestTemplate getObject() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setInterceptors(Collections.<ClientHttpRequestInterceptor>singletonList(new
                ApiKeyHttpRequestInterceptor(apiKey)));
        restTemplate.setMessageConverters(Collections.singletonList(underscoreMessageConverter()));
        return restTemplate;
    }

    public static MappingJackson2HttpMessageConverter underscoreMessageConverter() {
        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
        builder.propertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);

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
