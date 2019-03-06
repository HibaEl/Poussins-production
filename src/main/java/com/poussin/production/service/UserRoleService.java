/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.service;

import com.poussin.production.bean.User;
import com.poussin.production.bean.UserRole;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public interface UserRoleService {
    public int createUserRole(User user ,List<UserRole>userRoles);
}
