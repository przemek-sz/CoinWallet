package com.szczerbap.coinwallet.config;

import com.szczerbap.coinwallet.service.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * Created by Przemek on 03.10.2017.
 */
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    @Qualifier("customUserDetailsServicr")
    CustomUserDetailsService customUserDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin();
    }
}
