package Day_07.changepass;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author: Song-zy
 * @Date: 2021/9/27 8:45
 * @Description: 使用面向对象编程实现零钱通系统，完成各个功能
 *     1.完成显示菜单，给出对应提示信息
 *     2.完成零钱通明细
 *     3.完成收益入账
 *     4.消费
 *     5.零钱通校验
 */
public class SmallChangeSysOOP {

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

    String costNote = null;

     // 1.完成显示菜单，给出对应提示信息
    public void mainMenu(){
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
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                   this.cost();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误，请重新输入：");
            }
            System.out.println();
        }while(loop);
    }
    //2.零钱通明细
    public void detail(){
        System.out.println(details);
    }
    //3.收益入账
    public void income(){
        System.out.print("收益入账金额:");
        money = myScanner.nextDouble();
        //金额校验
        if(money<=0){
            System.out.println("收益金额应该大于零！");
            return;
        }
        balance += money;
        date = new Date();
        details += "\n收益入账\t+"+money+"\t"+sdf.format(date)+"\t余额："+balance;
    }
    //4.消费
    public void cost(){
        System.out.print("消费金额:");
        money = myScanner.nextDouble();
        //校验
        if(money<=0||money>balance){
            System.out.println("消费金额应该在0~"+balance+"之间！");
            return;
        }
        System.out.print("消费日志:");
        costNote = myScanner.next();
        balance -= money;
        date = new Date();
        details += "\n"+costNote+"\t-"+money+"\t"+sdf.format(date)+"\t余额："+balance;
    }
    public void exit(){
        String overSystem = null;
        //建议一段代码完成一个功能
        //下面这段循环保证，用户必须输入的是y和n，如果不是，就一直选择输入
        while(true){
            System.out.print("你确定要退出吗？(y/n):");
            overSystem = myScanner.next();
            if("y".equals(overSystem)||"n".equals(overSystem)){
                break;
            }
        }
        if("y".equals(overSystem)){
            loop = false;
        }
    }

}
