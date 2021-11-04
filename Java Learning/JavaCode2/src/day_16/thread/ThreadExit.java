package day_16.thread;

/**
 * @Author: Song-zy
 * @Date: 2021/10/28 17:55
 * @Description:
 */
public class ThreadExit {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.start();
        Thread.sleep(5 * 1000);//5秒结束
        t.setLoop(false);
    }
}

class T extends Thread {
    int n = 0;
    private boolean loop = true;

    @Override
    public void run() {
        Thread.currentThread().setName("ThreadhHHH");//修改线程名
        while (loop) {
            System.out.println(Thread.currentThread().getName() + (++n));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}