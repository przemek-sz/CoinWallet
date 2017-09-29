package com.szczerbap.coinwallet.model;

import javax.persistence.Entity;

/**
 * Created by Przemek on 29.09.2017.
 */
@Entity
public class User {

    private Long id;
    private String userName;
    private String password;
    private String email;
}
