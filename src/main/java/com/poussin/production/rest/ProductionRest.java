/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.rest;

import com.poussin.production.bean.Production;
import com.poussin.production.service.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LENOVO
 */@RestController("productions")
@RequestMapping({"/production/productions"})
public class ProductionRest {
     @Autowired
     private ProductionService productionService;
    
    public ProductionService getProductionService() {
        return productionService;
    }

    public void setProductionService(ProductionService productionService) {
        this.productionService = productionService;
    }
@PostMapping("/")
    public int createProduction(@RequestBody Production production) {
        return productionService.createProduction(production);
    }
    
     
    
}
