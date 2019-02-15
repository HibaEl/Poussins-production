/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.rest.converter;

import com.poussin.production.bean.User;
import com.poussin.production.commun.util.NumberUtil;
import com.poussin.production.rest.vo.UserVo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class UserVoConverter implements AbstractConverter<User, UserVo> {

    @Override
    public User toItem(UserVo userVo) {
        User user = new User();
        if (userVo != null) {

            user.setLogin(userVo.getLogin());
            user.setBloquer(NumberUtil.toInteger(userVo.getBloquer()));
            user.setNbConexion(NumberUtil.toInteger(userVo.getNbConexion()));
            user.setPassword(userVo.getPassword());
            user.setRole(new UserRoleVoConverter().toItem(userVo.getRoleVo()));
            user.setReference(userVo.getReference());
        }

        return user;
    }

    @Override
    public UserVo toVo(User user) {
        UserVo userVo = new UserVo();

        if (user != null) {

            userVo.setReference(user.getReference());
            userVo.setBloquer(NumberUtil.toStringInt(user.getBloquer()));
            userVo.setLogin(user.getLogin());
            userVo.setNbConexion(NumberUtil.toStringInt(user.getNbConexion()));
            userVo.setPassword(user.getPassword());
            userVo.setRoleVo(new UserRoleVoConverter().toVo(user.getRole()));
            userVo.setReference(user.getReference());
        }

        return userVo;
    }

    @Override
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
