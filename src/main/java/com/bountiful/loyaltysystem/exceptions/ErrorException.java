package com.bountiful.loyaltysystem.exceptions;

import java.util.List;

public class ErrorException extends RuntimeException {
    List<ErrorMessage> errors;

    public ErrorException(List<ErrorMessage> errors) {
        this.errors = errors;
    }

    public ErrorException(ErrorMessage error) {
        this.errors = List.of(error);
    }

}
