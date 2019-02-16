/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.Firme.util;

/**
 *
 * @author Elitebook folio
 */
    
public class NumberUtil {
private static final String CHAINE_VIDE=""; 
    
    public static int toInt(String value){
        if(value==null || value.isEmpty()){
            return 0;
        }else{
            return Integer.parseInt(value);
        }
    }
    public static String toString(Integer value){
        if(value==0){
            return CHAINE_VIDE;
        }else{
            return String.valueOf(value);
        }
    }
}


