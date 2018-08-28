package ch.wisv.dienst2.apiclient.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * Member model
 */
@SuppressWarnings("unused")
public class Student implements Serializable {
    private int person;

    private String study;
    private int firstYear;
    private String studentNumber;
    private boolean graduated;

    private String emergencyName;
    private String emergencyPhone;

    private boolean yearbookPermission;

    private LocalDate dateVerified;

    public int getPerson() {
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

    public String getEmergencyName() {
        return emergenceName;
    }
	
    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    public boolean isYearbookPermission() {
        return yearbookPermission;
    }

    public LocalDate getDateVerified() {
        return dateVerified;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(person, student.person) &&
                Objects.equals(firstYear, student.firstYear) &&
                Objects.equals(graduated, student.graduated) &&
                Objects.equals(yearbookPermission, student.yearbookPermission) &&
                Objects.equals(study, student.study) &&
                Objects.equals(studentNumber, student.studentNumber) &&
                Objects.equals(emergencyName, student.emergencyName) &&
                Objects.equals(emergencyPhone, student.emergencyPhone) &&
                Objects.equals(dateVerified, student.dateVerified);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, study, firstYear, studentNumber, graduated, emergencyName, emergencyPhone, yearbookPermission,
                dateVerified);
    }
}
