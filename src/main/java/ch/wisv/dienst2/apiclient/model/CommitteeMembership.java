package ch.wisv.dienst2.apiclient.model;

/**
 * Committee membership model
 */
@SuppressWarnings("unused")
public class CommitteeMembership {
    private int id;
    private int person;

    private String committee;
    private int board;
    private String position;

    public int getId() {
        return id;
    }

    public int getPerson() {
        return person;
    }

    public String getCommittee() {
        return committee;
    }

    public int getBoard() {
        return board;
    }

    public String getPosition() {
        return position;
    }
}
