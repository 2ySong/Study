package Day_07.object_.equals_;


/**
 * @Author: Song-zy
 * @Date: 2021/9/26 19:55
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name ="hspedu";
        Person p2 = new Person();
        p2.name ="hspedu";
        System.out.println(p2.hashCode());

        System.out.println(p1==p2);//false
        System.out.println(p1.name.equals( p2.name));//true
        System.out.println(p1.equals(p2));//false
        String s1 = new String("asdf");
        String s2 = new String("asdf" );
        System.out.println(s1.equals(s2));//true
        System.out.println(s1==s2);//false
    }
}
