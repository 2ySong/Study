package day_16.thread;

/**
 * @Author: Song-zy
 * @Date: 2021/10/30 15:24
 * @Description:
 */
public class ThreadState_ {
    public static void main(String[] args) throws InterruptedException {
        T6 t6= new T6();
        Thread thread = new Thread(t6);
        System.out.println(thread.getName() + "的状态是" + thread.getState());
        thread.start();

        while (Thread.State.TERMINATED != thread.getState()) {
            System.out.println(thread.getName() + "的状态是" + thread.getState());
            Thread.sleep(1000);
        }
        System.out.println(thread.getName() + "的状态是" + thread.getState());

    }
}

class T6 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello " + i);
        }
        System.out.println("子线程结束");
    }
}