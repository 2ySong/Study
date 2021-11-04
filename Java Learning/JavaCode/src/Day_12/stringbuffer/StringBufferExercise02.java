package Day_12.stringbuffer;

import java.util.Scanner;

/**
 * @Author: Song-zy
 * @Date: 2021/10/13 15:40
 * @Description:
 */
public class StringBufferExercise02 {
    public static void main(String[] args) {
        String name;
        double price;
        Scanner myScanner = new Scanner(System.in);
        System.out.print("商品名：");
        name = myScanner.next();
        System.out.print("商品价格：");
        price = myScanner.nextDouble();
        StringBuffer pp = new StringBuffer(price+"");
        int index = pp.lastIndexOf(".");
        for (int i = index; i >= 0; i--) {
            if((index-i)%3==0&&i!=index&&i!=0){
                pp.insert(i,",");//整数部分每隔3位加小数点
            }
        }
        String formatStr = new String("商品名\t\t商品价格\n%s\t\t%s");
        String info = String.format(formatStr,name,pp);
        System.out.println("======商品信息======\n"+info);
    }
}
