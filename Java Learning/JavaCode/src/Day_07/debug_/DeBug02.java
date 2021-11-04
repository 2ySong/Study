package Day_07.debug_;

/**
 * @Author: Song-zy
 * @Date: 2021/9/26 23:15
 * @Description: 通过DeBug查看数组越界的异常
 */
public class DeBug02 {
    public static void main(String[] args) {
        int[] arr = {-1,10,-1};
        for (int i = 0; i < arr.length+1; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("退出循环");
    }
}
