package ch.wisv.dienst2.model;

import java.time.LocalDate;

/**
 * Member model
 */
@SuppressWarnings("unused")
public class Student {
    private String person;

    private String study;
    private int firstYear;
    private String studentNumber;
    private boolean graduated;

    private String phoneParents;

    private boolean yearbookPermission;

    private LocalDate dateVerified;

    public String getPerson() {
        return person;
    }

    public String getStudy() {
        return study;
    }

    public int getFirstYear() {
        return firstYear;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public boolean isGraduated() {
        return graduated;
    }

    public String getPhoneParents() {
        return phoneParents;
    }

    public boolean isYearbookPermission() {
        return yearbookPermission;
    }

    public LocalDate getDateVerified() {
        return dateVerified;
    }
}
