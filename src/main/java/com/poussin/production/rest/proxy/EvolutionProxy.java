/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.rest.proxy;

import com.poussin.production.rest.vo.exchange.EvolutionVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author LENOVO
 */
@FeignClient(name="microservice-commande", url="localhost:8092")
public interface EvolutionProxy {
    @GetMapping("/Import/evolutions/reference/{reference}")
    public EvolutionVo findByReference(@PathVariable("reference") String reference);
}
