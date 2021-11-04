package day_15.draw;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: Song-zy
 * @Date: 2021/10/27 22:52
 * @Description: 如何在面板上画圆
 */
@SuppressWarnings("all")
public class DrawCircle extends JFrame {
    private MyPanel myPanel = null;//定义一个面板

    public static void main(String[] args) {
        new DrawCircle();
//        myPanel.paint();
    }
    public DrawCircle() {//构造器
        //初始化面板
        myPanel = new MyPanel();
        //将面板放进画框
        this.add(myPanel);
        //设置窗口大小
        this.setSize(400, 300);
        //点击窗口红叉退出程序
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //窗口可视
        this.setVisible(true);
    }
}

//1.先定义一个Panel，继承JPanel.在这上面画图
class MyPanel extends JPanel {
    //1.MyPanel对象就是一个画板，Graphics对象就是画笔
    @Override
    public void paint(Graphics g) {//绘图方法
        super.paint(g);
//        System.out.println("paint方法被调用");
//        g.drawOval(10, 10, 100, 100);
//        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/11.png"));
//        g.drawImage(image,10,10,97,95,this);
    }
}
