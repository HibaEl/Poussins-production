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
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

/**
 *
 * @author LENOVO
 */
@Service
public class ProductionServiceImpl implements ProductionService{
@Autowired
private ProductionDao productionDao;
@Autowired
private ProductionService productionService;    


    @Override
    public int createProduction(Production production) {
Production p=findByReference(production.getReference());
        if(p!=null){ 
    return -1;
}
else{ 
    productionDao.save(production);
    return 1;
}
    }

    @Override
    public Production findByReference(String reference) {
return productionDao.findByReference(reference);
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
