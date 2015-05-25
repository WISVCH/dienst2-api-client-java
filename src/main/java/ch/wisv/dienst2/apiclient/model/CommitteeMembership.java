package ch.wisv.dienst2.apiclient.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Committee membership model
 */
@SuppressWarnings("unused")
public class CommitteeMembership implements Serializable {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommitteeMembership that = (CommitteeMembership) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(person, that.person) &&
                Objects.equals(board, that.board) &&
                Objects.equals(committee, that.committee) &&
                Objects.equals(position, that.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, person, committee, board, position);
    }
}
