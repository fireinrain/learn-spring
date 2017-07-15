package com.springdemo8_xml_p_namespace;

/**
 * Created by Administrator on 2017/7/14.
 */
public class Person {

    private String pname;
    private Integer age;

    private Address homeAddress;    //家庭地址
    private Address cpAddress;   //公司地址

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getCpAddress() {
        return cpAddress;
    }

    public void setCpAddress(Address cpAddress) {
        this.cpAddress = cpAddress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pname='" + pname + '\'' +
                ", age=" + age +
                ", homeAddress=" + homeAddress +
                ", cpAddress=" + cpAddress +
                '}';
    }
}
