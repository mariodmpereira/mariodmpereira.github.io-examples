package com.mariodmpereira.openapi.usinggeneratedcode.controller;

import com.mariodmpereira.openapi.api.UserApi;
import com.mariodmpereira.openapi.model.UserDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController implements UserApi {

    @Override
    public ResponseEntity<UserDto> getUserById(Long userId) {
        final UserDto userDto = new UserDto()
                .id(1L)
                .name("Super Mário")
                .age(35);

        return userId.equals(userDto.getId())
                ? ResponseEntity.ok(userDto)
                : ResponseEntity.notFound().build();
    }
}