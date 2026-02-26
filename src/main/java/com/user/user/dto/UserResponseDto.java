package com.user.user.dto;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponseDto {
    private  Integer id;
    private String name;
    private String surname;
    private String email;
    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;

}
