package Day_05;

import java.util.Scanner;

/**
 * 4.已知有个升序的数组,要求插入一个元素,该数组顺序依然是升序,比如:
 * [10,12,45,90],添加23后,数组为[10,12,23,45,90]
 */
public class ArrayWork01 {
    public static void main(String[] args) {
        int arr1[] = {10,12,45,90};
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请添加一个元素：");
        int addNum = myScanner.nextInt();
        int arr2[] = new int[arr1.length+1];
        int index = 0;
        arr2[arr1.length] = addNum;
        for(int i=0;i<arr1.length;i++){
            arr2[i] = arr1[i];
        }
        int temp;
        for (int j = 0; j < arr2.length-1; j++) {
            for (int i = 0; i < arr2.length - 1 - j; i++) {
                if (arr2[i] > arr2[i + 1]) {
                    temp = arr2[i];
                    arr2[i] = arr2[i + 1];
                    arr2[i + 1] = temp;
                }
            }
        }
        arr1 = arr2;
        System.out.println("添加"+addNum+"后的数组为：");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        arr1 = arr2;
        System.out.println("添加"+addNum+"后的数组为：");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
