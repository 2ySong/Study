package Day_07.object_.equals_;

/**
 * @Author: Song-zy
 * @Date: 2021/9/26 20:07
 * @Description:
 */
public class Test02 {
    public static void main(String[] args) {
        int it = 65;
        float f = 65.0f;
        System.out.println("65和65.0f是否相等?"+(it==f));//true
        char ch1='A';  char ch2=12;
        System.out.println("65和'A'是否相等?"+(it==ch1));//true
        System.out.println("12和ch2是否相等?"+(12==ch2));//true
        String str1 = new String ("hello");
        String str2 = new String ("hello");
        System.out.println("str1和str2是否相等?"+(str1==str2));//false
        System.out.println("str1是否 equals str2?"+(str1.equals(str2)));//true
//        System.out.println("hello" == new java.sql.Date());//不是同一个类型，不能比较
    }
}
