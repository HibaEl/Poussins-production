/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.rest.converter;

import com.poussin.production.bean.UserRole;
import com.poussin.production.commun.util.DateUtil;
import com.poussin.production.rest.vo.UserRoleVo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;


/**
 *
 * @author LENOVO
 */
@Component
public class UserRoleVoConverter extends AbstractConverter<UserRole, UserRoleVo> {

    @Override
    public UserRole toItem(UserRoleVo userRoleVo) {
       UserRole userRole = new UserRole();
        if (userRoleVo != null) {
            userRole.setId(userRoleVo.getId());
            userRole.setUser(new UserVoConverter().toItem(userRoleVo.getUserVo()));
            userRole.setRole(new RoleVoConverter().toItem(userRoleVo.getRoleVo()));
            userRole.setDateAffectation(DateUtil.parse(userRoleVo.getDateAffectation()));
            
        }
        return userRole;
    }

    @Override
    public UserRoleVo toVo(UserRole userRole) {
          UserRoleVo userRoleVo = new UserRoleVo();
        
        if (userRole != null) {
            userRoleVo.setId(userRole.getId());
            userRoleVo.setRoleVo(new RoleVoConverter().toVo(userRole.getRole()));
            userRoleVo.setUserVo(new UserVoConverter().toVo(userRole.getUser()));
            userRoleVo.setDateAffectation(DateUtil.formateDate("yyyy-MM-dd",userRole.getDateAffectation()));
         
        }
        return userRoleVo;
    }


}

    
  
    
