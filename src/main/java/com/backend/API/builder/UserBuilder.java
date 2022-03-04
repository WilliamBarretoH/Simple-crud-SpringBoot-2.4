package com.backend.API.builder;



import com.backend.API.dto.UserDto;
import com.backend.domain.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserBuilder {

    public User buildUser(UserDto userDto){

        return User.builder()
                .name(userDto.getName())
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .build();
    }
}
