package com.springdemo5_InstanceFactory;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/7/11.
 */
public class Testspring5 {


    //自定义实例工厂
//    @Test
//    public void test1(){
//        MyBeanFactory factory = new MyBeanFactory();
//        BookService bookService =  factory.createService();
//        bookService.addBook();
//    }

    //spring 实例工厂
    @Test
    public void test2(){
        String xmlPath = "com\\springdemo5_InstanceFactory\\Beans.xml";
        ApplicationContext application = new ClassPathXmlApplicationContext(xmlPath);
        BookService bookService = application.getBean("bookServiceId",BookService.class);
        BookService bookService2 = application.getBean("bookServiceId",BookService.class);
        //bookService.addBook();
        System.out.println(bookService);
        System.out.println(bookService2);
    }



}
