package ch.wisv.dienst2.apiclient.model;

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
