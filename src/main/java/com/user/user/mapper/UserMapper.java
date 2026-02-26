package com.user.user.mapper;

import com.user.user.dto.UserRequestDto;
import com.user.user.dto.UserResponseDto;
import com.user.user.entity.User;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserMapper {


        // UserRequestDto -> User dönüşümü
        public User toUser(UserRequestDto dto) {
            if (dto == null) return null;

            User user = new User();
            user.setName(dto.getName());
            user.setSurname(dto.getSurname());
            user.setEmail(dto.getEmail());
            user.setPassword(dto.getPassword());
            return user;
        }

        // User -> UserResponseDto dönüşümü
        public UserResponseDto toUserResponseDto(User user) {
            if (user == null) return null;

            UserResponseDto dto = new UserResponseDto();
            dto.setId(user.getId());
            dto.setName(user.getName());
            dto.setSurname(user.getSurname());
            dto.setEmail(user.getEmail());
            dto.setCreatedDate(user.getCreatedDate());
            dto.setLastModifiedDate(user.getLastModifiedDate());
            return dto;
        }

        // List<User> -> List<UserResponseDto> dönüşümü
        public List<UserResponseDto> toUserResponseDtoList(List<User> users) {
            if (users == null) return null;

            return users.stream()
                    .map(this::toUserResponseDto)
                    .collect(Collectors.toList());
        }
    }
