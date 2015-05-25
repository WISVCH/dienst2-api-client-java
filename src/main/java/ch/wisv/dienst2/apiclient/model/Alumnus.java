package ch.wisv.dienst2.apiclient.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Alumnus model
 */
@SuppressWarnings("unused")
public class Alumnus implements Serializable {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumnus alumnus = (Alumnus) o;
        return Objects.equals(person, alumnus.person) &&
                Objects.equals(studyFirstYear, alumnus.studyFirstYear) &&
                Objects.equals(studyLastYear, alumnus.studyLastYear) &&
                Objects.equals(contactMethod, alumnus.contactMethod) &&
                Objects.equals(study, alumnus.study) &&
                Objects.equals(researchGroup, alumnus.researchGroup) &&
                Objects.equals(paper, alumnus.paper) &&
                Objects.equals(professor, alumnus.professor) &&
                Objects.equals(workCompany, alumnus.workCompany) &&
                Objects.equals(position, alumnus.position) &&
                Objects.equals(sector, alumnus.sector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, study, studyFirstYear, studyLastYear, researchGroup, paper, professor,
                workCompany, position, sector, contactMethod);
    }
}
