package com.ll.res;

import com.ll.bean.Property;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @author: Ll
 * @create: 2022-01-21
 **/
public interface Catres extends CrudRepository<Property,String> {
    List<Property> findAllB(String lza);
}
