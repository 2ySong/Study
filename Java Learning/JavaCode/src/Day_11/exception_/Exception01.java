package Day_11.exception_;

/**
 * @Author: Song-zy
 * @Date: 2021/10/5 13:30
 * @Description: 异常
 */
public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        //1.num1/num2=>10/0
        //2.当执行到num1/num2因为num2=0,程序就会出现(抛出)异常 ArithmeticException
        //3.当抛出异常后,程序就退出,崩溃了,下面的代码就不在执行
        //4.大家想想这样的程序好吗?不好,不应该出现了一个不算致命的问题,就导致整个系统崩溃
        //5.java设计者,提供了一个叫异常处理机制来解决该问题
        //        int res = num1/num2;
        //try-catch处理机制；快捷键;CTRL+ALT+t
        //使用了这个异常处理机制，程序可以继续运行
        try {
            int res = num1/num2;
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());//输出异常信息
        }finally {
            System.out.println("不管是否发生异常，始终执行的代码");
        }
        System.out.println("程序运行");
    }
}
