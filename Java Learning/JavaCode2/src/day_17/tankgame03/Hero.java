package day_17.tankgame03;

/**
 * @Author: Song-zy
 * @Date: 2021/10/28 9:54
 * @Description: 我自己的坦克
 */
public class Hero extends Tank {
    Bullet bullet = null;//定义一个子弹对象，表示射击

    public Hero(int x, int y) {
        super(x, y);
    }

    //射击方法
    public void shot() {
        switch (this.getDirect()) {
            case 0://上
                bullet = new Bullet(getX() + 16, getY(), 0);
                break;
            case 1://下
                bullet = new Bullet(getX() + 16, getY() + 48, 1);
                break;
            case 2://左
                bullet = new Bullet(getX(), getY() + 16, 2);
                break;
            case 3://右
                bullet = new Bullet(getX() + 48, getY() + 16, 3);
                break;
        }
        new Thread(bullet).start();
    }
}