/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Firme.rest.converter;

import com.poussin.Firme.bean.Firme;
import com.poussin.Firme.rest.vo.FirmeVo;
import com.poussin.Firme.util.NumberUtil;
import java.util.List;

/**
 *
 * @author Elitebook folio
 */
public class FirmeConverter implements AbstractConverter<Firme, FirmeVo> {

    @Override
    public Firme toItem(FirmeVo vo) {
        if (vo == null) {
            return null;
        } else {
            Firme item = new Firme();
            item.setNom(vo.getNom());
            item.setCapacite(NumberUtil.toInt(vo.getCapacite()));
            item.setNbrPoussinFemale(NumberUtil.toInt(vo.getNbrPoussinFemale()));
            item.setNbrPoussinMale(NumberUtil.toInt(vo.getNbrPoussinMale()));
            item.setPlaceRestant(NumberUtil.toInt(vo.getPlaceRestant()));
            item.setReference(vo.getReference());
            item.setTotalPoussin(NumberUtil.toInt(vo.getTotalPoussin()));
            item.setId(vo.getId());
            return item;
        }

    }

    @Override
    public FirmeVo toVo(Firme item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Firme> toItem(List<FirmeVo> vos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
