package Day_12.wrapper;

/**
 * @Author: Song-zy
 * @Date: 2021/10/9 12:41
 * @Description:
 */
public class WrapperExercise01 {
    public static void main(String[] args) {
        Double d = 100d;//Double.valueOf(100d)
        Float f = 1.5f;//自动装箱Float.valueOf(1.5F)
        Object obj1 = true? Integer.valueOf(1) : Double.valueOf(2.0);
        System.out.println(obj1);//1.0
        //
        Object obj2;
        if(true){
            obj2 = Integer.valueOf(1);
        }else{
            obj2 = Double.valueOf(2.0);
        }
        System.out.println(obj2);//1
    }
}
