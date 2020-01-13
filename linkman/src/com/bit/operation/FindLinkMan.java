package com.bit.operation;

import com.bit.DataBase.DataBaseOperation;
import com.bit.Man.LinkMan;

/**
 * @className FindLinkMan
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/6 17:27
 * @Version 1.0
 **/
public class FindLinkMan implements IO{//查找联系人
    public void work(){
        System.out.println("请输入要查询联系人的姓名：");
        String name=sc.next();
        LinkMan man=DataBaseOperation.FindLinkMan(name);
        if(man.getName()!=null){
            System.out.println(man);
            System.out.println("查询成功！");
        }else
            System.out.println("没有此联系人！");
    }
}
