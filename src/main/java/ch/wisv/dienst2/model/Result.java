package ch.wisv.dienst2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.core.ParameterizedTypeReference;

import java.util.List;

/**
 * Result wrapper: metadata and multiple result objects
 */
@SuppressWarnings("unused")
public class Result<T> {

    private Meta meta;

    List<T> objects;

    public Meta getMeta() {
        return meta;
    }

    public List<T> getObjects() {
        return objects;
    }
}
