package com.user.user.service;

import com.user.user.dto.UserRequestDto;
import com.user.user.dto.UserResponseDto;
import com.user.user.entity.User;
import com.user.user.mapper.UserMapper;
import com.user.user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserMapper userMapper;
    private final UserRepository userRepository;

    public UserService(UserMapper userMapper, UserRepository userRepository) {
        this.userMapper = userMapper;
        this.userRepository = userRepository;
    }


    public List<UserResponseDto> getAllUser() {
        return userMapper.toUserResponseDtoList(userRepository.findAll());

    }

    public UserResponseDto getUserById(Integer id) {
        return userMapper.toUserResponseDto(userRepository.findById(id).get());


    }

    public UserResponseDto save(UserRequestDto userRequestDto) {
        User user = userMapper.toUser(userRequestDto);
        User savedUser = userRepository.save(user);
        return userMapper.toUserResponseDto(savedUser);

    }

    public void deleteUserById(Integer id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        userRepository.delete(user);

    }

    public UserResponseDto updateUser(UserRequestDto userRequestDto, Integer id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        user.setName(userRequestDto.getName());
        user.setSurname(userRequestDto.getSurname());
        user.setEmail(userRequestDto.getEmail());
        User updatedUser = userRepository.save(user);
        return userMapper.toUserResponseDto(updatedUser);
    }
}