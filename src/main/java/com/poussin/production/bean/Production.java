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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.reference);
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.poids) ^ (Double.doubleToLongBits(this.poids) >>> 32));
        hash = 59 * hash + this.nbrMort;
        hash = 59 * hash + Objects.hashCode(this.nbrOeuf);
        hash = 59 * hash + this.nbrPoussinMale;
        hash = 59 * hash + this.nbrPoussinFemale;
        hash = 59 * hash + Objects.hashCode(this.dateProduction);
        hash = 59 * hash + Objects.hashCode(this.refFirme);
        hash = 59 * hash + Objects.hashCode(this.refEvolution);
        hash = 59 * hash + Objects.hashCode(this.semaineProduction);
        hash = 59 * hash + Objects.hashCode(this.moisProduction);
        hash = 59 * hash + Objects.hashCode(this.anneeProduction);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Production other = (Production) obj;
        if (Double.doubleToLongBits(this.poids) != Double.doubleToLongBits(other.poids)) {
            return false;
        }
        if (this.nbrMort != other.nbrMort) {
            return false;
        }
        if (this.nbrPoussinMale != other.nbrPoussinMale) {
            return false;
        }
        if (this.nbrPoussinFemale != other.nbrPoussinFemale) {
            return false;
        }
        if (!Objects.equals(this.reference, other.reference)) {
            return false;
        }
        if (!Objects.equals(this.refFirme, other.refFirme)) {
            return false;
        }
        if (!Objects.equals(this.refEvolution, other.refEvolution)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.nbrOeuf, other.nbrOeuf)) {
            return false;
        }
        if (!Objects.equals(this.dateProduction, other.dateProduction)) {
            return false;
        }
        if (!Objects.equals(this.semaineProduction, other.semaineProduction)) {
            return false;
        }
        if (!Objects.equals(this.moisProduction, other.moisProduction)) {
            return false;
        }
        if (!Objects.equals(this.anneeProduction, other.anneeProduction)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Production{" + "id=" + id + ", reference=" + reference + ", poids=" + poids + ", nbrMort=" + nbrMort + ", nbrOeuf=" + nbrOeuf + ", nbrPoussinMale=" + nbrPoussinMale + ", nbrPoussinFemale=" + nbrPoussinFemale + ", dateProduction=" + dateProduction + ", refFirme=" + refFirme + ", refEvolution=" + refEvolution + ", semaineProduction=" + semaineProduction + ", moisProduction=" + moisProduction + ", anneeProduction=" + anneeProduction + '}';
    }

    

}
