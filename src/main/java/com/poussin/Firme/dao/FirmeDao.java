/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Firme.dao;

import com.poussin.Firme.bean.Firme;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Elitebook folio
 */
@Repository
public interface FirmeDao extends JpaRepository<Firme, Long> {

    public Firme findByReference(String reference);

   
    @Query("select f from Firme f where f.placeRestant > :nbrPlace")
    public List<Firme> findByPlaceRestantGreaterThan(@Param("nbrPlace") int nbrPlace);
     
}
