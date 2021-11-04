package day_17.tankgame03;

/**
 * @Author: Song-zy
 * @Date: 2021/10/30 21:08
 * @Description: 子弹类
 */
public class Bullet implements Runnable {
    int x;//子弹横坐标
    int y;//子弹纵坐标
    int direct = 0;//控制子弹方向;坦克方向《上0,下1,左2,右3》
    int speed = 1;//控制子弹速度
    boolean isLive = true;//子弹是否存活

    public Bullet(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {
        while (true) {
            //休眠
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            switch (direct) {
                case 0://上
                    y -= speed;
                    break;
                case 1://下
                    y += speed;
                    break;
                case 2://左
                    x -= speed;
                    break;
                case 3://右
                    x += speed;
                    break;
            }
//            System.out.println("x=" + x + "y=" + y);
            //判断条件。销毁子弹
            if (!(x >= 0 && x <= 800 && y >= 0 && y <= 600)) {
                isLive = false;
                break;
            }
        }
    }
}
