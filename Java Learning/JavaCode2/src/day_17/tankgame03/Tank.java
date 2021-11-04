package day_17.tankgame03;

/**
 * @Author: Song-zy
 * @Date: 2021/10/28 9:53
 * @Description: 坦克类
 */
public class Tank {
    private int x;//坦克横坐标
    private int y;//坦克纵坐标
    private int direct = 0;//控制坦克方向;坦克方向《上0,下1,左2,右3》
    private int speed = 5;//控制坦克速度

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveUp() {
        y -= speed;

    }

    public void moveDown() {
        y += speed;
    }

    public void moveLeft() {
        x -= speed;
    }

    public void moveRight() {
        x += speed;
    }

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
