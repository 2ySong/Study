package Day_05;
/**
 * * 4.已知有个升序的数组,要求插入一个元素,该数组顺序依然是升序,比如:
 *  * [10,12,45,90],添加23后,数组为[10,12,23,45,90]
 */

import java.util.Scanner;

public class ArrayWork01Plus {
    public static void main(String[] args) {
        int arr1[] = {10,12,45,90};
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请添加一个元素：");
        int addNum = myScanner.nextInt();
        int n = 0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]<addNum){
                n++;
            }
        }//得到新数的下标
        int arr2[] = new int[arr1.length+1];
        for(int i=0,j=0;i<arr2.length;i++){
            if(i!=n){
                arr2[i] = arr1[j];
                j++;
            }else {
                arr2[i] = addNum;
            }
        }
        arr1 = arr2;//地址转移
        System.out.println("添加"+addNum+"后的数组为：");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
