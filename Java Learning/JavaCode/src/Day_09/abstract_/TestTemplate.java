package Day_09.abstract_;

/**
 * @Author: Song-zy
 * @Date: 2021/10/3 14:51
 * @Description:
 */
public class TestTemplate {
    public static void main(String[] args) {
        A a = new A();
//        a.job();
        B b = new B();
        b.job();
    }
}
class A{
    public void job(){
        long num = 0;
        long start = System.currentTimeMillis();
        for (int i = 1; i < 1000000; i++) {
            num += i;
        }

        long end = System.currentTimeMillis();
        System.out.println("A执行时间："+(end-start)+"ms");
    }
}
class B{
    public void job(){
        long num = 0;
        long start = System.currentTimeMillis();
        for (int i = 1; i < 1000000; i++) {
            num *= i;
        }

        long end = System.currentTimeMillis();
        System.out.println("B执行时间："+(end-start)+"ms");
    }
}