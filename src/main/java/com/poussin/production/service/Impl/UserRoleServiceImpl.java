/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.service.Impl;

import com.poussin.production.bean.Role;
import com.poussin.production.bean.User;
import com.poussin.production.bean.UserRole;
import com.poussin.production.dao.UserRoleDao;
import com.poussin.production.service.UserRoleService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LENOVO
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleDao userRoleDao;

    @Override
    public int createUserRole(User user, List<UserRole> userRoles) {
        for (UserRole userRole : userRoles) {
            userRole.setUser(user);
            userRoleDao.save(userRole);

        }
        return 1;
    }

    public UserRoleDao getUserRoleDao() {
        return userRoleDao;
    }

    public void setUserRoleDao(UserRoleDao userRoleDao) {
        this.userRoleDao = userRoleDao;
    }

}
