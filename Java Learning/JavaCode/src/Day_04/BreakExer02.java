package Day_04;

import java.util.Scanner;

/*
 * 实现登录验证,有3次机会,如果用户名为"丁真",密码"666"提示登录成功
 * 否则提示还有几次机会,请使用for+ break完成
 */
public class BreakExer02 {
    public static void main(String[]args){
        int i=1;
        Scanner myScanner = new Scanner(System.in);
        String name;
        int pwd;
        for (i=1;i<=3;i++){
            //输入姓名
            System.out.print("请输入你的姓名：");
            name = myScanner.next();
            //输入密码验证
            System.out.print("请输入你的密码：");
            pwd = myScanner.nextInt();

            if(name.equals("丁真") &&pwd==666){//字符串的比较用equals()方法
                System.out.println("登陆成功");
                //若登录成功，则结束循环
                break;
            }else {
                System.out.println("输入错误，还有"+(3-i)+"次机会");
            }
        }
    }
}
