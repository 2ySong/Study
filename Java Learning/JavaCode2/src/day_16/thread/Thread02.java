package day_16.thread;

/**
 * @Author: Song-zy
 * @Date: 2021/10/28 16:16
 * @Description: 通过实现Runnable接口创建多线程
 */
public class Thread02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Thread thread = new Thread(dog);
        thread.start();
    }
}

class Dog implements Runnable {
    int n = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("小狗汪汪叫。。" + (++n) + " " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (n == 10) {
                break;
            }
        }
    }
}