/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.rest.converter;

import com.poussin.production.bean.PricingOeuf;
import com.poussin.production.rest.vo.PricingOeufVo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class PricingOeufVoconverter {
   public PricingOeuf toItem(PricingOeufVo pricingOeufVo) {
        PricingOeuf pricingOeuf = new PricingOeuf();
        if (pricingOeufVo != null) {

           
            if (pricingOeufVo.getReference() != null) {
                pricingOeuf.setReference(pricingOeufVo.getReference());
            }
            if (pricingOeufVo.getDateMax()!= null) {
                pricingOeuf.setDateMax(pricingOeufVo.getDateMax());
            }
            if (pricingOeufVo.getDateMin()!= null) {
                pricingOeuf.setDateMin(pricingOeufVo.getDateMin());
            }
            if (pricingOeufVo.getPrix()!= 0) {
                pricingOeuf.setPrix(pricingOeufVo.getPrix());
            }
            
          
        }
        return pricingOeuf;
    }

    public PricingOeufVo toVo(PricingOeuf pricingOeuf) {
        PricingOeufVo pricingOeufVo = new PricingOeufVo();

        if (pricingOeuf != null) {
           
            if (pricingOeuf.getReference() != null) {
                pricingOeufVo.setReference(pricingOeuf.getReference());
            }
            if (pricingOeuf.getDateMax()!= null) {
                pricingOeufVo.setDateMax(pricingOeuf.getDateMax());
            }
            if (pricingOeuf.getDateMin()!= null) {
                pricingOeufVo.setDateMin(pricingOeuf.getDateMin());
            }
            if (pricingOeuf.getPrix()!= 0) {
                pricingOeufVo.setPrix(pricingOeuf.getPrix());
            }
          
        }
        return pricingOeufVo;
    }
    
     public List<PricingOeufVo> toVo(List<PricingOeuf> pricingOeufs) {
        List<PricingOeufVo> pricingOeufVos = new ArrayList();
        if (pricingOeufs != null && !pricingOeufs.isEmpty()) {
            for (PricingOeuf pricingOeuf : pricingOeufs) {
                pricingOeufVos.add(toVo(pricingOeuf));
            }
        }
        return pricingOeufVos;
    }
    
}
