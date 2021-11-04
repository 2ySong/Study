package Day_11.customexception;

/**
 * @Author: Song-zy
 * @Date: 2021/10/5 21:43
 * @Description:
 */
public class ThrowException {
    public static void main(String[] args) {
        try {
            ReturnExceptionDemo.methodA();
        } catch (Exception e) {
            System.out.println(e.getMessage());//制造异常
        }
        ReturnExceptionDemo.methodB();

    }
}

class ReturnExceptionDemo {
    static void methodA() {
        try {
            System.out.println("进入方法A");
            throw new RuntimeException("制造异常");
        } finally {
            System.out.println("用A方法的finally");
        }
    }

    static void methodB() {
        try {
            System.out.println("进入方法B");
            return;
        } finally {
            System.out.println("调用B方法的finally");
        }
    }
}
/*
进入方法A
用A方法的finally
制造异常
进入方法B
调用B方法的finally
 */