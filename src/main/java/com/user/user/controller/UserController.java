package com.user.user.controller;

import com.user.user.dto.UserRequestDto;
import com.user.user.dto.UserResponseDto;
import com.user.user.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping
    public ResponseEntity<?> getAllUsers(){
    List<UserResponseDto> userResponseDto=userService.getAllUser();
return  ResponseEntity.ok(userResponseDto);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Integer id){
        UserResponseDto userResponseDto=userService.getUserById(id);
        return  ResponseEntity.ok(userResponseDto);
    }

    @PostMapping
    public ResponseEntity<?> addUser(@RequestBody UserRequestDto userRequestDto){
        UserResponseDto userResponseDto=userService.save(userRequestDto);
        return ResponseEntity.ok(userResponseDto);



    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable Integer id){
       userService.deleteUserById(id);
        return  ResponseEntity.status(204).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(@RequestBody UserRequestDto userRequestDto, @PathVariable Integer id){
        UserResponseDto userResponseDto=userService.updateUser(userRequestDto,id);
        return ResponseEntity.ok(userResponseDto);



    }



}











