package Day_07.changepass;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author: Song-zy
 * @Date: 2021/9/27 0:16
 * @Description: 零钱通项目【过程编程】
 */
public class SmallChangeSys {

    // 1.完成显示菜单，给出对应提示信息
    //2.完成零钱通明细
    //3.完成收益入账
    //4.消费
    //5.零钱通校验
    public static void main(String[] args) {
        //定义相关的变量
        Scanner myScanner = new Scanner(System.in);
        String key = "";
        boolean loop = true;

        //完成零钱通明细
        //通过字符串拼接
        String details = "+-+-+-+-+-+-+-+-+-+零钱通明细+-+-+-+-+-+-+-+-+-+";
        //3.完成收益入账
        double money = 0;
        double balance = 0;
        Date date = null;//得到时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//转换日期格式

        //4，消费
//        double costMoney = 0;
        String costNote = null;

        //5.判断是否退出
        do{
            System.out.println("+-+-+-+-+-+-+-+-+-+零钱通系统+-+-+-+-+-+-+-+-+-+");
            System.out.println("\t\t1. 零钱通明细");
            System.out.println("\t\t2. 收益入账");
            System.out.println("\t\t3. 消   费");
            System.out.println("\t\t4. 退   出");

            System.out.print("输入你的选择(1~4)：");
            //输入项目代号key
            key = myScanner.next();

            //switch分支控制
            switch(key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.print("收益入账金额:");
                    money = myScanner.nextDouble();
                    //金额校验
                    if(money<=0){
                        System.out.println("收益金额应该大于零！");
                        break;
                    }
                    balance += money;
                    date = new Date();
                    details += "\n收益入账\t+"+money+"\t"+sdf.format(date)+"\t余额："+balance;
                    break;
                case "3":
                    System.out.print("消费金额:");
                    money = myScanner.nextDouble();
                    //校验
                    if(money<=0||money>balance){
                        System.out.println("消费金额应该在0~"+balance+"之间！");
                        break;
                    }
                    System.out.print("消费日志:");
                    costNote = myScanner.next();
                    balance -= money;
                    date = new Date();
                    details += "\n"+costNote+"\t-"+money+"\t"+sdf.format(date)+"\t余额："+balance;
                    break;
                case "4":
                    String exit = null;
                    //建议一段代码完成一个功能
                    //下面这段循环保证，用户必须输入的是y和n，如果不是，就一直选择输入
                    while(true){
                        System.out.print("你确定要退出吗？(y/n):");
                        exit = myScanner.next();
                        if("y".equals(exit)||"n".equals(exit)){
                            break;
                        }
                    }
                    if("y".equals(exit)){
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("选择有误，请重新输入：");
            }
            System.out.println();
        }while(loop);
        System.out.println("温馨提示：你已经成功退出零钱通系统！");
    }
}
