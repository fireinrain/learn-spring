package com.springdemo6_xml_constructor;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/7/13.
 */
public class TestCons {

    @Test
    public void test(){
        String xmlPath = "com\\springdemo6_xml_constructor\\Beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        User user = (User) applicationContext.getBean("UserId");
        System.out.println(user);
    }
}
