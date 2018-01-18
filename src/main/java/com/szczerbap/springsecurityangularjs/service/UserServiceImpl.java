package com.szczerbap.springsecurityangularjs.service;

import com.szczerbap.springsecurityangularjs.dto.AllUserDto;
import com.szczerbap.springsecurityangularjs.dto.UserRegistrationDto;
import com.szczerbap.springsecurityangularjs.model.User;
import com.szczerbap.springsecurityangularjs.repository.UserRepository;
import com.szczerbap.springsecurityangularjs.repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Przemek on 29.09.2017.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    UserRoleRepository userRoleRepository;
    @Autowired
    BaseConverter<User, AllUserDto> baseConverter;
    @Autowired
    BaseConverter<UserRegistrationDto,User> registrationBaseConverter;

    @Override
    public void addUser(UserRegistrationDto userDto) {

        String DEFAULT_ROLE="ROLE_USER";

        User user=new User();

        user=registrationBaseConverter.convert(userDto);
        user.getRoles().add(userRoleRepository.getByRole(DEFAULT_ROLE));

        userRepository.save(user);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void removeUser(User user) {
        userRepository.delete(user);
    }

    @Override
    public List<AllUserDto> getAllUsers() {

        List<AllUserDto> usersDto=baseConverter.convertAll(userRepository.findAll());
        return usersDto;
    }

    @Override
    public User getByUserName(String username) {
        return userRepository.getByUserName(username);
    }
}
