/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Firme.bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Elitebook folio
 */
@Entity
public class Affectation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int nbrMale;
    private int nbrFemale;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateAffectation;
    private String refe;
    private String referenceImport;
    @ManyToOne
    Firme firme;
    
    

    public int getNbrMale() {
        return nbrMale;
    }

    public void setNbrMale(int nbrMale) {
        this.nbrMale = nbrMale;
    }

    public int getNbrFemale() {
        return nbrFemale;
    }

    public void setNbrFemale(int nbrFemale) {
        this.nbrFemale = nbrFemale;
    }

    public Date getDateAffectation() {
        return dateAffectation;
    }

    public void setDateAffectation(Date dateAffectation) {
        this.dateAffectation = dateAffectation;
    }

    public String getRefe() {
        return refe;
    }

    public void setRefe(String refe) {
        this.refe = refe;
    }

    public Firme getFirme() {
        return firme;
    }

    public void setFirme(Firme firme) {
        this.firme = firme;
    }

    public String getReferenceImport() {
        return referenceImport;
    }

    public void setReferenceImport(String referenceImport) {
        this.referenceImport = referenceImport;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Affectation)) {
            return false;
        }
        Affectation other = (Affectation) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.poussin.Firme.bean.Affectation[ id=" + id + " ]";
    }

}
