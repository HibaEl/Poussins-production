/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Firme.service;

import com.poussin.Firme.bean.Firme;
import org.springframework.stereotype.Service;

/**
 *
 * @author Elitebook folio
 */
@Service
public interface FirmeService {

    public Firme findByReference(String reference);

    public int creer(Firme firme);

}
