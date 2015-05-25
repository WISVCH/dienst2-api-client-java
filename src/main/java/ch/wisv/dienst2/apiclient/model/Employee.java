package ch.wisv.dienst2.apiclient.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Employee model
 */
@SuppressWarnings("unused")
public class Employee implements Serializable {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(person, employee.person) &&
                Objects.equals(faculty, employee.faculty) &&
                Objects.equals(department, employee.department) &&
                Objects.equals(function, employee.function) &&
                Objects.equals(phoneInternal, employee.phoneInternal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, faculty, department, function, phoneInternal);
    }
}
