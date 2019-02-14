/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.rest.converter;

import com.poussin.production.bean.Production;
import com.poussin.production.rest.vo.ProductionVo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class ProductionVoConverter {
     public Production toItem(ProductionVo productionVo) {
        Production production = new Production();
        if (productionVo != null) {
            if (productionVo.getDateProduction() != null) {
                production.setDateProduction(productionVo.getDateProduction());
            }
            if (productionVo.getNbrMort()!= 0) {
                production.setNbrMort(productionVo.getNbrMort());
            }
           if (productionVo.getNbrOeuf()!= 0) {
                production.setNbrOeuf(productionVo.getNbrOeuf());
            }
            if (productionVo.getNbrPoussinFemale()!= 0) {
                production.setNbrPoussinFemale(productionVo.getNbrPoussinFemale());
            }
            if (productionVo.getNbrPoussinMale()!= 0) {
                production.setNbrPoussinMale(productionVo.getNbrPoussinMale());
            }
            if (productionVo.getPoids()!= 0) {
                production.setPoids(productionVo.getPoids());
            }
            if (productionVo.getRefEvolution()!= null) {
                production.setRefEvolution(productionVo.getRefEvolution());
            }
            if (productionVo.getRefFirme()!= null) {
                production.setRefFirme(productionVo.getRefFirme());
            }
            
            if (productionVo.getReference() != null) {
                production.setReference(productionVo.getReference());
            }
            
        }
        return production;
    }

    public ProductionVo toVo(Production production) {
        ProductionVo productionVo = new ProductionVo();

        if (production != null) {
            
            if (production.getReference() != null) {
                productionVo.setReference(production.getReference());
            }
            if (production.getDateProduction() != null) {
                productionVo.setDateProduction(production.getDateProduction());
            }
            if (production.getNbrMort()!= 0) {
                productionVo.setNbrMort(production.getNbrMort());
            }
           if (production.getNbrOeuf()!= 0) {
                productionVo.setNbrOeuf(production.getNbrOeuf());
            }
            if (production.getNbrPoussinFemale()!= 0) {
                productionVo.setNbrPoussinFemale(production.getNbrPoussinFemale());
            }
            if (production.getNbrPoussinMale()!= 0) {
                productionVo.setNbrPoussinMale(production.getNbrPoussinMale());
            }
            if (production.getPoids()!= 0) {
                productionVo.setPoids(production.getPoids());
            }
            if (production.getRefEvolution()!= null) {
                productionVo.setRefEvolution(production.getRefEvolution());
            }
            if (production.getRefFirme()!= null) {
                productionVo.setRefFirme(production.getRefFirme());
            }
            
        }
        return productionVo;
    }
    
     public List<ProductionVo> toVo(List<Production> productions) {
        List<ProductionVo> productionVos = new ArrayList();
        if (productions != null && !productions.isEmpty()) {
            for (Production production : productions) {
                productionVos.add(toVo(production));
            }
        }
        return productionVos;
    }
}
