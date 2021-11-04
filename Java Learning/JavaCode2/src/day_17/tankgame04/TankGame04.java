package day_17.tankgame04;

import javax.swing.*;

/**
 * @Author: Song-zy
 * @Date: 2021/10/30 21:07
 * @Description:
 */
public class TankGame04 extends JFrame{
    MyPanel myPanel = null;
    public static void main(String[] args) {
        TankGame04 tankGame04 = new TankGame04();
    }
    public TankGame04(){
        myPanel = new MyPanel();
        new Thread(myPanel).start();
        this.add(myPanel);
        this.setSize(800,600);//大小
        this.addKeyListener(myPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//可关闭
        this.setVisible(true);//可视

    }
}
