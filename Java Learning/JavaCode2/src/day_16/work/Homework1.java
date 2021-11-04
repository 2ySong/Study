package day_16.work;

import java.util.Locale;
import java.util.Scanner;

/**
 * @Author: Song-zy
 * @Date: 2021/10/30 17:25
 * @Description:
 */
public class Homework1 {
    public static void main(String[] args) {
        T11 t11 = new T11();
        T12 t12 = new T12(t11);

        new Thread(t11).start();
        new Thread(t12).start();

    }
}

class T11 implements Runnable {
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        while (loop) {
            System.out.println((int) (Math.random() * 100));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("T11线程退出");
    }

}

class T12 implements Runnable {
    private T11 t11;
    Scanner myScanner = new Scanner(System.in);

    public T12(T11 t11) {
        this.t11 = t11;
    }

    @Override
    public void run() {
        while(true) {
            System.out.println("输入字符：");
            char c = myScanner.next().toUpperCase().charAt(0);
            if (c == 'Q') {
                t11.setLoop(false);
                break;
            }
        }
    }
}