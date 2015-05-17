package ch.wisv.dienst2.apiclient.model;

import java.net.URI;
import java.util.List;

/**
 * Result wrapper: metadata and multiple result objects
 */
@SuppressWarnings("unused")
public class Results<T> {

    private int count;
    private URI next;
    private URI previous;

    List<T> results;

    public int getCount() {
        return count;
    }

    public URI getNext() {
        return next;
    }

    public URI getPrevious() {
        return previous;
    }

    public List<T> getResults() {
        return results;
    }
}
