/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.service.Impl;

import com.poussin.production.bean.Production;
import com.poussin.production.dao.ProductionDao;
import com.poussin.production.service.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Calendar;

/**
 *
 * @author LENOVO
 */
@Service
public class ProductionServiceImpl implements ProductionService {

    @Autowired
    private ProductionDao productionDao;
    @Autowired
    private ProductionService productionService;

    @Override
    public int createProduction(Production production) {
        Production p = findByReference(production.getReference());
        if (p != null) {
            return -1;
        } else {

            Calendar cal = Calendar.getInstance();
            cal.setTime(production.getDateProduction());
            int week = cal.get(Calendar.WEEK_OF_YEAR);
            int year = cal.get(Calendar.YEAR);
            int month = cal.get(Calendar.MONTH);
            production.setSemaineProduction(week);
            production.setMoisProduction(month + 1);
            production.setAnneeProduction(year);
            productionDao.save(production);
            return 1;
        }
    }

    @Override
    public Production findByReference(String reference) {
        return productionDao.findByReference(reference);
    }

    @Override
    public Double averagePoids(Integer semaine, String refFirme, Integer annee) {
        return productionDao.averagePoids(semaine, refFirme, annee);

    }

    @Override
    public Double averageNbrOeuf(Integer anneeO, String refFirmeO, Integer semaineO) {
        return productionDao.averageNbrOeuf(anneeO, refFirmeO, semaineO);
    }

    public ProductionDao getProductionDao() {
        return productionDao;
    }

    public void setProductionDao(ProductionDao productionDao) {
        this.productionDao = productionDao;
    }

    public ProductionService getProductionService() {
        return productionService;
    }

    public void setProductionService(ProductionService productionService) {
        this.productionService = productionService;
    }

}
