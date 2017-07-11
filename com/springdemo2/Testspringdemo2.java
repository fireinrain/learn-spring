package com.springdemo2;

/**
 * Created by Administrator on 2017/7/11.
 */
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testspringdemo2 {
    @Test
    public void demo2WithNoSpring(){
        //之前开发
        UserService userService = new UserServiceImpl();
        userService.addUser();
    }

    @Test
    public void demo2WithSpring(){
        //使用spring
        //1.获得容器
        //2.加载内容
        String xmlPath = "spring-config.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = (UserService)applicationContext.getBean("UserServiceId");
        userService.addUser();
    }
}
