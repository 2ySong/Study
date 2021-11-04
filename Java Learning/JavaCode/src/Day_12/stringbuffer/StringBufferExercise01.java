package Day_12.stringbuffer;

/**
 * @Author: Song-zy
 * @Date: 2021/10/13 14:02
 * @Description: StringBuffer练习题1
 */
public class StringBufferExercise01 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());//4，"null",看源码

        System.out.println(sb);//null
        StringBuffer sb1 = new StringBuffer(str);//NullPointerException
        System.out.println(sb1);//
    }
}
