/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.service;

import com.poussin.production.bean.Role;
import com.poussin.production.bean.User;
import com.poussin.production.bean.UserRole;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public interface UserService {

    public User findByLogin(String login);

    public int createUser(User user, List<UserRole> userRoles);

    public int seconnecter(String login, String passeword);
    
    public int motDePasseOublier(String Login);

}
