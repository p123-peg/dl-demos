package com.ll;

import com.ll.bean.Cat;
import com.ll.bean.Dog;
import com.ll.bean.Property;
import com.ll.controller.HelloController;
import com.ll.res.Catres;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liuziqiang
 * @date 2022/01/20 21:19
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDemo {


    private Property property;
    @Autowired
    private Catres catres;
    @Test
    public void get() {
     //   System.out.println(cat);
    }

    @Test
    public void gee() {
     //   System.out.println(dog);
    }
    @Test
    public void gell() {
        property=new Property();
        property.setAge(2);
        property.setName("ll");
        catres.save(property);

    }
}
