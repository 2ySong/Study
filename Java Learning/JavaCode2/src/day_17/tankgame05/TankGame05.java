package day_17.tankgame05;

import javax.swing.*;

/**
 * @Author: Song-zy
 * @Date: 2021/11/05 21:07
 * @Description:
 */
public class TankGame05 extends JFrame{
    MyPanel myPanel = null;
    public static void main(String[] args) {
        TankGame05 tankGame05 = new TankGame05();
    }
    public TankGame05(){
        myPanel = new MyPanel();
        new Thread(myPanel).start();
        this.add(myPanel);
        this.setSize(800,600);//大小
        this.addKeyListener(myPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//可关闭
        this.setVisible(true);//可视

    }
}
