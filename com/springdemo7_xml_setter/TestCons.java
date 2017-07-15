package com.springdemo7_xml_setter;

import com.springdemo6_xml_constructor.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/7/13.
 */
public class TestCons {

    @Test
    public void test(){
        String xmlPath = "com\\springdemo7_xml_setter\\Beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        Person person = (Person) applicationContext.getBean("personId");
        System.out.println(person);
    }
}
