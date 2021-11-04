package Day_04;

import java.util.Scanner;

/**
 * 判断闰年
 */
public class Control03 {
    public static void main(String[]args){
        Scanner myScanner = new Scanner(System.in);
        int year;
        for(int i=1;;i++){
            System.out.println("请输入一个年份：");
            year = myScanner.nextInt();
            if(year%100==0&&year%400==0){
                System.out.println(year+"年是闰年\n");
            }else if(year%100!=0&&year%4==0){
                System.out.println(year+"年是闰年\n");
            }else {
                System.out.println(year+"年不是闰年");
            }
        }
    }
}
