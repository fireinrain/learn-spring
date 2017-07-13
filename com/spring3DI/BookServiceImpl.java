package com.spring3DI;

/**
 * Created by Administrator on 2017/7/11.
 */
public class BookServiceImpl implements BookService{
    private BookDao bookDao;
    @Override
    public void addBook() {
        this.bookDao.save();
        //System.out.println("service添加书籍");
    }


    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
