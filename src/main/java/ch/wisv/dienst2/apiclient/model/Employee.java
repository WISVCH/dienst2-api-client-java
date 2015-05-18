package ch.wisv.dienst2.apiclient.model;

/**
 * Employee model
 */
@SuppressWarnings("unused")
public class Employee {
    private int person;

    private String faculty;
    private String department;
    private String function;
    private String phoneInternal;

    public int getPerson() {
        return person;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getDepartment() {
        return department;
    }

    public String getFunction() {
        return function;
    }

    public String getPhoneInternal() {
        return phoneInternal;
    }
}
