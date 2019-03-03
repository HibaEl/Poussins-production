/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Firme.rest;

import com.poussin.Firme.bean.Firme;
import com.poussin.Firme.rest.converter.FirmeConverter;
import com.poussin.Firme.rest.vo.FirmeVo;
import com.poussin.Firme.service.AffectationService;
import com.poussin.Firme.service.FirmeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Elitebook folio
 */
@RestController()
@RequestMapping({"/firme-api/firmes"})
public class FirmeRest {

    @Autowired
    private FirmeService firmeService;

    @Autowired
    private AffectationService affectationService;

    @PostMapping("/")
    public int creer(@RequestBody FirmeVo firmeVo) {
        Firme firme = new FirmeConverter().toItem(firmeVo);
        return firmeService.creer(firme);
    }

    @GetMapping("/reference/{reference}")
    public FirmeVo findByReference(@PathVariable String reference) {
        return new FirmeConverter().toVo(firmeService.findByReference(reference));
    }

    /*   @GetMapping("/reference/{reference}")
    public AffectationVo findAffectationByFirme(@PathVariable String reference) {
        return new AffectationConverter().toVo(affectationService.findAffectationByFirme(reference));
    }  */
    @GetMapping("/nbrPlace/{nbrPlace}")
    public List<Firme> findByPlaceRestantGreaterThan(@PathVariable int nbrPlace) {
        return firmeService.findByPlaceRestantGreaterThan(nbrPlace);
    }

    @GetMapping("/nomFirme/{nomFirme}")
    public FirmeVo findByName(@PathVariable String nomFirme) {
        return new FirmeConverter().toVo(firmeService.findByName(nomFirme));
    }

    public FirmeService getFirmeService() {
        return firmeService;
    }

    public void setFirmeService(FirmeService firmeService) {
        this.firmeService = firmeService;
    }

    public AffectationService getAffectationService() {
        return affectationService;
    }

    public void setAffectationService(AffectationService affectationService) {
        this.affectationService = affectationService;
    }

}
