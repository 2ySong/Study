package Day_05;

import java.util.Scanner;

public class ArrayAdd02 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int arr[] = {1,2,3};
        int len = arr.length;
        while(true){
            if(len==3){
                //第一个循环，输出内容不应该有继续，不符合中文语义
                System.out.print("请输入是否添加(y/n):");
            }else{
                System.out.print("请输入是否继续添加(y/n):");
            }
            //接受用户的y/n
            char s = myScanner.next().charAt(0);
            if(s=='y'){
                //创建一个新的数组，长度比arr.length多一
                int[] arrNew = new int[len+1];
                for(int i=0;i<len;i++){
                    arrNew[i] = arr[i];
                }
                //接受用户需要扩容的具体值
                System.out.print("你扩容的值为：");
                int n = myScanner.nextInt();
                arrNew[arrNew.length-1] = n;
                //再把arrNew地址转移给arr
                arr = arrNew;//原先的arr会被自动销毁
                len++;
                System.out.println("扩容后的arr：");
                for(int i=0;i<len;i++){
                    System.out.println("arr["+i+"]="+arr[i]);
                }
            }else if(s=='n'){
                System.out.println("程序结束");
                break;
            }
            System.out.println("");
        }
    }
}
