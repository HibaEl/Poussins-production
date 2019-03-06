/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.rest;

/**
 *
 * @author LENOVO
 */ 

import com.poussin.production.bean.Production;
import com.poussin.production.rest.converter.ProductionVoConverter;
import com.poussin.production.rest.vo.ProductionVo;
import com.poussin.production.service.ProductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author LENOVO
 */
@RestController
@CrossOrigin(origins={"http://localhost:4200"})
@RequestMapping({"/production/productions"})
public class ProductionRest {
     @Autowired
     private ProductionService productionService;
    
   
@PostMapping("/")
    public int createProduction(@RequestBody ProductionVo productionVo) {
        Production production= new ProductionVoConverter().toItem(productionVo);
        return productionService.createProduction(production);
    }
@GetMapping("/semaineProduction/{semaine}/refFirme/{refFirme}/anneeProduction/{annee}")
    public Double averagePoids(@PathVariable Integer semaine,@PathVariable String refFirme,@PathVariable Integer annee) {
        return productionService.averagePoids(semaine,refFirme,annee);
    }
@GetMapping("/anneeO/{anneeO}/refFirmeO/{refFirmeO}/semaineO/{semaineO}")
    public Double averageNbrOeuf(@PathVariable Integer anneeO,@PathVariable String refFirmeO,@PathVariable Integer semaineO) {
        return productionService.averageNbrOeuf(anneeO, refFirmeO, semaineO);
    }
    
    
     public ProductionService getProductionService() {
        return productionService;
    }

    public void setProductionService(ProductionService productionService) {
        this.productionService = productionService;
    }
     
    
}
