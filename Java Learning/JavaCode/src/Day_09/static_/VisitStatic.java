package Day_09.static_;

/**
 * @Author: Song-zy
 * @Date: 2021/9/29 23:17
 * @Description:
 */
public class VisitStatic {
    public static void main(String[] args) {
        //调用类变量name,类名.类变量名
        //类变量是随着类的加载而创建，不用创建对象实例也可以调用
        System.out.println(A.name);
        //也可以通过对象实例调用
        A a = new A();
        System.out.println(a.name);
    }
}
class A{
    public static String name = "jack";
}