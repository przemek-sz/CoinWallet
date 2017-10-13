package com.szczerbap.coinwallet.service;

import com.szczerbap.coinwallet.model.User;
import com.szczerbap.coinwallet.model.UserRole;
import com.szczerbap.coinwallet.repository.UserRepository;
import com.szczerbap.coinwallet.repository.UserRoleRepository;
import com.szczerbap.coinwallet.service.UserService;
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

    @Override
    public void addUser(User user) {
        String DEFAULT_ROLE="ROLE_USER";
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
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getByUserName(String username) {
        return userRepository.getByUserName(username);
    }
}
