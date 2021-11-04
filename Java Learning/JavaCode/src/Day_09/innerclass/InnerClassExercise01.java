package Day_09.innerclass;

/**
 * @Author: Song-zy
 * @Date: 2021/10/4 0:39
 * @Description: 匿名内部类的使用场景---当作实参传递
 */
public class InnerClassExercise01 {
    public static void main(String[] args) {
        f1(new AA(){
            @Override
            public void cry(){
                System.out.println("AA--cry()");
            }
        });
    }
    public static void f1(AA ia){
        ia.cry();
    }
}
interface AA{
    void cry();
}

