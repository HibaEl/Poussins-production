/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.rest.converter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public abstract class AbstractConverter<T, VO> {

    public  abstract T toItem(VO vo);
    public abstract VO toVo(T item);
    public List<VO> toVo(List<T> items){
    List<VO> vos = new ArrayList();
        if (items != null && !items.isEmpty()) {
            for (T item : items) {
                vos.add(toVo(item));
            }
        }
        return vos;
    }
    public List<T> toItem(List<VO> vos){
    List<T> items = new ArrayList();
        if (vos != null && !vos.isEmpty()) {
            for (VO vo :vos ) {
                items.add(toItem(vo));
            }
        }
        return items;
    }

}
