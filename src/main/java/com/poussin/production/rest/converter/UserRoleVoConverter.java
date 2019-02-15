/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.rest.converter;

import com.poussin.production.bean.UserRole;
import com.poussin.production.rest.vo.UserRoleVo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class UserRoleVoConverter implements AbstractConverter<UserRole, UserRoleVo> {

    @Override
    public UserRole toItem(UserRoleVo userRoleVo) {
        UserRole userRole = new UserRole();
        if (userRoleVo != null) {

            userRole.setLibelle(userRoleVo.getLibelle());
            userRole.setReference(userRoleVo.getReference());

        }
        return userRole;
    }

    @Override
    public UserRoleVo toVo(UserRole userRole) {
        UserRoleVo userRoleVo = new UserRoleVo();

        if (userRole != null) {
            userRoleVo.setLibelle(userRole.getLibelle());
            userRoleVo.setReference(userRole.getReference());

        }
        return userRoleVo;
    }

    @Override
    public List<UserRoleVo> toVo(List<UserRole> userRoles) {
        List<UserRoleVo> userRoleVos = new ArrayList();
        if (userRoles != null && !userRoles.isEmpty()) {
            for (UserRole userRole : userRoles) {
                userRoleVos.add(toVo(userRole));
            }
        }
        return userRoleVos;
    }

}
