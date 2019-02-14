/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.service.Impl;

import com.poussin.production.bean.User;
import com.poussin.production.dao.UserDao;
import com.poussin.production.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author LENOVO
 */@Service
public class UserServiceImpl implements UserService{
    @Autowired
     private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    
    
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
    public int createUser(User user) {
  User u=findByLogin(user.getLogin());
  if(u!=null){
  return -1;
}
else{
  userDao.save(user);
  return 1;
}

    }
    
}
