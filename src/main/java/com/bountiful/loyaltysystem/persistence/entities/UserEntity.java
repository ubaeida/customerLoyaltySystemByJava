package com.bountiful.loyaltysystem.persistence.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public record UserEntity(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id,
        @NotNull(message = "Name can not be empty")
        @Size(message = "Minimum 3 characters required for the name", min = 3)
        String name,
        @NotNull(message = "surname can not be empty")
        @Size(message = "Minimum 3 characters required for the name", min = 3)
        String surname,
        @Email(message = "Email is required")
        @Pattern(regexp = ".+@.+\\\\..+", message = "Please provide a valid  email address")
        String email,
        @NotNull(message = "Password can not be empty")
        @Pattern(regexp = "/^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{6,}$/",
                message = "Password should be at least 6 characters and contains capital, small ,numbers and apical characters")
        String password,
        @NotNull(message = "Gender can not be empty")
        Gender gender,
        @NotNull(message = "Title can not be empty")
        Title title,
//      need to handle image upload
        @NotNull(message = "File is require to be an image ")
        String avatar
) {
}
