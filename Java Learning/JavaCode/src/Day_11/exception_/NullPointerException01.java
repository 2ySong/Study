package Day_11.exception_;

/**
 * @Author: Song-zy
 * @Date: 2021/10/5 14:33
 * @Description: 空指针异常
 */
public class NullPointerException01 {
    public static void main(String[] args) {
        int[] a = null;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
/*抛出空指针异常
Exception in thread "main" java.lang.NullPointerException: Cannot read the array length because "a" is null
	at Day_11.exception_.NullPointerException01.main(NullPointerException01.java:11)
 */