package Day_03;

import java.util.Scanner;

/**
 * 根据用于指定月份,打印该月份所属的季节。34,5春季678夏季910,11.秋季12,1,2冬季[课堂练习提示使用穿透]
 */
public class SwitchExer03{
        public static void main(String[] args){
            System.out.print("请输入一个月份：");
            Scanner myScanner = new Scanner(System.in);
            int month = myScanner.nextInt();
            switch (month){
                case 3:
                case 4:
                case 5:
                    System.out.println(month+"月是春季");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println(month+"月是夏季");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println(month+"月是秋季");
                    break;
                case 1:
                case 2:
                case 12:
                    System.out.println("12月是冬季");
                    break;
                default:
                    System.out.println("输入错误");
            }
        }
}
