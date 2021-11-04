package Day_11.exception_;

import java.util.Scanner;

/**
 * @Author: Song-zy
 * @Date: 2021/10/5 20:26
 * @Description: 如果用户输入的不是一个整数,就提示他反复输入,直到输入一个整数为止
 */
public class TryExercise04 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("请输入: ");
        int n = 0;
        while(true){
            try {
                //如果不是一个整数,将会抛出一个NumberFormatException异常,捕获到catch块中
                n = Integer.parseInt(myScanner.next());
                break;
            }catch(NumberFormatException e){
                System.out.print("你的输入不是一个整数，请重新输入: ");//提示信息,直到输入的是整数为止
            }
        }
        System.out.println(n);
    }
}
