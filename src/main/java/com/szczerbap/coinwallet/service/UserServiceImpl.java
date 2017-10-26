package com.szczerbap.coinwallet.service;

import com.szczerbap.coinwallet.dto.UserDto;
import com.szczerbap.coinwallet.model.User;
import com.szczerbap.coinwallet.repository.UserRepository;
import com.szczerbap.coinwallet.repository.UserRoleRepository;
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
    BaseConverter<User,UserDto> baseConverter;

    @Override
    public void addUser(User user) {
        String DEFAULT_ROLE="ROLE_USER";
        user.getRoles().add(userRoleRepository.getByRole(DEFAULT_ROLE));
        userRepository.save(user);
        System.out.println("Break point!!!!");
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
    public List<UserDto> getAllUsers() {

        List<UserDto> usersDto=baseConverter.convertAll(userRepository.findAll());
        return usersDto;
    }

    @Override
    public User getByUserName(String username) {
        return userRepository.getByUserName(username);
    }
}
