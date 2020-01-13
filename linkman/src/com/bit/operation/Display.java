package com.bit.operation;

import com.bit.DataBase.DataBaseOperation;
import com.bit.Man.LinkMan;

import java.util.List;

/**
 * @className Display
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/6 17:24
 * @Version 1.0
 **/
public class Display implements IO{//显示所有联系人信息
    public void work(){
        DataBaseOperation.selectLinkMan();
    }
}
