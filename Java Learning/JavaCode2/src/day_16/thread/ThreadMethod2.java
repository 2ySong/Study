package day_16.thread;

/**
 * @Author: Song-zy
 * @Date: 2021/10/30 14:24
 * @Description:
 */
public class ThreadMethod2 {
    public static void main(String[] args) throws InterruptedException {
        T3 t3 = new T3();
        t3.start();

        for (int i = 1; i <=20 ; i++) {
            Thread.sleep(50);
            System.out.println(Thread.currentThread().getName()+"吃包子..."+i);
            if(i==5){
                System.out.println("main让子线程先吃");
//                t3.join();//让子线程先执行--插队--一定会 执行
                t3.yield();//礼让，不一定会成功
                System.out.println("子线程吃完了，该main吃");
            }
        }
    }
}
class T3 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <=20; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() +"吃包子..."+i);
        }
    }
}
