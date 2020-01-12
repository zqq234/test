package com.bit.table;

/**
 * @className Message
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/9 12:05
 * @Version 1.0
 **/
public class Message {
    private int bno;
    private String name;
    private int no;
    private String borrowTime;
    private String returnTime;

    public Message() {

    }

    public Message(int bno, String name, int no, String borrowTime, String returnTime) {
        this.bno = bno;
        this.name = name;
        this.no = no;
        this.borrowTime = borrowTime;
        this.returnTime = returnTime;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getBorrowTime() {
        return borrowTime;
    }

    public void setBorrowTime(String borrowTime) {
        this.borrowTime = borrowTime;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

    @Override
    public String toString() {
        return "Message{" +
                "bno=" + bno +
                ", name='" + name + '\'' +
                ", no=" + no +
                ", borrowTime='" + borrowTime + '\'' +
                ", returnTime='" + returnTime + '\'' +
                '}';
    }
}
