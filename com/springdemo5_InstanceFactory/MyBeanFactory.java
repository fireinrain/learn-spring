package com.springdemo5_InstanceFactory;


/**
 * Created by Administrator on 2017/7/11.
 */

//实例工厂
public class MyBeanFactory {
    public  BookService createService(){
        //System.out.println("AAA");
        BookDao bookDao = new BookDaoImpl();
        BookServiceImpl bookService = new BookServiceImpl();
        bookService.setBookDao(bookDao);
        return bookService;

    }
}
