package Day_09.innerclass;

/**
 * @Author: Song-zy
 * @Date: 2021/10/3 19:30
 * @Description: 内部类详解
 */
public class InnerClass01 {
}
class Outer {//外部类

    private int n1 = 100;

    public Outer(int n1) {
        this.n1 = n1;
    }
    public void m1(){
        System.out.println("方法");
    }
    //代码块
    {
        System.out.println("代码块");
    }
    //内部类
    class Inner{

    }
}