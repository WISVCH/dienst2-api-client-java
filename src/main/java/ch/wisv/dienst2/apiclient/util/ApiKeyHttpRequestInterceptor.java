package ch.wisv.dienst2.apiclient.util;

import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

/**
 * Request interceptor to add api key
 */
public class ApiKeyHttpRequestInterceptor implements ClientHttpRequestInterceptor {

    private String apiKey;

    public ApiKeyHttpRequestInterceptor(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        request.getHeaders().add("Authorization", "ApiKey " + apiKey);
        request.getHeaders().set("Accept", MediaType.APPLICATION_JSON_VALUE);
        return execution.execute(request, body);
    }
}
