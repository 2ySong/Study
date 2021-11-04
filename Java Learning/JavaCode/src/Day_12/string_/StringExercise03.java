package Day_12.string_;

/**
 * @Author: Song-zy
 * @Date: 2021/10/9 15:08
 * @Description:
 */
public class StringExercise03 {
    public static void main(String[] args) {
        String a = "hsp";
        String b = new String("hsp");
        System.out.println(a.equals(b));//true
        System.out.println(a == b);//false
//        intern()返回字符串对象的规范化表示形式。
        //它遵循以下规则：对于任意两个字符串 s 和 t，
        // 当且仅当 s.equals(t) 为 true 时，s.intern() == t.intern() 才为 true。
        System.out.println(a == b.intern());//true,
        System.out.println(b.equals(b));//true
        System.out.println(b == b.intern());//false
    }
}
