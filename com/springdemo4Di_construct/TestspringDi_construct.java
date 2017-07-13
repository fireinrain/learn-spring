package com.springdemo4Di_construct;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/7/11.
 */
public class TestspringDi_construct {

    @Test
    public void test1(){
        BookService bookService =  MyBeanFactory.createService();
        bookService.addBook();
    }

    //spring 静态工厂
    @Test
    public void test2(){
        String xmlPath = "com\\springdemo4Di_construct\\Beans.xml";
        ApplicationContext application = new ClassPathXmlApplicationContext(xmlPath);
        BookService bookService = application.getBean("bookServiceId",BookService.class);
        bookService.addBook();
    }
}
