package Day_11.exception_;

/**
 * @Author: Song-zy
 * @Date: 2021/10/5 19:36
 * @Description:
 */
public class TryExercise01 {
    public static int method() {
        try {
            String[] names = new String[3];
            if (names[1].equals("tom")) {
                System.out.println(names[1]);
            } else {
                names[3] = "hspedu";
            }
            return 1;
        } catch(ArrayIndexOutOfBoundsException e){
            return 2;
        } catch(NullPointerException e){
            return 3;
        } finally{
            return 4;
        }
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}
/*输出结果
4
 */