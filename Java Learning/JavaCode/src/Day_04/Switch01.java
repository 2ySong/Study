package Day_04;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args){
        //演示switch用法
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please input a char(a~f):");
        char c1 = myScanner.next().charAt(0);
        //在java中，只要有值返回，就是一个表达式
        switch(c1){
            case 'a':
                System.out.println("今天星期一");
                break;
            case 'b':
                System.out.println("今天星期二");
                break;
            case 'c':
                System.out.println("今天星期三");
                break;
            case 'd':
                System.out.println("今天星期四");
                break;
            case 'e':
                System.out.println("今天星期五");
                break;
            case 'f':
                System.out.println("今天星期六");
                break;
            default:
                System.out.println("今天星期日");
        }
        System.out.println("switch结束");
    }
}
