package com.bountiful.loyaltysystem.persistence.entities;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = GenderDeserializer.class)
public enum Gender {
    MALE("MALE"), FEMALE("FEMALE"), UNKNOWN("UNKNOWN");
    String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Gender{" + "gender='" + gender + '\'' + '}';
    }
}
