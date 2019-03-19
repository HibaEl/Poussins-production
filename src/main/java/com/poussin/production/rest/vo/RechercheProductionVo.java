/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.rest.vo;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author LENOVO
 */
public class RechercheProductionVo implements Serializable {

    private static final long serialVersionUID = 1L;

  
    private String refFirme;
    
    private String semaine;
    
    private String annee;

    public String getRefFirme() {
        return refFirme;
    }

    public void setRefFirme(String refFirme) {
        this.refFirme = refFirme;
    }

    public String getSemaine() {
        return semaine;
    }

    public void setSemaine(String semaine) {
        this.semaine = semaine;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    

   

    

   
   
   

}
