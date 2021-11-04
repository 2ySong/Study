package day_16.sellticket;

/**
 * @Author: Song-zy
 * @Date: 2021/10/28 16:57
 * @Description:
 */
public class SellTicket01 extends Thread {
    private static int ticketNum = 10;

    @Override
    public void run() {
//        int ticketNum = 10;
        int i = 0;
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("+++++++"+Thread.currentThread().getName() + "窗口: 10张票全部售完...");
                break;
            }
            //休眠100ms
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "窗口: 售出第" + (++i)
                    + "张票...余票" + (--ticketNum) + "张");
        }
    }
}
class SellTicket02 implements Runnable{
    private static int ticketNum = 10;

    @Override
    public void run() {
//        int ticketNum = 10;
        int i = 0;
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("+++++++"+Thread.currentThread().getName() + "窗口: 10张票全部售完...");
                break;
            }
            //休眠100ms
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "窗口: 售出第" + (++i)
                    + "张票...余票" + (--ticketNum) + "张");
        }
    }
}