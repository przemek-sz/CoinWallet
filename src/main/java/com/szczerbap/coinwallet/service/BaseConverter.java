package com.szczerbap.coinwallet.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Przemek on 26.10.2017.
 */
public interface BaseConverter<F,T> {

        public T convert(F from);


        default public List<T> convertAll(List<F> fElements){
            List<T>convertedElements=new ArrayList<>();

                    for(F element:fElements){
                        convertedElements.add(convert(element));
                    }

            return convertedElements;

        }


}
