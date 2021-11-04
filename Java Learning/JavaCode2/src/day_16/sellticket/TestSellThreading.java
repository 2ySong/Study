package day_16.sellticket;/**
 * @Author: Song-zy
 * @Date: 2021/10/28 17:04
 * @Description:
 */public class TestSellThreading {
    public static void main(String[] args) {
        SellTicket01 sellTicket01 = new SellTicket01();
        SellTicket01 sellTicket02 = new SellTicket01();
        SellTicket01 sellTicket03 = new SellTicket01();
        sellTicket01.start();
        sellTicket02.start();
        sellTicket03.start();
        System.out.println("主线程结束");
    }
}
