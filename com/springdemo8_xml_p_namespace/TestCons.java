package com.springdemo8_xml_p_namespace;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/7/13.
 */
public class TestCons {

    @Test
    public void test(){
        String xmlPath = "com\\springdemo8_xml_p_namespace\\Beans.xml";
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        Person person = (Person) applicationContext.getBean("personId");
        System.out.println(person);
    }
//    @Test
//    public void test2(String name,Integer age,int...args){
//
//        int arr[] = new int[5];
//        for(int num : arr){
//            num = 1;
//        }
//        System.out.println(arr[0]);
//
//        TestCons testCons = new TestCons();
//        testCons.test2("name",12,13,24,56,8);
//
//    }

    @Test
    public void test2(){
        class Peolpe{

            private String name;
            private int age;


            public Peolpe(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }
        }
        System.out.println(new Peolpe("xiaoqian",123).age );
        System.out.println(new Peolpe("xiaoqian",123).getAge());
    }
}
