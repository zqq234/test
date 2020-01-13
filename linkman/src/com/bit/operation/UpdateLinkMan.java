package com.bit.operation;

import com.bit.DataBase.DataBaseOperation;
import com.bit.Man.LinkMan;

/**
 * @className UpdateLinkMan
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/6 17:45
 * @Version 1.0
 **/
public class UpdateLinkMan implements IO{//修改联系人信息
    public void work(){
        System.out.println("请输入您要修改的联系人姓名：");
        String name=sc.next();
        LinkMan man=DataBaseOperation.FindLinkMan(name);
        System.out.println(man);
        System.out.println("请输入您要修改的联系人的地址：");
        man.setAddress(sc.next());
        System.out.println("请输入您要修改的联系人的邮编：");
        man.setCode(sc.nextInt());
        System.out.println("请输入您要修改的联系人的Email：");
        man.setEmail(sc.next());
        System.out.println("请输入您要修改的联系人的电话号码：");
        man.setPhone(sc.nextLong());
        System.out.println("请输入您要修改的联系人的家庭电话号码：");
        man.setFamilyNumber(sc.nextLong());
        DataBaseOperation.UpdateLinkMan(man);
        System.out.println("修改成功！");
    }
}
