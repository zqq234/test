package com.bit.Man;

/**
 * @className LinkMan
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/6 17:02
 * @Version 1.0
 **/
public class LinkMan {
    private String name;//姓名
    private String address;//地址
    private long phone;//电话号码
    private int code;//邮编
    private String Email;//电子邮件
    private long familyNumber;//家庭电话号码
    public LinkMan(){

    }
    public LinkMan(String name, String address, long phone, int code,
                   String email, long familyNumber) {
        super();
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.code = code;
        Email = email;
        this.familyNumber = familyNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public long getPhone() {
        return phone;
    }

    public int getCode() {
        return code;
    }

    public String getEmail() {
        return Email;
    }

    public long getFamilyNumber() {
        return familyNumber;
    }

    public String getName(){
        return this.name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setFamilyNumber(long familyNumber) {
        this.familyNumber = familyNumber;
    }

    public String toString() {
        return "name=" + name + ", address=" + address + ", phone="
                + phone + ", code=" + code + ", Email=" + Email
                + ", familyNumber=" + familyNumber;
    }
}
