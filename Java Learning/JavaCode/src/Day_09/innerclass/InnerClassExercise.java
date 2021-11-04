package Day_09.innerclass;

/**
 * @Author: Song-zy
 * @Date: 2021/10/4 16:15
 * @Description:
 */
public class InnerClassExercise {

}
class Test {
    public Test(){
        Inner s1= new Inner();
        s1.a=10;
        Inner s2= new Inner();
        System.out.println(s2.a);
    }

    class Inner {//内部类,成员内部类
        public int a = 5;
    }
    public static void main(String[] args) {
        Test t = new Test();
        Inner r = t.new Inner();
        System.out.println(r.a);
    }
}
