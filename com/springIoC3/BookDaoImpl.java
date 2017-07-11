package com.springIoC3;

/**
 * Created by Administrator on 2017/7/11.
 */
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("添加书籍-->来自注入的Bean");
    }
}
