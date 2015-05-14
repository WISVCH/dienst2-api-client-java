package ch.wisv.dienst2.apiclient.model;

import java.time.LocalDate;

/**
 * Member model
 */
@SuppressWarnings("unused")
public class Member {
    private String person;

    private LocalDate dateFrom;
    private LocalDate dateTo;
    private LocalDate datePaid;
    private int amountPaid;

    private boolean associateMember;
    private boolean donatingMember;

    private LocalDate meritDateFrom;
    private boolean meritInvitations;
    private String meritHistory;

    private LocalDate honoraryDateFrom;

    public String getPerson() {
        return person;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public LocalDate getDatePaid() {
        return datePaid;
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    public boolean isAssociateMember() {
        return associateMember;
    }

    public boolean isDonatingMember() {
        return donatingMember;
    }

    public LocalDate getMeritDateFrom() {
        return meritDateFrom;
    }

    public boolean isMeritInvitations() {
        return meritInvitations;
    }

    public String getMeritHistory() {
        return meritHistory;
    }

    public LocalDate getHonoraryDateFrom() {
        return honoraryDateFrom;
    }
}
