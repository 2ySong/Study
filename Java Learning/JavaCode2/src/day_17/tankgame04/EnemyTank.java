package day_17.tankgame04;

import java.util.Vector;

/**
 * @Author: Song-zy
 * @Date: 2021/10/28 14:40
 * @Description: 敌方坦克
 */
public class EnemyTank extends Tank implements Runnable {
    Vector<Bullet> bullets = new Vector();

    public EnemyTank(int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {
        while (true) {
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
