package com.szczerbap.coinwallet.repository;

import com.szczerbap.coinwallet.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Przemek on 29.09.2017.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    public User getByUserName(String username);
}
