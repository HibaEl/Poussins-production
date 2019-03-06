/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.rest;

/**
 *
 * @author LENOVO
 */
import com.poussin.production.bean.Role;
import com.poussin.production.bean.User;
import com.poussin.production.bean.UserRole;
import com.poussin.production.rest.converter.RoleVoConverter;
import com.poussin.production.rest.converter.UserRoleVoConverter;
import com.poussin.production.rest.converter.UserVoConverter;
import com.poussin.production.rest.vo.RoleVo;
import com.poussin.production.rest.vo.UserRoleVo;
import com.poussin.production.rest.vo.UserVo;
import com.poussin.production.service.UserService;
import java.util.ArrayList;
import java.util.List;
import static org.hibernate.internal.util.collections.CollectionHelper.arrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping({"/production/users"})
public class UserRest {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public int createUser(@RequestBody UserVo userVo) {
        User user = new UserVoConverter().toItem(userVo);
        return userService.createUser(user, user.getUserRoles());
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public UserService getUserService() {
        return userService;
    }
}
