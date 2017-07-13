package com.spring3DI;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Administrator on 2017/7/11.
 */
public class TestspringIoC3 {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com\\spring3DI\\Beans.xml");
        BookService bookService = (BookServiceImpl)applicationContext.getBean("bookServiceId");
        bookService.addBook();

    }

    //测试BeanFactory的延时加载
    @Test
    public void test2(){
        String xmlPath = "com\\spring3DI\\Beans.xml";
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(xmlPath));
        BookService bookService =(BookService) beanFactory.getBean("bookServiceId");
        bookService.addBook();

    }
}
