package ch.wisv.dienst2.apiclient.model;

/**
 * Alumnus model
 */
@SuppressWarnings("unused")
public class Alumnus {
    private int person;

    private String study;
    private int studyFirstYear;
    private int studyLastYear;
    private String researchGroup;
    private String paper;
    private String professor;

    private String workCompany;
    private String position;
    private String sector;

    private char contactMethod;

    public int getPerson() {
        return person;
    }

    public String getStudy() {
        return study;
    }

    public int getStudyFirstYear() {
        return studyFirstYear;
    }

    public int getStudyLastYear() {
        return studyLastYear;
    }

    public String getResearchGroup() {
        return researchGroup;
    }

    public String getPaper() {
        return paper;
    }

    public String getProfessor() {
        return professor;
    }

    public String getWorkCompany() {
        return workCompany;
    }

    public String getPosition() {
        return position;
    }

    public String getSector() {
        return sector;
    }

    public char getContactMethod() {
        return contactMethod;
    }
}
