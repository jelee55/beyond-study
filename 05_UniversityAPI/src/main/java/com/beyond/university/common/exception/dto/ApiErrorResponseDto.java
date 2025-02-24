package com.beyond.university.common.exception.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString()
public class ApiErrorResponseDto {
    private int code;
    private String status;
    private String message;

    public ApiErrorResponseDto(int code, String status, String message) {
        this.code = code;
        this.status = status;
        this.message = message;
    }
}
