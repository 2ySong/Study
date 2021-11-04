package Day_05;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        //动态初始化
        Scanner myScanner = new Scanner(System.in);
        int arr1[] = new int[5];//第一种
//        int[] arr1;//第二种
//        int arr1[];//第三种
        arr1 = new int[5];//第二种和第三种要配合这句代码。
        for(int i=0; i<5; i++){
            arr1[i] = myScanner.nextInt();
        }
        for(int i=0; i<5; i++){
            System.out.print(arr1[i]+" ");
        }
        //静态初始化

    }
}
