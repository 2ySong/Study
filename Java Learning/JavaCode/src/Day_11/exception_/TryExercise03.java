package Day_11.exception_;

/**
 * @Author: Song-zy
 * @Date: 2021/10/5 20:16
 * @Description:
 */
public class TryExercise03 {
    public static int method(){
        int i=1;
        try {
            i++;
            String[] names = new String[3];
            if(names[1].equals("tom")){
                System.out.println(names[1]);
            }else{
                names[3]="hspeu";
            }
            return 1;
        }catch(ArrayIndexOutOfBoundsException e){
            return 2;
        }catch(NullPointerException e) {
            return ++i;
        }finally {
            ++i;
            System.out.println("i="+i);
        }
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}
/*输出结果
i=4
3
 */