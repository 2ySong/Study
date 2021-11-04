package Day_03;

import java.util.Scanner;

public class input {
    public static void main(String[] args){
        //演示接受用户的输入
        //步骤
        // Scanner类表示简单文本扫描器,在java.uti1包
        //1.引入/导入 Scanner类所在的包
        //2.创建 Scanner对象,new创建一个对象,体会
        // myScanner就是 Scanner类的对象
        Scanner myScanner= new Scanner(System.in);
        //3.接收用户输入了,使用相关的方法
        System.out.println("请输入名字：");
        String name= myScanner.next();//接收用户输入
        System.out.println("请输入年纪：");
        String age= myScanner.next();//接收用户输入
        System.out.println("名字："+name+'\t'+"年纪："+age);
    }
}

