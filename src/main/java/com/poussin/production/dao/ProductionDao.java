/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.dao;

import com.poussin.production.bean.Production;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LENOVO
 */@Repository
public interface ProductionDao extends JpaRepository<Production, Long>{
     public Production findByReference(String reference);
  
    
}
