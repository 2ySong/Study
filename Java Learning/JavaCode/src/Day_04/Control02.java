package Day_04;

import java.util.Scanner;

/*
判断一个整数是否大于0
 */
public class Control02 {
    public static void main(String[]args){
        Scanner myScanner = new Scanner(System.in);
        double number;
        while (true){
            System.out.println("请输入一个数：");
            number = myScanner.nextDouble();
            if(number==0)
                System.out.println("你输入的数为0");
            else if(number<0)
                System.out.println("你输入的数小于0");
            else
                System.out.println("你输入的数大于0");
        }
    }
}
