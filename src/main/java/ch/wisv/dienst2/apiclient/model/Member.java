package ch.wisv.dienst2.apiclient.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * Member model
 */
@SuppressWarnings("unused")
public class Member implements Serializable {
    private int person;

    private LocalDate dateFrom;
    private LocalDate dateTo;
    private LocalDate datePaid;
    private int amountPaid;

    private boolean currentMember;
    private boolean currentAssociateMember;
    private boolean currentDonatingMember;
    private boolean currentMeritMember;
    private boolean currentHonoraryMember;

    private LocalDate meritDateFrom;
    private boolean meritInvitations;
    private String meritHistory;

    private LocalDate honoraryDateFrom;

    public int getPerson() {
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

    public boolean isCurrentMember() {
        return currentMember;
    }

    public boolean isCurrentAssociateMember() {
        return currentAssociateMember;
    }

    public boolean isCurrentDonatingMember() {
        return currentDonatingMember;
    }

    public boolean isCurrentMeritMember() {
        return currentMeritMember;
    }

    public boolean isCurrentHonoraryMember() {
        return currentHonoraryMember;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(person, member.person) &&
                Objects.equals(amountPaid, member.amountPaid) &&
                Objects.equals(currentMember, member.currentMember) &&
                Objects.equals(currentAssociateMember, member.currentAssociateMember) &&
                Objects.equals(currentDonatingMember, member.currentDonatingMember) &&
                Objects.equals(currentMeritMember, member.currentMeritMember) &&
                Objects.equals(currentHonoraryMember, member.currentHonoraryMember) &&
                Objects.equals(meritInvitations, member.meritInvitations) &&
                Objects.equals(dateFrom, member.dateFrom) &&
                Objects.equals(dateTo, member.dateTo) &&
                Objects.equals(datePaid, member.datePaid) &&
                Objects.equals(meritDateFrom, member.meritDateFrom) &&
                Objects.equals(meritHistory, member.meritHistory) &&
                Objects.equals(honoraryDateFrom, member.honoraryDateFrom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, dateFrom, dateTo, datePaid, amountPaid, currentMember, currentAssociateMember,
                currentDonatingMember, currentMeritMember, currentHonoraryMember, meritDateFrom, meritInvitations,
                meritHistory, honoraryDateFrom);
    }
}
