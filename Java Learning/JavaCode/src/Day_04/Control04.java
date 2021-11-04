package Day_04;

import java.util.Scanner;

/**
 *判断一个数是否为水仙花数。所谓水仙花数是指一个3位数,其各个位上数字立方和等于其本身。
 * 例如:153=1*1*1+3*3*3+5*5*5
 */
public class Control04 {
    public static void main(String[]args){
        Scanner myScanner = new Scanner(System.in);
        int number;
        while (true){
            System.out.println("请输入一个三位数：");
            number = myScanner.nextInt();
            int n1=number/100;
            int n2=number%100/10;
            int n3=number-n1*100-n2*10;
            if(number==n1*n1*n1+n2*n2*n2+n3*n3*n3)
                System.out.println(number+"是水仙花数");
            else
                System.out.println(number+"不是水仙花数");
        }
    }
}
