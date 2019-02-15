/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.rest.vo;

import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
public class UserVo implements Serializable {
  private static final long serialVersionUID = 1L;
    private String login;
    private String password;
    private String nbConexion;
    private String bloquer;
    private String reference;
    private UserRoleVo roleVo;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNbConexion() {
        return nbConexion;
    }

    public void setNbConexion(String nbConexion) {
        this.nbConexion = nbConexion;
    }

    public String getBloquer() {
        return bloquer;
    }

    public void setBloquer(String bloquer) {
        this.bloquer = bloquer;
    }

   

    public UserRoleVo getRoleVo() {
        return roleVo;
    }

    public void setRoleVo(UserRoleVo roleVo) {
        this.roleVo = roleVo;
    }
    
    
}
