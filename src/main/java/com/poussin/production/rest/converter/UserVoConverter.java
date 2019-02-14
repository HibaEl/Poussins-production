/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.rest.converter;

import com.poussin.production.bean.User;
import com.poussin.production.rest.vo.UserVo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class UserVoConverter {
     public User toItem(UserVo userVo) {
        User user = new User();
        if (userVo != null) {

           if (userVo.getLogin()!= null) {
                user.setLogin(userVo.getLogin());
            }
            if (userVo.getBloquer()!= 0) {
                user.setBloquer(userVo.getBloquer());
            }
            if (userVo.getNbConexion()!= 0) {
                user.setNbConexion(userVo.getNbConexion());
            }if (userVo.getPassword()!= null) {
                user.setPassword(userVo.getPassword());
            }if (userVo.getRoleVo()!= null) {
                user.setRole(new UserRoleVoConverter().toItem(userVo.getRoleVo()));
            }if (userVo.getReference() != null) {
                user.setReference(userVo.getReference());
            }
           
        }
        return user;
    }

    public UserVo toVo(User user) {
        UserVo userVo = new UserVo();

        if (user != null) {
          
            if (user.getReference() != null) {
                userVo.setReference(user.getReference());
            }
            if (user.getBloquer()!= 0) {
                userVo.setBloquer(user.getBloquer());
            }
            if (user.getLogin()!= null) {
                userVo.setLogin(user.getLogin());
            }
            if (user.getNbConexion()!= 0) {
                userVo.setNbConexion(user.getNbConexion());
            }
            if (user.getPassword()!= null) {
                userVo.setPassword(user.getPassword());
            }
            if (user.getRole()!= null) {
                userVo.setRoleVo(new UserRoleVoConverter().toVo(user.getRole()));
            }
            if (user.getReference()!= null) {
                userVo.setReference(user.getReference());
            }
           
        }
        return userVo;
    }
    
     public List<UserVo> toVo(List<User> users) {
        List<UserVo> userVos = new ArrayList();
        if (users != null && !users.isEmpty()) {
            for (User user : users) {
                userVos.add(toVo(user));
            }
        }
        return userVos;
    }
}
