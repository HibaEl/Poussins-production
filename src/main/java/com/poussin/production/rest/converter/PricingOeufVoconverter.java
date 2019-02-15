/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.rest.converter;

import com.poussin.production.bean.PricingOeuf;
import com.poussin.production.commun.util.NumberUtil;
import com.poussin.production.rest.vo.PricingOeufVo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class PricingOeufVoconverter implements AbstractConverter<PricingOeuf, PricingOeufVo> {

    @Override
    public PricingOeuf toItem(PricingOeufVo pricingOeufVo) {
        PricingOeuf pricingOeuf = new PricingOeuf();
        if (pricingOeufVo != null) {

            pricingOeuf.setReference(pricingOeufVo.getReference());
            pricingOeuf.setPrix(NumberUtil.toDouble(pricingOeufVo.getPrix()));

        }
        return pricingOeuf;
    }

    @Override
    public PricingOeufVo toVo(PricingOeuf pricingOeuf) {
        PricingOeufVo pricingOeufVo = new PricingOeufVo();

        if (pricingOeuf != null) {

            pricingOeufVo.setReference(pricingOeuf.getReference());
            pricingOeufVo.setPrix(NumberUtil.toStringDouble(pricingOeuf.getPrix()));
        }

        return pricingOeufVo;
    }

    @Override
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
