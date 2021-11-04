package Day_11.homework;

/**
 * @Author: Song-zy
 * @Date: 2021/10/5 23:14
 * @Description:
 */
public class Homework04 {
    public static void main(String[] args) {//main方法
        try {
            showExce();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
        System.out.println("D");
    }

    public static void showExce() throws Exception {
        throw new Exception();
    }

}
/*
B
C
D
 */
