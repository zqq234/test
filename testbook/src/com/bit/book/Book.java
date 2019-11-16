package com.bit.book;

/**
 * @className Book
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2019/11/16 11:32
 * @Version 1.0
 **/
public class Book {
    public String name;
    public String author;
    public int price;
    public String type;
    public boolean isBorrowed;

    public Book(String name, String author, int price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}
