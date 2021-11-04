package Day_07.debug_;

/**
 * @Author: Song-zy
 * @Date: 2021/9/26 23:03
 * @Description: 演示断点调试DeBug
 */
public class Debug01 {
    public static void main(String[] args) {
        //演示逐行执行代码
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
            System.out.println("i="+i);
            System.out.println("sum="+sum);
        }
        System.out.println("程序结束……");
    }
}
