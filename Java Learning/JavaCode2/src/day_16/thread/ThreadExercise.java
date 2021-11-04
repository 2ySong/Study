package day_16.thread;

/**
 * @Author: Song-zy
 * @Date: 2021/10/30 14:35
 * @Description:
 */
public class ThreadExercise {
    public static void main(String[] args) throws InterruptedException {
        T4 t4 = new T4();
        Thread thread = new Thread(t4);
        for (int i = 1; i <= 10; i++) {
            Thread.sleep(100);
            System.out.println("hi "+i);
            if(i==5){
                thread.start();
                thread.join();
            }
        }
        System.out.println("主线程结束");
    }
}
class T4 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <=10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello "+i);
        }
        System.out.println("子线程结束");
    }
}