/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author LENOVO
 */
@Entity
public class Production implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private double poids;
    private int nbrMort;
    private Integer nbrOeuf;
    private int nbrPoussinMale;
    private int nbrPoussinFemale;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateProduction;
    private String refFirme;
    private String refEvolution;
    private Integer semaineProduction;
    private Integer moisProduction;
    private Integer anneeProduction;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Integer getNbrOeuf() {
        return nbrOeuf;
    }

    public void setNbrOeuf(Integer nbrOeuf) {
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

    public Integer getSemaineProduction() {
        return semaineProduction;
    }

    public void setSemaineProduction(Integer semaineProduction) {
        this.semaineProduction = semaineProduction;
    }

    public Integer getMoisProduction() {
        return moisProduction;
    }

    public void setMoisProduction(Integer moisProduction) {
        this.moisProduction = moisProduction;
    }

    public Integer getAnneeProduction() {
        return anneeProduction;
    }

    public void setAnneeProduction(Integer anneeProduction) {
        this.anneeProduction = anneeProduction;
    }

    

    

}
