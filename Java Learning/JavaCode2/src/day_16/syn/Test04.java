package day_16.syn;

/**
 * @Author: Song-zy
 * @Date: 2021/10/30 16:58
 * @Description:
 */
public class Test04 {
    public static void main(String[] args) {
        SellTicket04 sellTicket1 = new SellTicket04();

        new Thread(sellTicket1).start();
        new Thread(sellTicket1).start();
        new Thread(sellTicket1).start();
    }
}

class SellTicket04 implements Runnable {
    private int ticketNum = 30;
    boolean loop = true;
    int i = 0;

    @Override
    public void run() {
        while (loop) {
            sell();
        }
    }

    public /*synchronized*/ void sell() {//同步方法,在同一时刻，只能有一个线程执行run方法

        synchronized (this) {
            if (ticketNum <= 0) {
                System.out.println("+++++++" + Thread.currentThread().getName() + "窗口: 票已经全部售完...");
                loop = false;
                return;
            }
            System.out.println(Thread.currentThread().getName() + "窗口: 售出第" + (++i)
                    + "张票...余票" + (--ticketNum) + "张");
            //休眠100ms
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}