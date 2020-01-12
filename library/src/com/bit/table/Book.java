package com.bit.table;

/**
 * @className Book
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/8 15:22
 * @Version 1.0
 **/
public class Book {
    private String name;//书名
    private int bno;//编号
    private String author;//作者
    private String publish;//出版社
    private String type;//类型
    private String location;//位置
    private String nameLocation;//同名图书存放位置
    private boolean isBorrowed;//书的借阅情况

    public Book() {

    }

    public Book(String name, int bno, String author, String publish, String type, String location, String nameLocation) {
        this.name = name;
        this.bno = bno;
        this.author = author;
        this.publish = publish;
        this.type = type;
        this.location = location;
        this.nameLocation = nameLocation;
        this.isBorrowed = false;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNameLocation() {
        return nameLocation;
    }

    public void setNameLocation(String nameLocation) {
        this.nameLocation = nameLocation;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", bno=" + bno +
                ", author='" + author + '\'' +
                ", publish='" + publish + '\'' +
                ", type='" + type + '\'' +
                ", location='" + location + '\'' +
                ", nameLocation='" + nameLocation + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}
