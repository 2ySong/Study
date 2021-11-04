package day_16.sellticket;

/**
 * @Author: Song-zy
 * @Date: 2021/10/28 17:47
 * @Description:
 */
public class TestRunnable {
    public static void main(String[] args) {
        SellTicket02 sellTicket1 = new SellTicket02();
//        SellTicket02 sellTicket2 = new SellTicket02();
//        SellTicket02 sellTicket3 = new SellTicket02();

        new Thread(sellTicket1).start();
        new Thread(sellTicket1).start();
        new Thread(sellTicket1).start();
    }
}
