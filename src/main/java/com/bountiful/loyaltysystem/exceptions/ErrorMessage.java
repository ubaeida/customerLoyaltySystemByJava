package com.bountiful.loyaltysystem.exceptions;

import org.springframework.http.HttpStatus;

public record ErrorMessage(String message, ErrorCode code) {


}
