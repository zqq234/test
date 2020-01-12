package com.bit.doOperation;

/**
 * @className Exit
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/8 14:56
 * @Version 1.0
 **/
public class Exit implements IOperation{
    public void work() {
        System.out.println("byebye!");
        System.exit(0);
    }
}
