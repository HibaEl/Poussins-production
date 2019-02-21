/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.dao;

import com.poussin.production.bean.Production;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LENOVO
 */@Repository
public interface ProductionDao extends JpaRepository<Production, Long>{
     
     public Production findByReference(String reference);
     @Query("select Avg(p.poids) from Production p where p.semaineProduction= :semaine and p.refFirme= :refFirme and p.anneeProduction= :annee ")
             public Double averagePoids(@Param("semaine")Integer semaine,@Param("refFirme")String refFirme,@Param("annee")Integer annee);
             
             
             
    @Query("select Avg(r.nbrOeuf) from Production r where r.semaineProduction= :semaineO and r.refFirme= :refFirmeO and r.anneeProduction= :anneeO ")
             public Double averageNbrOeuf(@Param("anneeO") Integer anneeO, @Param("refFirmeO") String refFirmeO, @Param("semaineO") Integer semaineO);
    
    
     
    
}
