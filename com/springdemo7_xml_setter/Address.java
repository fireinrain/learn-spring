package com.springdemo7_xml_setter;

/**
 * Created by Administrator on 2017/7/14.
 */
public class Address {

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    private String addr;    //地址
    private String tel;      //电话

    @Override
    public String toString() {
        return "Address{" +
                "addr='" + addr + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
