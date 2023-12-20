package com.bountiful.loyaltysystem.persistence.entities;

public enum Gender {
    MALE("MAlE"), FEMALE("FEMALE"), UNKNOWN("UNKNOWN");
    String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Gender{" + "gender='" + gender + '\'' + '}';
    }
}
