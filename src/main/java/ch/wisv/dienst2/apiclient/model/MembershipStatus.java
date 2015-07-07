package ch.wisv.dienst2.apiclient.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * MembershipStatus enum
 */
@SuppressWarnings("unused")
public enum MembershipStatus {
    NONE(0),
    DONATING(10),
    ALUMNUS(20),
    REGULAR(30),
    ASSOCIATE(40),
    MERIT(50),
    HONORARY(60);

    private final int value;

    MembershipStatus(int value) {
        this.value = value;
    }

    @JsonValue
    public int getValue() {
        return value;
    }

    @JsonCreator
    public static MembershipStatus forValue(int value) {
        for (MembershipStatus membershipStatus : MembershipStatus.values()) {
            if (membershipStatus.getValue() == value) {
                return membershipStatus;
            }
        }
        throw new IllegalArgumentException("Invalid MembershipStatus value: " + value);
    }
}
