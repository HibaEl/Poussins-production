/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Firme.service.impl;

import com.poussin.Firme.bean.Affectation;
import com.poussin.Firme.bean.Firme;
import com.poussin.Firme.dao.FirmeDao;
import com.poussin.Firme.service.AffectationService;
import com.poussin.Firme.service.FirmeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Elitebook folio
 */
@Service
public class FirmeServiceImpl implements FirmeService {

    @Autowired
    private FirmeDao firmeDao;

    @Autowired
    private AffectationService affectationService;

    @Override
    public Firme findByReference(String reference) {
        return firmeDao.findByReference(reference);
    }

    @Override
    public int creer(Firme firme) {
        Firme f = findByReference(firme.getReference());
        if (f != null) {
            return -1;
        } else {
            calculerTotalPoussin(firme);
            calculerPlaceRestant(firme);
            firmeDao.save(firme);
            affectationService.saveAffectation(firme);

        }
        return 1;
    }

    private void calculerTotalPoussin(Firme firme) {
        List<Affectation> affectations = firme.getAffectations();
        int totalPoussin = 0;
        int totalPoussinMale = 0;
        int totalPoussinFemale = 0;
        if (affectations != null && !affectations.isEmpty()) {
            for (Affectation affectation : affectations) {
                totalPoussinFemale+=affectation.getNbrFemale();
                totalPoussinMale+=affectation.getNbrMale();
                totalPoussin += affectation.getNbrFemale() + affectation.getNbrMale();
                
            }
            firme.setTotalPoussin(totalPoussin);
            firme.setNbrPoussinFemale(totalPoussinFemale);
            firme.setNbrPoussinMale(totalPoussinMale);
        }
    }

    private void calculerPlaceRestant(Firme firme) {
        int placeRestant = 0;
        placeRestant += firme.getCapacite() - firme.getTotalPoussin();
        firme.setPlaceRestant(placeRestant);
    }

    public AffectationService getAffectationService() {
        return affectationService;
    }

    public void setAffectationService(AffectationService affectationService) {
        this.affectationService = affectationService;
    }

    public FirmeDao getFirmeDao() {
        return firmeDao;
    }

    public void setFirmeDao(FirmeDao firmeDao) {
        this.firmeDao = firmeDao;
    }

}
