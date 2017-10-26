package com.szczerbap.coinwallet.service;

import com.szczerbap.coinwallet.dto.UserDto;
import com.szczerbap.coinwallet.model.User;
import org.springframework.stereotype.Service;

/**
 * Created by Przemek on 26.10.2017.
 */
@Service
public class UserToDtoConverter implements BaseConverter<User,UserDto> {

    @Override
    public UserDto convert(User from) {

        UserDto userDto= new UserDto();
        userDto.setId(from.getId());
        userDto.setUserName(from.getUserName());
        userDto.setEmail(from.getEmail());

        return userDto;
    }
}
