package day_17.tankgame03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @Author: Song-zy
 * @Date: 2021/10/28 9:57
 * @Description: 绘制坦克的类
 */
public class MyPanel extends JPanel implements KeyListener ,Runnable{
    //定义我的坦克
    Hero hero = null;

    //定义敌人坦克，放到Vector集合中
    Vector<EnemyTank> enemyTanks = new Vector<EnemyTank>();
    int enemySize = 3;


    public MyPanel() {
        hero = new Hero(100, 400);
        hero.setDirect(0);//默认向上
        hero.setSpeed(10);
        //初始化敌人的坦克
        for (int i = 0; i < enemySize; i++) {
            enemyTanks.add(new EnemyTank(100 * (i + 1), 100));
            enemyTanks.get(i).setDirect(1);//默认向下
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 800, 600);
        //画出自己的坦克
        drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 0);
        //画出敌人坦克
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 1);
        }
        //绘制子弹
        if (hero.bullet != null && hero.bullet.isLive) {
            g.draw3DRect(hero.bullet.x,hero.bullet.y,2,2,false);
        }
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
                g.drawLine(x + 24, y + 16, x + 48, y + 16);//炮筒
                break;
            default:
                break;
        }
    }

//    public void drawBullet(int x, int y, Graphics g, int direct) {
//        g.fillOval(x, y, 2, 2);
//    }

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
        } else if (c == KeyEvent.VK_J) {//按J发射子弹
            hero.shot();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void run() {
        while(true) {
            this.repaint();
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
