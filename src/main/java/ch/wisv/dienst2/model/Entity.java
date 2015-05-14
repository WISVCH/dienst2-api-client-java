package ch.wisv.dienst2.model;

/**
 * Entity model
 */
@SuppressWarnings("unused")
public class Entity {
    private String streetName;
    private String houseNumber;
    private String address2;
    private String address3;
    private String postcode;
    private String city;
    private String country;
    private String email;

    private String phoneFixed;

    private boolean machazine;
    private boolean constitutionCard;
    private boolean christmasCard;
    private boolean yearbook;

    private String comment;

    public String getStreetName() {
        return streetName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getAddress2() {
        return address2;
    }

    public String getAddress3() {
        return address3;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneFixed() {
        return phoneFixed;
    }

    public boolean isMachazine() {
        return machazine;
    }

    public boolean isConstitutionCard() {
        return constitutionCard;
    }

    public boolean isChristmasCard() {
        return christmasCard;
    }

    public boolean isYearbook() {
        return yearbook;
    }

    public String getComment() {
        return comment;
    }
}
