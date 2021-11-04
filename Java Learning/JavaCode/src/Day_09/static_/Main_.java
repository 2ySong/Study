package Day_09.static_;

/**
 * @Author: Song-zy
 * @Date: 2021/9/30 9:59
 * @Description: 了解main方法,String[] args,是一个字符串数组
 * main方法本质上是一个静态方法，遵循静态方法的规则，只能访问类的静态成员。
 */
public class Main_ {
    private static int n=1999;//静态变量
    int s = 900;//非静态变量
    public static void main(String[] args) {
        System.out.println(Main_.n);
//        System.out.println(Main_.s);//不能访问非静态成员
        //通过创建对象访问
        Main_ main_ = new Main_();
        System.out.println(main_.s);
        for (int i = 0; i < args.length; i++) {
            System.out.println("args["+i+"]="+args[i]);
        }
    }
}
