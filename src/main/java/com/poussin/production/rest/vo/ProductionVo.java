/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.rest.vo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Temporal;

/**
 *
 * @author LENOVO
 */
public class ProductionVo implements Serializable{
   private static final long serialVersionUID = 1L;
        

    private String reference;
    private double poids;
    private int nbrMort;
    private int nbrOeuf;
    private int nbrPoussinMale;
    private int nbrPoussinFemale;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateProduction;
    private String refFirme;
    private String refEvolution;

 

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public int getNbrMort() {
        return nbrMort;
    }

    public void setNbrMort(int nbrMort) {
        this.nbrMort = nbrMort;
    }

    public int getNbrOeuf() {
        return nbrOeuf;
    }

    public void setNbrOeuf(int nbrOeuf) {
        this.nbrOeuf = nbrOeuf;
    }

    public int getNbrPoussinMale() {
        return nbrPoussinMale;
    }

    public void setNbrPoussinMale(int nbrPoussinMale) {
        this.nbrPoussinMale = nbrPoussinMale;
    }

    public int getNbrPoussinFemale() {
        return nbrPoussinFemale;
    }

    public void setNbrPoussinFemale(int nbrPoussinFemale) {
        this.nbrPoussinFemale = nbrPoussinFemale;
    }

    public Date getDateProduction() {
        return dateProduction;
    }

    public void setDateProduction(Date dateProduction) {
        this.dateProduction = dateProduction;
    }

    public String getRefFirme() {
        return refFirme;
    }

    public void setRefFirme(String refFirme) {
        this.refFirme = refFirme;
    }

    public String getRefEvolution() {
        return refEvolution;
    }

    public void setRefEvolution(String refEvolution) {
        this.refEvolution = refEvolution;
    }
    
    
    
}
