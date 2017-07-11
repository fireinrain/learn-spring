package com.springdemo;

/**
 * Created by Administrator on 2017/7/11.
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloworld");
        System.out.println(helloWorld.getMessage());
    }
}
