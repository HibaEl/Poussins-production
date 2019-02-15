/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Firme.rest;

import com.poussin.Firme.bean.Firme;
import com.poussin.Firme.service.FirmeService;
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

    @PostMapping("/")
    public int creer(@RequestBody Firme firme) {
        return firmeService.creer(firme);
    }

    @GetMapping("/reference/{reference}")
    public Firme findByReference(@PathVariable String reference) {
        return firmeService.findByReference(reference);
    }

    public FirmeService getFirmeService() {
        return firmeService;
    }

    public void setFirmeService(FirmeService firmeService) {
        this.firmeService = firmeService;
    }
    
    

}
