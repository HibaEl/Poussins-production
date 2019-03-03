/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Firme.rest.converter;

import com.poussin.Firme.bean.Affectation;
import com.poussin.Firme.bean.Firme;
import com.poussin.Firme.rest.vo.FirmeVo;
import com.poussin.Firme.util.NumberUtil;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Elitebook folio
 */
@Component
public class FirmeConverter extends AbstractConverter<Firme, FirmeVo> {
    
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
            item.setAffectations(new AffectationConverter().toItem(vo.getAffectationVo()));
            return item;
        }
        
    }
    
    @Override
    public FirmeVo toVo(Firme item) {
        if (item == null) {
            return null;
        } else {
            FirmeVo vo = new FirmeVo();
            vo.setId(item.getId());
            vo.setNom(vo.getNom());
            vo.setCapacite(NumberUtil.toString(item.getCapacite()));
            vo.setNbrPoussinFemale(NumberUtil.toString(item.getNbrPoussinFemale()));
            vo.setNbrPoussinMale(NumberUtil.toString(item.getNbrPoussinMale()));
            vo.setPlaceRestant(NumberUtil.toString(item.getPlaceRestant()));
            vo.setReference(item.getReference());
            vo.setTotalPoussin(NumberUtil.toString(item.getTotalPoussin()));
            vo.setAffectationVo(new AffectationConverter().toVo(item.getAffectations()));
            return vo;
        }
    }
    
}
