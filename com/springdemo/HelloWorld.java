package com.springdemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by Administrator on 2017/7/11.
 */
public class HelloWorld implements DisposableBean{

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return  this.message;
    }

    public void print(){
        System.out.println(this.message+"===");
    }

    public void init(){
        //do some init things
        System.out.println("初始化调用！！！");
    }
    public void destroy(){
        //do some init things
        System.out.println("销毁调用！！！");
    }


}
