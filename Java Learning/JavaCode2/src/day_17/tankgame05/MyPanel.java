package day_17.tankgame05;

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
@SuppressWarnings("all")
public class MyPanel extends JPanel implements KeyListener, Runnable {
    //定义我的坦克
    Hero hero = null;

    //定义敌人坦克，放到Vector集合中
    Vector<EnemyTank> enemyTanks = new Vector<EnemyTank>();
    int enemySize = 3;
    //定义炸弹
    static Vector<Bomb> bombs = new Vector<>();


    Image image1 = null;
    Image image2 = null;
    Image image3 = null;


    public MyPanel() {
        hero = new Hero(100, 400);
        hero.setDirect(0);//默认向上
        hero.setSpeed(10);
        //初始化敌人的坦克
        for (int i = 0; i < enemySize; i++) {
            EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 100);
            enemyTank.setDirect(1);
//            int dir = (int)(Math.random()*3);
//            enemyTank.setDirect(dir);
            new Thread(enemyTank).start();//让坦克动起来
            Bullet bullet = new Bullet(enemyTank.getX() + 16, enemyTank.getY() + 48, enemyTank.getDirect());
            enemyTank.bullets.add(bullet);
            new Thread(bullet).start();
            enemyTanks.add(enemyTank);

        }
        image1 = Toolkit.getDefaultToolkit().getImage("/E:\\Study\\Java Learning\\JavaCode2\\src\\day_17\\image\\b1.jpg");
        image2 = Toolkit.getDefaultToolkit().getImage("/E:\\Study\\Java Learning\\JavaCode2\\src\\day_17\\image\\b2.jpg");
        image3 = Toolkit.getDefaultToolkit().getImage("/E:\\Study\\Java Learning\\JavaCode2\\src\\day_17\\image\\b3.jpg");
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 800, 600);
        //画出自己的坦克
        if (hero.isLive && hero != null) {
            drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 0);
        }
        //画出敌人坦克
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            if (enemyTank.isLive) {
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 1);
                //画出子弹
                for (int j = 0; j < enemyTank.bullets.size(); j++) {
                    //取出子弹
                    Bullet bullet = enemyTank.bullets.get(j);
                    //绘制
                    if (bullet.isLive) {
                        g.draw3DRect(bullet.x, bullet.y, 2, 2, false);
                    } else {
                        enemyTank.bullets.remove(bullet);
                    }
                }
            }

        }
        //绘制子弹
        for (Bullet b : hero.bullets) {
            if (b != null && b.isLive) {
                g.draw3DRect(b.x, b.y, 2, 2, false);
            } else {
                hero.bullets.remove(b);//删除子弹
            }
        }
//
//        if (hero.bullet != null && hero.bullet.isLive) {
//            g.draw3DRect(hero.bullet.x, hero.bullet.y, 2, 2, false);
//        }
        //绘制爆炸效果
        for (int i = 0; i < bombs.size(); i++) {
            Bomb b = bombs.get(i);
            if (b != null) {
                if (b.life > 6) {
                    g.drawImage(image1, b.x, b.y, 60, 60, this);
                } else if (b.life > 3) {
                    g.drawImage(image2, b.x, b.y, 60, 60, this);
                } else if (b.life > 0) {
                    g.drawImage(image3, b.x, b.y, 60, 60, this);
                }
                b.lifeDown();
                try {
                    Thread.sleep(80);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if (b.life == 0) {
//                    b.isLive = false;
                    bombs.remove(b);
                }
            }
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

    public void hitEnemyTank() {
//        for (int j = 0; j < hero.bullets.size(); j++) {
//            Bullet bullet = hero.bullets.get(j);
//            //击中坦克，销毁
//            if (bullet != null && bullet.isLive) {
//                for (EnemyTank et : enemyTanks) {
//                    hitTank(bullet, et);
//                }
//            }
//        }
        if (hero.bullet != null && hero.bullet.isLive) {
            for (EnemyTank et : enemyTanks) {
                hitTank(hero.bullet, et);
            }
        }

    }

    //判断是否击中我防坦克
    public void hitHero(){
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank et = enemyTanks.get(i);
            for (int j = 0; j < et.bullets.size(); j++) {
                Bullet b = et.bullets.get(j);
                if (b.isLive && hero.isLive) {
                    hitTank(b, et);
                }
            }
        }

    }

    //判断子弹是否击中敌方坦克
    public void hitTank(Bullet b, Tank et) {
        if (b.isLive && et.isLive) {
            switch (et.getDirect()) {
                case 0://上
                case 1://下
                    if (b.x > et.getX() && b.x < et.getX() + 32 && b.y > et.getY() && b.y < et.getY() + 48) {
                        b.isLive = false;
                        et.isLive = false;
//                        enemyTanks.remove(et);
                        Bomb bomb = new Bomb(et.getX(), et.getY());
                        bombs.add(bomb);
                    }
                    break;
                case 2:
                case 3:
                    if (b.x > et.getX() && b.x < et.getX() + 48 && b.y > et.getY() && b.y < et.getY() + 32) {
                        b.isLive = false;
                        et.isLive = false;
                        Bomb bomb = new Bomb(et.getX(), et.getY());
                        bombs.add(bomb);
//                        return true;
                    }
                    break;
            }
        }
//        return false;
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
        } else if (c == KeyEvent.VK_J) {//按J发射子弹
//            if (hero.bullet == null || !hero.bullet.isLive) {
//                hero.shot();
//            }
            hero.shot();
        }
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void run() {
        while (true) {
            this.repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //击中坦克，销毁
            hitEnemyTank();
            //击中我方坦克，销毁
//            for (EnemyTank et: enemyTanks) {
//                for (int i = 0; i < et.bullets.size(); i++) {
//                    if(et.bullets.get(i)!=null&&hero.isLive){
//                        hitHero();
//                    }
//                }
//            }
            hitHero();

        }
    }
}
