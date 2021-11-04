package Day_07.object_.hashcode_;

/**
 * @Author: Song-zy
 * @Date: 2021/9/26 20:35
 * @Description: hashCode讲解
 */
public class Hashcode_ {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        System.out.println("a1.hashCode="+a1.hashCode());//2003749087
        System.out.println("a2.hashCode="+a2.hashCode());//1480010240
        A a3 = a1;
        System.out.println("a3.hashCode="+a3.hashCode());//2003749087,同一个对象的hashCode一样
        System.out.println("a3.hashCode="+a3.toString());
        //a3.hashCode=Day_07.object_.hashcode_.A@776ec8df,  a3.hashCode()的16进制
    }
}

class A{}