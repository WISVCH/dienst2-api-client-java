package ch.wisv.dienst2.apiclient.model;

import java.io.Serializable;
import java.net.URI;
import java.util.List;
import java.util.Objects;

/**
 * Result wrapper: metadata and multiple result objects
 */
@SuppressWarnings("unused")
public class Results<T> implements Serializable {

    private int count;
    private URI next;
    private URI previous;

    private List<T> results;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Results<?> results1 = (Results<?>) o;
        return Objects.equals(count, results1.count) &&
                Objects.equals(next, results1.next) &&
                Objects.equals(previous, results1.previous) &&
                Objects.equals(results, results1.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, next, previous, results);
    }
}
