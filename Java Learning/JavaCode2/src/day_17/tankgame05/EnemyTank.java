package day_17.tankgame05;

import java.util.Vector;

/**
 * @Author: Song-zy
 * @Date: 2021/10/28 14:40
 * @Description: 敌方坦克
 */
public class EnemyTank extends Tank implements Runnable {
    Vector<Bullet> bullets = new Vector<>();

    public EnemyTank(int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {
        while (true) {
            if (isLive && bullets.size() <=5) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Bullet b = null;
                switch (getDirect()) {
                    case 0:
                        b = new Bullet(getX() + 16, getY(), 0);
                        break;
                    case 1:
                        b = new Bullet(getX() + 16, getY()+48, 1);
                        break;
                    case 2:
                        b = new Bullet(getX(), getY()+16, 2);
                        break;
                    case 3:
                        b = new Bullet(getX()+48, getY()+16, 3);
                        break;
                }

                bullets.add(b);
                new Thread(b).start();
            }
            switch (getDirect()) {
                case 0:
                    for (int i = 0; i < 30; i++) {
                        if (getY() > 0) {
                            moveUp();
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        } else {
                            try {
                                Thread.sleep(10);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            break;
                        }
                    }
                    break;
                case 1:
                    for (int i = 0; i < 30; i++) {
                        if (getY() < 512) {
                            moveDown();
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        } else {
                            try {
                                Thread.sleep(10);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            break;
                        }

                    }
                    break;
                case 2:
                    for (int i = 0; i < 30; i++) {
                        if (getX() > 0) {
                            moveLeft();
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        } else {
                            try {
                                Thread.sleep(10);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            break;
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < 30; i++) {
                        if (getX() < 748) {
                            moveRight();
                            try {
                                Thread.sleep(50);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        } else {
                            try {
                                Thread.sleep(10);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            break;
                        }
                    }
                    break;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setDirect((int) (Math.random() * 4));
            if (!isLive) {
                break;
            }
        }
    }
}
