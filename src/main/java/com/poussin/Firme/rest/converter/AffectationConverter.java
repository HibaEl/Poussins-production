/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Firme.rest.converter;

import com.poussin.Firme.bean.Affectation;
import com.poussin.Firme.rest.vo.AffectationVo;
import com.poussin.Firme.util.DateUtil;
import com.poussin.Firme.util.NumberUtil;
import java.util.Date;

/**
 *
 * @author Elitebook folio
 */
public class AffectationConverter extends AbstractConverter<Affectation, AffectationVo> {

    public AffectationConverter() {
    }

    @Override
    public Affectation toItem(AffectationVo vo) {
        if (vo == null) {
            return null;
        } else {
            Affectation item = new Affectation();
            item.setId(vo.getId());
            item.setNbrFemale(NumberUtil.toInt(vo.getNbrFemale()));
            item.setNbrMale(NumberUtil.toInt(vo.getNbrMale()));
            item.setRefe(vo.getRefe());
            item.setReferenceImport(vo.getReferenceImport());
            if (vo.getDateAffectation() == null) {
                item.setDateAffectation(new Date());
            } else {
                item.setDateAffectation(DateUtil.parseYYYYMMDDmmhhSS(vo.getDateAffectation()));
            }
            return item;

        }
    }

    @Override
    public AffectationVo toVo(Affectation item) {
        if (item == null) {
            return null;
        } else {
            AffectationVo vo = new AffectationVo();
            vo.setId(item.getId());
            vo.setNbrFemale(NumberUtil.toString(item.getNbrFemale()));
            vo.setNbrMale(NumberUtil.toString(item.getNbrMale()));
            vo.setRefe(item.getRefe());
            vo.setReferenceImport(item.getReferenceImport());
            vo.setDateAffectation(DateUtil.formatYYYYMMDDmmhhSS(item.getDateAffectation()));
            return vo;
        }
    }

}
