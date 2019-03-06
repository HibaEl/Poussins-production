/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poussin.production.rest.converter;

import java.util.List;

/**
 *
 * @author LENOVO
 */
public interface AbstractConverter<T, VO> {

    public T toItem(VO vo);
    public VO toVo(T item);
    public List<VO> toVo(List<T> vos);
    public List<T> toItem(List<VO> items);

}
