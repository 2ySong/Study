package Day_09.codeblock;

/**
 * @Author: Song-zy
 * @Date: 2021/9/30 23:41
 * @Description:
 */
public class CodeBlockExercise01 {
    public static void main(String[] args) {
        System.out.println("total ="+Person.total);//
        System.out.println("total ="+Person.total);
    }
}
class Person{
    public static int total;
    static {
        total = 100;
        System.out.println("in static block! "); //1
    }
}
/*输出
in static block!
100
100
 */