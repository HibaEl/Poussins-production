/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.service.Impl;

import com.poussin.production.bean.User;
import com.poussin.production.bean.UserRole;
import com.poussin.production.dao.UserDao;
import com.poussin.production.dao.UserRoleDao;
import com.poussin.production.service.UserRoleService;
import com.poussin.production.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LENOVO
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private UserRoleDao userRoleDao;
    @Autowired
    private UserRoleService userRoleService;

    @Override
    public int seconnecter(String login, String passeword) {
        User user = findByLogin(login);
        if (user == null) {
            return -1;
        } else if (user.getBloquer() == 1) {
            return -2;
        } else if (!user.getPassword().equals(passeword)) {
            if (user.getNbConexion() > 0) {
                user.setNbConexion(user.getNbConexion() - 1);
            }
            if (user.getNbConexion() == 0) {
                user.setBloquer(1);
                userDao.save(user);
                return -3;
            }
            userDao.save(user);

            return -4;
        } else {
            return 1;
        }
    }

    @Override
    public User findByLogin(String login) {
        return userDao.findByLogin(login);
    }

    @Override
    public int createUser(User user,  List<UserRole> UserRoles) {
        User u = findByLogin(user.getLogin());
        if (u != null) {
            return -1;
        } else {
            user.setBloquer(0);
            user.setNbConexion(3);
            userDao.save(user);
            userRoleService.createUserRole(user, UserRoles);
            return 1;
        }
    }
@Override
    public int motDePasseOublier(String Login) {
        User user=userDao.findByLogin(Login);
        if(user==null)return -1;
        else{
        String gmail=user.getGmail();
        String password=user.getPassword();
        return 1;
        }
    }
    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserRoleDao getUserRoleDao() {
        return userRoleDao;
    }

    public void setUserRoleDao(UserRoleDao userRoleDao) {
        this.userRoleDao = userRoleDao;
    }

    public UserRoleService getUserRoleService() {
        return userRoleService;
    }

    public void setUserRoleService(UserRoleService userRoleService) {
        this.userRoleService = userRoleService;
    }

    

}
