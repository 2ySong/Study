package day_16.thread;

/**
 * @Author: Song-zy
 * @Date: 2021/10/28 15:27
 * @Description: 继承Thread类实现线程
 */
public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        cat.start();//启动线程

        System.out.println("主线程正在执行。。" + Thread.currentThread().getName());
        for (int i = 0; i < 8; i++) {
            System.out.println("主线程" + i);
            //让主线程休眠一秒
            Thread.sleep(1000);
        }

    }
}

//继承了Thread，该类就是一个线程类
class Cat extends Thread {
    @Override
    public void run() {
        int n = 0;
        while (true) {
            System.out.println("喵喵，我是小猫咪" + (++n) + " 线程名：" + Thread.currentThread().getName());
            //让该线程休眠1秒
            try {
                Thread.sleep(1000);//间隔1秒输出一次
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (n == 8) {
                break;//结束线程
            }
        }
    }
}