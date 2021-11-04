package Day_09.codeblock;

/**
 * @Author: Song-zy
 * @Date: 2021/9/30 21:09
 * @Description:
 * - 1. 创建一个对象时，在一个**类调用顺序**是:(重点，难点)🎈
 *      ①**调用静态代码块和静态属性初始化**
 *          (注意:静态代码块和静态属性初始化调用的优先级一样，
 *          如果有多个静态代码块和多个静态变量初始化，则按他们定义的顺序调用)
 *      ②**调用普通代码块和普通属性的初始化**
 *          (注意:普通代码块和普通属性初始化调用的优先级一样，
 *          如果有多个普通代码块和多个普通属性初始化，则按定义顺序调用)
 *      ③**调用构造方法**
 */
public class CodeBlockDetail02 {
    public static void main(String[] args) {
        AB ab = new AB();
    }
}
class AB{
    //无参构造器
    public AB() {
        System.out.println("午无参造器被调用");
    }

    public int n2 =getN2();
    {
        System.out.println("AB的普通代码块被执行");
    }
    public int getN2(){
        System.out.println("getN2被调用");
        return 10;
    }
    public void say(){
        System.out.println("普通方法");
    }
    public static int n1 = getN1();
    static{
        System.out.println("AB的静态代码块被执行");
    }

    public static int getN1(){
        System.out.println("getN1()被调用");
        return 100;
    }
}