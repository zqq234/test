package com.bit.operation;
import com.bit.DataBase.DataBaseOperation;
import com.bit.Man.*;
/**
 * @className AddLinkMan
 * @Description TODO
 * @Author zhangqianqian
 * @Date 2020/1/6 17:04
 * @Version 1.0
 **/
public class AddLinkMan implements IO{//添加联系人信息
    public void work(){
        System.out.println("添加联系人");
        System.out.println("请输入添加联系人姓名：");
        String name=sc.next();
        System.out.println("请输入添加联系人地址：");
        String address=sc.next();
        System.out.println("请输入添加联系人电话号码：");
        long phone=sc.nextLong();
        System.out.println("请输入添加联系人邮政编码：");
        int code=sc.nextInt();
        System.out.println("请输入添加联系人Email：");
        String Email=sc.next();
        System.out.println("请输入添加联系人家庭电话号码：");
        long familyNumber=sc.nextLong();
        LinkMan Man=new LinkMan(name,address,phone,code,Email,familyNumber);
        DataBaseOperation.addLinkMan(Man);
        System.out.println("添加成功！");

    }
}
