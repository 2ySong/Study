package day_15.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @Author: Song-zy
 * @Date: 2021/10/28 10:55
 * @Description: 演示小球通过键盘控制上下左右移动：Java事件控制
 */
public class BallMove extends JFrame {
    MyPanel myPanel = null;

    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }

    public BallMove() {
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(400, 300);
        this.addKeyListener(myPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

//面板
class MyPanel extends JPanel implements KeyListener {//实现键盘监听器，监听键盘事件

    int x = 10;
    int y = 10;

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        g.fillOval(x, y, 20, 20);
    }

    //有字符输入，输出，就会出发
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //当按下某键时
    @Override
    public void keyPressed(KeyEvent e) {
        //System.out.println((char)e.getKeyCode()+"被按下");
        char c = (char) e.getKeyCode();
        /**
         * S:下
         * W: 上
         * A: 左
         * D: 右
         */
        if (c == KeyEvent.VK_S && y < 246) {//S键
            y += 2;//向下移动
        } else if (c == KeyEvent.VK_W && y > 0) {
            y -= 2;//向上移动
        } else if (c == KeyEvent.VK_A && x > 0) {
            x -= 2;//向左
        } else if (c == KeyEvent.VK_D && x < 362) {
            x += 2;//向右
        }
        this.repaint();
    }

    //某键释放
    @Override
    public void keyReleased(KeyEvent e) {

    }
}