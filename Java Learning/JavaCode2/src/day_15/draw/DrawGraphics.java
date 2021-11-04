package day_15.draw;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: Song-zy
 * @Date: 2021/10/27 23:27
 * @Description: Graphics常用方法
 */
public class DrawGraphics extends JFrame{
    @SuppressWarnings("all")
    private MyPanel1 myPanel = null;//定义一个面板

    public static void main(String[] args) {
        new DrawGraphics();
    }
    public DrawGraphics() {//构造器
        //初始化面板
        myPanel = new MyPanel1();
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
class MyPanel1 extends JPanel {
    //1.MyPanel对象就是一个画板，Graphics对象就是画笔
    @Override
    public void paint(Graphics g) {//绘图方法
        super.paint(g);
        System.out.println("paint方法被调用");
        //画一个椭圆
//        1. 画直线：`drawLine(int x1,int y1,int x2,int y2)`
        //g.drawLine(10,10,100,100);
//        2. 画矩形边框：`drawRect(int x, int y, int width, int height)`
        //g.drawRect(10,10,200,250);
//        3. 画椭边框 ：`drawOval(int x,int y, int width, int height)`
//        4. 填充矩形：`fillRect(int x,int y , int width, int height)`
        //设置画笔颜色
        g.setColor(Color.red);
        //g.fillRect(10,10,100,200);

//        5. 填充椭圆 ：`fillOval(int x, int y, int width, int height)`
        //g.fill3DRect(10,10,30,40,true);
//        6. 画图片：`drawImage( Image img,int x,int y…)`
        //获取图片资源
        Image image = Toolkit.getDefaultToolkit().getImage("src/day_15/draw/11.png");
        g.drawImage(image,10,10,97,95,this);
//        7. 画字符串:  `drawString(String str, int x, int y)`
//        8. 设置画笔的字体 : `setFont( Font font)`
        g.setFont(new Font("隶书",Font.BOLD,50));//Font.BOLD粗体
        g.drawString("王琪我爱你",100,100);
//        9. 设置画笔的颜色 : `setColor( Color c)`
    }
}