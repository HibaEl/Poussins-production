/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.service;

import com.poussin.production.bean.Production;

/**
 *
 * @author LENOVO
 */
public interface ProductionService {

    public Production findByReference(String reference);

    public int createProduction(Production production);

    public Double averagePoids(Integer semaine, String refFirme, Integer annee);

    public Double averageNbrOeuf(Integer anneeO, String refFirmeO, Integer semaineO);
}
