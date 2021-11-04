package day_16.thread;

/**
 * @Author: Song-zy
 * @Date: 2021/10/30 14:50
 * @Description: 如何设置守护线程
 */
public class ThreadMethod3 {
    public static void main(String[] args) throws InterruptedException {
        T5 t5 = new T5();
        t5.setDaemon(true);//设置成为守护线程
        t5.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("强哈哈哈哈哈"+(i+1));
            Thread.sleep(1000);
        }
    }
}

class T5 extends Thread {
    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hhhh哈不完....");
        }
    }
}