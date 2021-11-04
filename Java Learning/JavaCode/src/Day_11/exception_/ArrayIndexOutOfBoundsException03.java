package Day_11.exception_;

/**
 * @Author: Song-zy
 * @Date: 2021/10/5 14:38
 * @Description: 数组下标越界异常
 */
public class ArrayIndexOutOfBoundsException03 {
    public static void main(String[] args) {
        int[] a = {2,1,3};
        for (int i = 0; i <= a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
/*
2
1
3
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	at Day_11.exception_.ArrayIndexOutOfBoundsException03.main(ArrayIndexOutOfBoundsException03.java:12)

 */