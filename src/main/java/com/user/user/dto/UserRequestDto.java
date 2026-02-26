package com.user.user.dto;


import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class UserRequestDto {

    private String name;
    private String surname;
    private String email;
    private String password;
}
