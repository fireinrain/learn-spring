package com.springdemo;

/**
 * Created by Administrator on 2017/7/11.
 */
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args){
        //ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        //HelloWorld helloWorld = (HelloWorld) context.getBean("helloworld");
        //HelloWorld helloWorld1 = (HelloWorld)context.getBean("helloworld");

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloworld");
        HelloWorld helloWorld1 = (HelloWorld)context.getBean("helloworld");
        context.registerShutdownHook();  //使bean destory时起作用
        System.out.println(helloWorld.equals(helloWorld1));


        //测试非单例
        People people = (People)context.getBean("people");
        People people2 = (People)context.getBean("people");
        System.out.println(people==people2);

    }
}
