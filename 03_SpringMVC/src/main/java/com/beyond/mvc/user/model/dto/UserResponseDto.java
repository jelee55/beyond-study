package com.beyond.mvc.user.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
// @AllArgsConstructor
@RequiredArgsConstructor
public class UserResponseDto {
    private final int no;
    private final String username;
    @JsonIgnore
    private final String address;

}
