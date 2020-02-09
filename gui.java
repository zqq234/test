import java.awt.*;
public class Test{
    public static void mian(String[] args){
        Frame f=new Frame("张倩倩");
        Button bn=new Button("张三");
        f.add(bn);
        f.setBounds(50,300,200,200);
        f.setBackground(Color.PINK);
        f.setVisible(false);
    }
}