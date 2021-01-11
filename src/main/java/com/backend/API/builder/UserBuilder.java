package com.backend.API.builder;



import com.backend.API.dto.UserDto;
import com.backend.domain.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserBuilder {

    private User user;

    public User buildUser(UserDto userDto){

        return user = User.builder()
                .name(userDto.getName())
                .email(userDto.getEmail())
                .password(userDto.getPassword())
                .build();
    }
}
