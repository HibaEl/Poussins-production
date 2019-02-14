/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.rest;

/**
 *
 * @author LENOVO
 */ 

import com.poussin.production.bean.User;
import com.poussin.production.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("users")
@RequestMapping({"/production/users"})
public class UserRest {
    @Autowired
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/")
    public int createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

   
    
}
