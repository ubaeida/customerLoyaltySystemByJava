package com.bountiful.loyaltysystem.persistence.entities;

import jakarta.validation.ConstraintViolationException;
import jakarta.validation.constraints.Size;

public class CompanyEntity {
    private Long id;
    @Size
    private String name;
    private String address;

    /**
     * @param name
     * @throws IllegalArgumentException
     *             if name length is >=3
     *
     */
    private void setName(String name){
        if (name.length() <= 3) {
            throw new ConstraintViolationException("name is not enough",null);
        }
    }

}

