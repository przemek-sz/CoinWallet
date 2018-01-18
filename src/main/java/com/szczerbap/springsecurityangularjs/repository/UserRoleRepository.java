package com.szczerbap.springsecurityangularjs.repository;

import com.szczerbap.springsecurityangularjs.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Przemek on 03.10.2017.
 */
public interface UserRoleRepository extends JpaRepository<UserRole,Long> {

    public UserRole getByRole(String role);
}
