package ch.wisv.dienst2.apiclient.model;

import java.net.URI;
import java.time.LocalDate;
import java.util.Optional;

/**
 * Person model
 */
// @JsonIgnoreProperties(ignoreUnknown = true)
@SuppressWarnings("unused")
public class Person extends Entity {
    private String titles;
    private String initials;
    private String firstname;
    private String preposition;
    private String surname;
    private String postfixTitles;

    private String phoneMobile;

    private String gender;
    private LocalDate birthdate;
    private boolean deceased;
    private String livingWith;

    private boolean mailAnnouncements;
    private boolean mailCompany;

    private String ldapUsername;
    private String netid;
    private String facebookId;

    private Optional<Member> member;
    private Optional<Student> student;
//    private Optional<Alumnus> alumnus;
//    private Optional<Employee> employee;
//    private List<CommitteeMembership> committees;

    public String getTitles() {
        return titles;
    }

    public String getInitials() {
        return initials;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getPreposition() {
        return preposition;
    }

    public String getSurname() {
        return surname;
    }

    public String getPostfixTitles() {
        return postfixTitles;
    }

    public String getPhoneMobile() {
        return phoneMobile;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public boolean isDeceased() {
        return deceased;
    }

    public String getLivingWith() {
        return livingWith;
    }

    public boolean isMailAnnouncements() {
        return mailAnnouncements;
    }

    public boolean isMailCompany() {
        return mailCompany;
    }

    public String getLdapUsername() {
        return ldapUsername;
    }

    public String getNetid() {
        return netid;
    }

    public String getFacebookId() {
        return facebookId;
    }

    public Optional<Member> getMember() {
        return member;
    }

    public Optional<Student> getStudent() {
        return student;
    }
}
