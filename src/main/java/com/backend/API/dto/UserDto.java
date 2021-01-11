package com.backend.API.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {

    private Long id;
    private String name;
    private String email;
    private String password;
}
