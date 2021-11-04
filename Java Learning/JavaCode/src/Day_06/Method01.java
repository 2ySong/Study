package Day_06;

import java.util.Scanner;

/**
 * 认识成员方法
 */
public class Method01 {
    public static void main(String[] args) {
        Person1 per1 = new Person1();
        //调用成员方法speak，输出“我是一个好人”
        per1.speak();
        per1.sayOkay();
        //调用cal01成员方法可以计算从1+…+1000的结果
        per1.cal01();
        //添加ca0l2成员方法该方法可以接收一个数n,计算从1+…+n的结果
        per1.cal02(4);
        System.out.println(per1.getSum(6,9));
    }
}
//创建Person1类
class Person1{
    //成员变量
    String name;
    int age;
    //成员方法
    //添加一个speak方法，输出“我是一个好人”
    //public表示方法是公开的；void表示没有返回值；()表示：形参列表
    public void speak(){
        System.out.println("我是一个好人");
    }//方法体
    public void sayOkay(){
        System.out.println("可以直接调用该类中的speak方法");
        speak();
        //调用A类中的方法
        //new一个A对象
        A a = new A();
        a.abc();//调用leiA中的方法abc
        System.out.println("i  am ok");
    }
    //添加cal01成员方法可以计算从1+…+1000的结果
    public void cal01(){
        int sum1 = 0;
        for(int i=1; i<1000; i++){
            sum1 += i;
        }
        System.out.println("1+…+1000 = "+sum1);
    }
    //添加ca0l2成员方法该方法可以接收一个数n,计算从1+…+n的结果
    //(int n)表示形参列表，用户可以接收一个n
    public void cal02(int n){
        int sum1 = 0;
        for(int i=1; i<=n; i++){
            sum1 += i;
        }
        System.out.println("1+…+n = "+sum1);
    }
    //添加 getSum成员方法可以计算两个数的和
    //int表示方法执行后，返回一个int值
    //(int x,int y)表示形参列表，用户可以接收两个int
    // return res:表示把res的值返回
    public int getSum(int x,int y){
        int res = x + y;
        return res;
    }
}
class A{
    public void abc(){
        System.out.println("我是A类中的方法");
    }
}