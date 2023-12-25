package com.bountiful.loyaltysystem.persistence.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NotNull(message = "Name can not be empty")
    @Size(message = "Minimum 3 characters required for the name", min = 3)
    String name;
    @NotNull(message = "surname can not be empty")
    @Size(message = "Minimum 3 characters required for the name", min = 3)
    String surname;
    @Email(message = "Email is required")
    @Pattern(regexp = ".+@.+\\\\..+", message = "Please provide a valid  email address")
    String email;
    @NotNull(message = "Password can not be empty")
    @Pattern(regexp = "/^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{6,}$/",
            message = "Password should be at least 6 characters and contains capital; small ;numbers and apical characters")
    String password;

    @JsonDeserialize(using = GenderDeserializer.class)
    @JsonProperty()
    @NotNull(message = "Gender can not be empty")
    Gender gender;

    @NotNull(message = "Title can not be empty")
    Title title;
    //      need to handle image upload
    @NotNull(message = "File is require to be an image ")
    String avatar;
    @NotNull(message = "Phone number can not be empty")
    @Size(message = "Minimum 6 characters required for the phone!", min = 6)
    String phoneNumber;
    @NotNull(message = "Birthdate can not be empty")
    LocalDate birthdate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
}
