package Day_11.homework;

/**
 * @Author: Song-zy
 * @Date: 2021/10/5 23:13
 * @Description:
 */
public class Homework03 {
    public static void func() {//静态方法
        try {
            throw new RuntimeException();
        } finally {
            System.out.println("B");
        }
    }

    public static void main(String[] args) {//main方法
        try {
            func();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("C");
        }
        System.out.println("D");
    }


}
/*
B
C
D
 */