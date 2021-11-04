package Day_07.encap;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account a = new Account();
        a.setName("jack");
        a.setMoney(1000);
        a.setPassword("123456");
        a.show();
//        System.out.println();
//        Account b = new Account();
//        b.setName("szy");
//        b.setMoney(10);
//        b.setPassword("xyz");
//        b.show();
    }
}
class Account {
    private String name;
    private double money;
    private String password;

    //构造器
    public Account() {
    }

    public Account(String name, double money, String password) {
        this.name = name;
        this.money = money;
        this.password = password;
        setName(name);
        setMoney(money);
        setPassword(password);
    }
    //封装

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //名字只能是2、3、4位
        if(name.length()==2||name.length()==3||name.length()==4) {
            this.name = name;
        }else {
            System.out.println("温馨提示：你的名字长度须为2~4！系统分配默认名为 null-name");
            this.name = "null-name";
        }
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        if(money>20) {
            this.money = money;
        }else {
            System.out.println("温馨提示：你的余额不大于20！系统分配默认余额为 20元");
            this.money = 20;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        //密码长度必须是6位
        if(password.length()==6) {
            this.password = password;
        }else {
            System.out.println("温馨提示：你的密码长度须为6！系统分配默认密码为 000000");
            this.password = "000000";
        }
    }

    public void show() {
        //输入密码，查看信息
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入你的名字：");
        String youName = myScanner.next();
        if(youName.equals(name)) {
            System.out.println("请输入你的密码(三次机会)，查看你的余额！");
            int i = 0;
            while (i < 3) {
                String pwd = myScanner.next();
                if (pwd.equals(password)) {
//                    System.out.println("=====用户信息=====");
                    System.out.println("+------用户信息------+");
                    System.out.println("| 姓名    |  余额    |");
                    System.out.println("+--------+----------+");
                    System.out.println("| "+name+"   | "+money+"   |");
                    System.out.println("+--------+----------+");
                    break;
                } else {
                    System.out.println("温馨提示：你的密码输入有误！还有" + (2 - i) + "次机会");
                }
                i++;
            }
        }else{
            System.out.println("查无此人！！！！！！！");
        }
    }
}