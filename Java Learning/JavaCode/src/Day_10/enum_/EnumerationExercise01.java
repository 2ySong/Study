package Day_10.enum_;

/**
 * @Author: Song-zy
 * @Date: 2021/10/4 17:21
 * @Description:
 */

public class EnumerationExercise01 {
    public static void main(String[] args) {
        Gender2 boy = Gender2.BOY;//OK
        Gender2 boy2 = Gender2.BOY;//OK
        System.out.println(boy);//输出BOY //本质就是调用 Gender2 的父类Enum的 toString()
//        public String toString() {
//            return name;
//        }
        System.out.println(boy2 == boy);  //True
    }
}

enum Gender2{ //父类 Enum 的toString
    BOY , GIRL;
}