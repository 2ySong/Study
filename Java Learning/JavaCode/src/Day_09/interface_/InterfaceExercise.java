package Day_09.interface_;

/**
 * @Author: Song-zy
 * @Date: 2021/10/3 19:00
 * @Description:
 */
public class InterfaceExercise {
    public static void main(String[] args) {
        C c = new C();
        c.pX1();
        c.pX2();
    }
}
interface A{
    int x = 0;
}
class B{
    int x = 1;
}
class C extends B implements A{
    public void pX1(){
        System.out.println(A.x);//接口中的x
    }

    public void pX2(){
        System.out.println(super.x);//父类中x
    }

}