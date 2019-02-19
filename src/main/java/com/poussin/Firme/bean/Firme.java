/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Firme.bean;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Elitebook folio
 */
@Entity
public class Firme implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private int capacite;
    private int nbrPoussinMale;
    private int nbrPoussinFemale;
    private int totalPoussin;
    private int placeRestant;
    private String reference;
    @OneToMany(mappedBy = "firme")
    private List<Affectation> affectations;

    @JsonIgnore
    public List<Affectation> getAffectations() {
        return affectations;
    }

    @JsonSetter
    public void setAffectations(List<Affectation> affectations) {
        this.affectations = affectations;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {           
        this.nom = nom;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
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

    public int getTotalPoussin() {
        return totalPoussin;
    }

    public void setTotalPoussin(int totalPoussin) {
        this.totalPoussin = totalPoussin;
    }

    public int getPlaceRestant() {
        return placeRestant;
    }

    public void setPlaceRestant(int placeRestant) {
        this.placeRestant = placeRestant;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
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
        if (!(object instanceof Firme)) {
            return false;
        }
        Firme other = (Firme) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.poussin.Firme.bean.Firme[ id=" + id + " ]";
    }

}
