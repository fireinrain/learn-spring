package com.springdemo6_xml_constructor;

/**
 * Created by Administrator on 2017/7/13.
 */
public class User {


    private Integer uid;
    private String name;
    private Integer age;

    public User(Integer uid, String name) {
        this.uid = uid;
        this.name = name;
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
