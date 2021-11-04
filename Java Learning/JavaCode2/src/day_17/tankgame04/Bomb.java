package day_17.tankgame04;

/**
 * @Author: Song-zy
 * @Date: 2021/10/31 8:43
 * @Description: 炸弹类
 */
public class Bomb {
    int x;
    int y;
    int life = 9;//炸弹生命周期
    boolean isLive = true;

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //减少生命值
    public void lifeDown() {
        if (life > 0) {
            life--;
        } else {
            isLive = false;
        }
    }
}
