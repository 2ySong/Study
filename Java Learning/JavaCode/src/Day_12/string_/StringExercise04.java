package Day_12.string_;

/**
 * @Author: Song-zy
 * @Date: 2021/10/10 1:27
 * @Description:
 */
public class StringExercise04 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name ="hspedu";
        Person p2 = new Person();
        p2.name ="hspedu";

        System.out.println(p1.name.equals(p2.name));//true
        System.out.println(p1.name==p2.name);//true
        System.out.println(p1.name=="hspedu");//true
        String s1 = new String("bcde");
        String s2 = new String("bcde");
        System.out.println(s1==s2);//false
    }
}
class Person {
    public String name;
}