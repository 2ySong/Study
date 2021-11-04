package day_16.work;

/**
 * @Author: Song-zy
 * @Date: 2021/10/30 17:58
 * @Description:
 */
public class Homework2 {
    public static void main(String[] args) {
        T2 t2 = new T2();
        new Thread(t2).start();
        new Thread(t2).start();
        new Thread(t2).start();
    }
}

class T2 implements Runnable {
    private static double balance = 10000;
    private boolean loop = true;


    public void run() {
        while (loop) {
            synchronized (this) {
                if (balance < 1000) {
                    loop = false;
                    return;
                }
                balance -= 1000;
                System.out.println(Thread.currentThread().getName() + "取走1000元钱, 余额: " + balance + "元");
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}