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
public class PricingOeufVo implements Serializable {
   private static final long serialVersionUID = 1L;
    private String reference; 
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateMin;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateMax;
    private double prix;

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getDateMin() {
        return dateMin;
    }

    public void setDateMin(Date dateMin) {
        this.dateMin = dateMin;
    }

    public Date getDateMax() {
        return dateMax;
    }

    public void setDateMax(Date dateMax) {
        this.dateMax = dateMax;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    
    
}
