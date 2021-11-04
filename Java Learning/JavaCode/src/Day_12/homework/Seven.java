package Day_12.homework;

/**
 * @Author: Song-zy
 * @Date: 2021/10/21 16:54
 * @Description:
 */
public class Seven {
    public static void main(String[] args) {
        int n1, n2;
        for (int i = 0; i < 100; i++) {
            n1 = i / 10; //十位
            n2 = i % 10; //个位
            if ((n1 == 7 || n2 == 7 || i % 7 == 0) && i != 0) {
                System.out.println(i);;
            }
        }
    }
}
