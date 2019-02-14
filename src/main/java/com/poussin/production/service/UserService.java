/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.service;

import com.poussin.production.bean.User;

/**
 *
 * @author LENOVO
 */
public interface UserService {
        public User findByLogin(String login);
        public int createUser(User user);
    public int seconnecter(String login, String passeword);
     
   
}
