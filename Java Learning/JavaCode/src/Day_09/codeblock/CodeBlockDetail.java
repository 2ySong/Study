package Day_09.codeblock;

/**
 * @Author: Song-zy
 * @Date: 2021/9/30 14:13
 * @Description:
 */
public class CodeBlockDetail {
    public static void main(String[] args) {
//        AA a = new AA();
//        BB b = new BB();
        System.out.println(AA.n);
    }

}
class AA{
    public static int n = 0;
    //静态代码块
    static {
        System.out.println("AA的静态代码块被执行");
    }
}
class BB extends AA{
    static{
        System.out.println("BB的静态代码块被执行");
    }
}