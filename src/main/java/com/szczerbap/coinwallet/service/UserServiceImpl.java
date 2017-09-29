package com.szczerbap.coinwallet.service;

import com.szczerbap.coinwallet.model.User;
import com.szczerbap.coinwallet.repository.UserRepository;
import com.szczerbap.coinwallet.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Przemek on 29.09.2017.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void addUser(User user) {
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

}
