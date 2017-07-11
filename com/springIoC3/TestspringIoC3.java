package com.springIoC3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/7/11.
 */
public class TestspringIoC3 {

    @Test
    public void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com\\springIoC3\\Beans.xml");
        BookService bookService = (BookServiceImpl)applicationContext.getBean("bookServiceId");
        bookService.addBook();

    }
}
