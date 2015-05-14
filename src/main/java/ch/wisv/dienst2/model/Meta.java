package ch.wisv.dienst2.model;

/**
 * Metadata used for search results
 */
@SuppressWarnings("unused")
public class Meta {
    private int limit;
    private String next;
    private int offset;
    private String previous;
    private int totalCount;

    public int getLimit() {
        return limit;
    }

    public String getNext() {
        return next;
    }

    public int getOffset() {
        return offset;
    }

    public String getPrevious() {
        return previous;
    }

    public int getTotalCount() {
        return totalCount;
    }
}
