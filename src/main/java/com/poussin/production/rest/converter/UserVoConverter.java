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
import org.springframework.stereotype.Component;

/**
 *
 * @author LENOVO
 */
@Component
public class UserVoConverter extends AbstractConverter<User, UserVo> {

    @Override
    public User toItem(UserVo userVo) {
        User user = new User();
        if (userVo != null) {

            user.setLogin(userVo.getLogin());
            user.setGmail(userVo.getGmail());
            user.setBloquer(NumberUtil.toInteger(userVo.getBloquer()));
            user.setNbConexion(NumberUtil.toInteger(userVo.getNbConexion()));
            user.setPassword(userVo.getPassword());
            user.setReference(userVo.getReference());
            user.setUserRoles(new UserRoleVoConverter().toItem(userVo.getUserRoleVos()));
        }

        return user;
    }

    @Override
    public UserVo toVo(User user) {
        UserVo userVo = new UserVo();

        if (user != null) {

            userVo.setReference(user.getReference());
            userVo.setGmail(user.getGmail());
            userVo.setBloquer(NumberUtil.toStringInt(user.getBloquer()));
            userVo.setLogin(user.getLogin());
            userVo.setNbConexion(NumberUtil.toStringInt(user.getNbConexion()));
            userVo.setPassword(user.getPassword());
            userVo.setReference(user.getReference());
            userVo.setUserRoleVos(new UserRoleVoConverter().toVo(user.getUserRoles()));
        }

        return userVo;
    }

 
}
