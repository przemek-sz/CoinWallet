package com.szczerbap.springsecurityangularjs.service;

import com.szczerbap.springsecurityangularjs.dto.UserRegistrationDto;
import com.szczerbap.springsecurityangularjs.model.User;
import org.springframework.stereotype.Service;

/**
 * Created by Przemek on 26.10.2017.
 */
@Service
public class DtoToUserConverter implements BaseConverter<UserRegistrationDto,User>{


    @Override
    public User convert(UserRegistrationDto from) {

        User user=new User();

        user.setUserName(from.getUserName());
        user.setEmail(from.getEmail());
        user.setPassword(from.getPassword());

        return user;
    }
}
