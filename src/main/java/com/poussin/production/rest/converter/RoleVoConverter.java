/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.rest.converter;

import com.poussin.production.bean.Role;
import com.poussin.production.rest.vo.RoleVo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author LENOVO
 */
@Component
public class RoleVoConverter extends AbstractConverter<Role, RoleVo> {

    @Override
    public Role toItem(RoleVo RoleVo) {
        Role role = new Role();
        if (RoleVo != null) {
            role.setId(RoleVo.getId());
            role.setLibelle(RoleVo.getLibelle());
            role.setReference(RoleVo.getReference());
        }
        return role;
    }

    @Override
    public RoleVo toVo(Role Role) {
        RoleVo roleVo = new RoleVo();
        if (Role != null) {
            roleVo.setId(Role.getId());
            roleVo.setLibelle(Role.getLibelle());
            roleVo.setReference(Role.getReference());

        }
        return roleVo;
    }

    @Override
    public List<RoleVo> toVo(List<Role> roles) {
        List<RoleVo> roleVos = new ArrayList();
        if (roles != null && !roles.isEmpty()) {
            for (Role role : roles) {
                roleVos.add(toVo(role));
            }
        }
        return roleVos;
    }

    @Override
    public List<Role> toItem(List<RoleVo> roleVos) {
        List<Role> roles = new ArrayList();
        if (roleVos != null && !roleVos.isEmpty()) {
            for (RoleVo roleVo : roleVos) {
                roles.add(toItem(roleVo));
            }
        }
        return roles;
    }

}
