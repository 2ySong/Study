package Day_04;

import java.util.Scanner;

/*
对学生成绩大于60分的,输出"合格"。低于60分的,辅出"不合格"。(注:输入
的成绩不能大于100)提示成绩/60
 */
public class SwitchExer02 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个成绩(0<=score<=100):");
        int score = myScanner.nextInt();
        boolean b = score>=60;
        switch (b+""){
            case "true" :
                System.out.println("合格");
                break;
            case "false" :
                System.out.println("不合格");
                break;
            default:
                System.out.println("你的输入有误，请重新运行输入");
        }
    }
}
