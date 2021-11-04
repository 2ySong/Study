package day_16.thread;

/**
 * @Author: Song-zy
 * @Date: 2021/10/28 16:34
 * @Description: 在主线程中启动两个子线程; 实现Runnable接口
 */
public class Thread03 {
    public static void main(String[] args) throws InterruptedException {
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread1 = new Thread(t1);
        thread1.start();
        Thread thread2 = new Thread(t2);
        thread2.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程--"+Thread.currentThread().getName());
            Thread.sleep(1000);
        }
    }
}

class T1 implements Runnable {
    int count = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("Hello,World " + (++count) + " --" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);//间隔一秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10) {
                break;
            }
        }

    }
}

class T2 implements Runnable {
    int count = 0;

    @Override
    public void run() {
//        System.out.println();
        while (true) {
            System.out.println("Hi " + (++count) + " --" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);//间隔一秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10) {
                break;
            }
        }
    }
}
