package com.bit.operation;

import com.bit.DataBase.DataBaseOperation;

/**
 * @className Sort
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/6 18:03
 * @Version 1.0
 **/
public class Sort implements IO{//排序
    public void work(){
        DataBaseOperation.sortLinkMan();
        System.out.println("排序完成！");
    }
}
