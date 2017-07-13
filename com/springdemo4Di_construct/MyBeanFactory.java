package com.springdemo4Di_construct;



/**
 * Created by Administrator on 2017/7/11.
 */
public class MyBeanFactory {
    public static BookService createService(){
        //System.out.println("AAA");
        BookDao bookDao = new BookDaoImpl();
        BookServiceImpl bookService = new BookServiceImpl();
        bookService.setBookDao(bookDao);
        return bookService;

    }
}
