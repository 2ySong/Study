package Day_06.HomeWork;

import java.util.Random;
import java.util.Scanner;

/**
 * 有个人Tom设计他的成员变量，成员方法可以电脑猜拳，电脑每次都会随机生成0,1,2
 * 1. 0表示石头1表示剪刀2表示布
 * 2. 并要可以显示Tom的输赢次数(清单)……HomeWork12.java
 */
public class HomeWork12 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        while(true) {
            System.out.println("请猜拳(0表示石头1表示剪刀2表示布):");
            String f = myScanner.next();
            Person person = new Person(f);
            person.compareFist();
        }
    }
}
class Person{
    String fist;
    public Person(String fist){
        this.fist = fist;
    }
    //成员方法
    public void  compareFist(){
        Random random = new Random();
        String r = random.nextInt(3)+"";
        if(r.equals(this.fist)){
            System.out.println("平手");
        }else if(fist.equals("0")&&r.equals("1")){
//            return true;
            System.out.println("石头vs剪刀，你赢了");
        }else if(fist.equals("1")&&r.equals("2")){
//            return true;
            System.out.println("剪刀vs布，你赢了");
        }else if(fist.equals("2")&&r.equals("0")){
//            return true;
            System.out.println("布vs石头，你赢了");
        }else if(r.equals("0")&&fist.equals("1")){
//            return false;
            System.out.println("剪刀vs石头，你输了");
        }else if(r.equals("1")&&fist.equals("2")){
//            return false;
            System.out.println("布vs剪刀，你输了");
        }else if(r.equals("2")&&fist.equals("0")){
//            return true;
            System.out.println("石头vs布，你输了");
        }
    }
}