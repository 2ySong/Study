package Day_05;

public class Array01 {
    public static void main(String[] args) {
        //创建一个数组
        //数组的下标是从0开始编号的
        double[] hens = {1,2,3,4.5,8.9,7};
        double sum=0;
        //遍历得到数组的和
        for(int i=0;i<6;i++){
            System.out.println("第"+(i+1)+"个元素是"+hens[i]);
            sum += hens[i];
        }
        System.out.println("和为"+sum+"，平均为"+(float)sum/6);
        //输出数组的长度
        System.out.println("数组的长度是"+hens.length);
    }
}
