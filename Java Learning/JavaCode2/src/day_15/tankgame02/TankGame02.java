package day_15.tankgame02;

import javax.swing.*;

/**
 * @Author: Song-zy
 * @Date: 2021/10/28 10:03
 * @Description:
 */
public class TankGame02 extends JFrame {
    MyPanel myPanel = null;
    public static void main(String[] args) {
        TankGame02 tankGame02 = new TankGame02();
    }
    public TankGame02(){
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(800,600);//大小
        this.addKeyListener(myPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//可关闭
        this.setVisible(true);//可视

    }
}
