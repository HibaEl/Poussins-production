/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.rest.converter;

import com.poussin.production.bean.Production;
import com.poussin.production.commun.util.NumberUtil;
import com.poussin.production.rest.vo.ProductionVo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class ProductionVoConverter implements AbstractConverter<Production, ProductionVo> {

    @Override
    public Production toItem(ProductionVo productionVo) {
        Production production = new Production();
        if (productionVo != null) {

            production.setNbrMort(NumberUtil.toInteger(productionVo.getNbrMort()));
            production.setNbrOeuf(NumberUtil.toInteger(productionVo.getNbrOeuf()));
            production.setNbrPoussinFemale(NumberUtil.toInteger(productionVo.getNbrPoussinFemale()));
            production.setNbrPoussinMale(NumberUtil.toInteger(productionVo.getNbrPoussinMale()));
            production.setPoids(NumberUtil.toDouble(productionVo.getPoids()));
            production.setRefEvolution(productionVo.getRefEvolution());
            production.setRefFirme(productionVo.getRefFirme());
            production.setReference(productionVo.getReference());

        }
        return production;
    }

    @Override
    public ProductionVo toVo(Production production) {
        ProductionVo productionVo = new ProductionVo();

        if (production != null) {

            productionVo.setReference(production.getReference());
            productionVo.setNbrMort(NumberUtil.toStringInt(production.getNbrMort()));
            productionVo.setNbrOeuf(NumberUtil.toStringInt(production.getNbrOeuf()));
            productionVo.setNbrPoussinFemale(NumberUtil.toStringInt(production.getNbrPoussinFemale()));
            productionVo.setNbrPoussinMale(NumberUtil.toStringInt(production.getNbrPoussinMale()));
            productionVo.setPoids(NumberUtil.toStringDouble(production.getPoids()));
            productionVo.setRefEvolution(production.getRefEvolution());
            productionVo.setRefFirme(production.getRefFirme());

        }
        return productionVo;
    }

    @Override
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
