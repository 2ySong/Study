package Day_12.homework;

import java.util.Scanner;

/**
 * @Author: Song-zy
 * @Date: 2021/10/22 18:21
 * @Description: 邮箱问题
 * 输入用户名，密码，邮箱，如果信息录入正确，则提示注册成功，否则生成异常对象
 * 要求：
 * 1.用户名长度2~4
 * 2.密码长度为6，全为数字
 * 3.邮箱中包含@和.，并且@在.的前面
 */
public class Homework02 {
    public static void main(String[] args) {
        String name;
        String password;
        String mail;
        Scanner myScanner = new Scanner(System.in);
        System.out.println("+-+-+-+-+-欢迎注册邮箱😘-+-+-+-+-+");
        System.out.print("用户名(2~4位):");
        name = myScanner.next();
        System.out.print("密码(6位数字):");
        password = myScanner.next();

        System.out.print("邮箱(包含@和.并且@在前):");
        mail = myScanner.next();
        try{
            Email.isName(name);
            Email.isPassword(password);
            Email.isMail(mail);
            //实例化email类
            Email email = new Email(name, password, mail);
            System.out.println("注册成功\n"+email);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


    }
}

class Email {
    private String name;
    private String password;
    private String mail;

    public Email(String name, String password, String mail) {
        this.name = name;
        this.password = password;
        this.mail = mail;
    }

    //1.用户名长度2~4
    public static void isName(String name) {
        int len = name.length();
        if (len > 4 || len < 2) {
            throw new RuntimeException("用户名长度不正确");
        }
    }

    //2.密码长度为6，全为数字
    public static void isPassword(String password) {
        if (!(password.length()==6||Email.isDigit(password))) {
            throw new RuntimeException("密码不全为数字或者密码长度不正确");
        }
    }

    //3.邮箱中包含@和.，并且@在.的前面
    public static void isMail(String mail) {
        int m = mail.indexOf('@');
        int n = mail.indexOf('.');
        if (m <= 0 || n <= 0 || m > n) {
            throw new RuntimeException("邮箱中不包含@和.或者@不在.的前");
        }
    }
    //判断密码是否全为数字
    public static boolean isDigit(String password){
        char[] chars = password.toCharArray();
        for (int i = 0; i < chars.length; i++){
            if(chars[i] < '0' ||chars[i] > '9'){
                return false;
            }
        }
        return true;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "email{" +
                "name='" + name + '\'' +
                ", password=" + password +
                ", mail='" + mail + '\'' +
                '}';
    }
}