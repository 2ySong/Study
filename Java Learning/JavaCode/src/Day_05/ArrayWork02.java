package Day_05;

import java.util.Random;

/**
 * 5.随机生成10个整数(1~100的范围)保存到数组,
 * 并倒序打印以及求平均值、求最大值和最小值的下标、并查找里面是否有8
 */
public class ArrayWork02 {
    public static void main(String[] args) {
        Random rand = new Random();
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = rand.nextInt((99)+1);//生成1~100之间的随机数
        }
        System.out.println("正序打印：");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n倒序打印：");
        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        //求最大值的下标、数组的和
        int max = arr[0];//假定arr[0]是最大的
        int maxIndex = 0;
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += arr[i];
            if(max < arr[i]){
                //如果max不是最大值，就把arr[i]的值传给max
                max = arr[i];
                maxIndex = i;//保存当前最大值地 下标
            }
        }

        //求最小值的下标
        int min = arr[0];//假定arr[0]是最小的
        int minIndex = 0;
        for (int i = 0; i < 10; i++) {
            if(min > arr[i]){
                //如果min不是最小值，就把arr[i]的值传给min
                min = arr[i];
                minIndex = i;//保存当前最大值地 下标
            }
        }
        //判断是否有8
        int index = -1;
        for (int i = 0; i < 10; i++){
            if(arr[i]==8){
                index = i;
                break;
            }
        }
        //打印
        if(index!=-1) {
            System.out.println("该数列中包含8");
        }
        else{
            System.out.println("该数列中不包含8");
        }
        System.out.println("sum = "+sum+",Avg = "+sum/10);
        System.out.println("max = "+max+",maxIndex = "+maxIndex+",min = "+min+",minIndex = "+minIndex);
    }
}
