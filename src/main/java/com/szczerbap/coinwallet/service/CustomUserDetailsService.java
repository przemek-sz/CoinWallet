package com.szczerbap.coinwallet.service;

import com.szczerbap.coinwallet.model.User;
import com.szczerbap.coinwallet.model.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Przemek on 03.10.2017.
 */
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        User user = userService.getByUserName(userName);
        if(userName==null) throw new UsernameNotFoundException("User not found");

        org.springframework.security.core.userdetails.User userDetails=
                new org.springframework.security.core.userdetails.User(
                        user.getEmail(),
                        user.getPassword(),
                        coonvertAuthorities(user.getRoles())
                );
        return userDetails;
    }

    private Set<GrantedAuthority> coonvertAuthorities(Set<UserRole> userRoles){

        Set<GrantedAuthority> authorities=new HashSet<>();
        for (UserRole userRole : userRoles){
            authorities.add(new SimpleGrantedAuthority(userRole.getRole()));
        }

        return authorities;
    }
}
