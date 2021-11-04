package day_15.tankgame;

import javax.swing.*;

/**
 * @Author: Song-zy
 * @Date: 2021/10/28 10:03
 * @Description:
 */
public class TankGame01 extends JFrame {
    MyPanel myPanel = null;
    public static void main(String[] args) {
        TankGame01 tankGame01 = new TankGame01();
    }
    public TankGame01(){
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(800,600);//大小
        this.addKeyListener(myPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//可关闭
        this.setVisible(true);//可视

    }
}
