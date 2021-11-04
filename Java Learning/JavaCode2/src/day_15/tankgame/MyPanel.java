package day_15.tankgame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @Author: Song-zy
 * @Date: 2021/10/28 9:57
 * @Description: 绘制坦克的类
 */
public class MyPanel extends JPanel implements KeyListener {
    //定义我的坦克
    Hero hero = null;
//    int x = 100;
//    int y = 100;
////    int direct = 0;

    public MyPanel() {
        hero = new Hero(100, 100);
        hero.setDirect(0);
        hero.setSpeed(4);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 800, 600);
        drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);
    }

    //画出坦克

    /**
     * @param x      坦克左上角横坐标
     * @param y      坦克左上角纵坐标
     * @param g      画笔
     * @param direct 坦克方向《上0,下1,左2,右3》
     * @param type   坦克类型<敌、我>
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        //不同类型坦克，不同颜色
        switch (type) {
            case 0://我方坦克
                g.setColor(Color.cyan);
                break;
            case 1://敌方
                g.setColor(Color.yellow);
                break;
        }
        //根据坦克方向，绘制坦克
        switch (direct) {
            case 0://向上
                g.fill3DRect(x, y, 8, 48, false);//左轮
                g.fill3DRect(x + 24, y, 8, 48, false);//右轮
                g.fill3DRect(x + 8, y + 8, 16, 32, false);//中间矩形
                g.fillOval(x + 8, y + 16, 16, 16);//圆形
                g.drawLine(x + 16, y + 16, x + 16, y);//炮筒
                break;
            case 1://下
                g.fill3DRect(x, y, 8, 48, false);//左轮
                g.fill3DRect(x + 24, y, 8, 48, false);//右轮
                g.fill3DRect(x + 8, y + 8, 16, 32, false);//中间矩形
                g.fillOval(x + 8, y + 16, 16, 16);//圆形
                g.drawLine(x + 16, y + 16, x + 16, y + 48);//炮筒
                break;
            case 2://左
                g.fill3DRect(x, y, 48, 8, false);//左轮
                g.fill3DRect(x, y + 24, 48, 8, false);//右轮
                g.fill3DRect(x + 8, y + 8, 32, 16, false);//中间矩形
                g.fillOval(x + 16, y + 8, 16, 16);//圆形
                g.drawLine(x + 24, y + 16, x, y + 16);//炮筒
                break;
            case 3://右
                g.fill3DRect(x, y, 48, 8, false);//左轮
                g.fill3DRect(x, y + 24, 48, 8, false);//右轮
                g.fill3DRect(x + 8, y + 8, 32, 16, false);//中间矩形
                g.fillOval(x + 16, y + 8, 16, 16);//圆形
                g.drawLine(x + 24, y + 16, x+48, y + 16);//炮筒
                break;
            default:
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        char c = (char) e.getKeyCode();
        /**
         * S/↓:下
         * W/↑: 上
         * A/←: 左
         * D/→: 右
         */
        if ((c == KeyEvent.VK_S || c == KeyEvent.VK_DOWN) && hero.getY() < 528) {//S键
            hero.setDirect(1);
            hero.moveDown();//向下移动
        } else if ((c == KeyEvent.VK_W || c == KeyEvent.VK_UP) && hero.getY() > 0) {
            hero.setDirect(0);
            hero.moveUp();//向上移动
        } else if ((c == KeyEvent.VK_A || c == KeyEvent.VK_LEFT) && hero.getX() > 0) {
            hero.setDirect(2);
            hero.moveLeft();//向左
        } else if ((c == KeyEvent.VK_D || c == KeyEvent.VK_RIGHT) && hero.getX() < 748) {
            hero.setDirect(3);
            hero.moveRight();//向右
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
