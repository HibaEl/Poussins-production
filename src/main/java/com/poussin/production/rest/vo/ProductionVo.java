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
public class ProductionVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String reference;
    private String poids;
    private String nbrMort;
    private String nbrOeuf;
    private String nbrPoussinMale;
    private String nbrPoussinFemale;
    private String dateProduction;
    private String refFirme;
    private String refEvolution;
    private String semaineProduction;
    private String moisProduction;
    private String anneeProduction;

    public String getAnneeProduction() {
        return anneeProduction;
    }

    public void setAnneeProduction(String anneeProduction) {
        this.anneeProduction = anneeProduction;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getPoids() {
        return poids;
    }

    public void setPoids(String poids) {
        this.poids = poids;
    }

    public String getNbrMort() {
        return nbrMort;
    }

    public void setNbrMort(String nbrMort) {
        this.nbrMort = nbrMort;
    }

    public String getNbrOeuf() {
        return nbrOeuf;
    }

    public void setNbrOeuf(String nbrOeuf) {
        this.nbrOeuf = nbrOeuf;
    }

    public String getNbrPoussinMale() {
        return nbrPoussinMale;
    }

    public void setNbrPoussinMale(String nbrPoussinMale) {
        this.nbrPoussinMale = nbrPoussinMale;
    }

    public String getNbrPoussinFemale() {
        return nbrPoussinFemale;
    }

    public void setNbrPoussinFemale(String nbrPoussinFemale) {
        this.nbrPoussinFemale = nbrPoussinFemale;
    }

    public String getDateProduction() {
        return dateProduction;
    }

    public void setDateProduction(String dateProduction) {
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

    public String getSemaineProduction() {
        return semaineProduction;
    }

    public void setSemaineProduction(String semaineProduction) {
        this.semaineProduction = semaineProduction;
    }

    public String getMoisProduction() {
        return moisProduction;
    }

    public void setMoisProduction(String moisProduction) {
        this.moisProduction = moisProduction;
    }

   
   

}
