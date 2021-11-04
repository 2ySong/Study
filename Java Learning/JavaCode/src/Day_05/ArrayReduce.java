package Day_05;

import java.util.Scanner;

/**
 * 有一个数组{1,2,3,4,5}，可以将该数组进行缩减，提示用户是否继续缩减，
 * 每次缩减最后那个元素。当只剩下最后一个元素，提示：不能再缩减。
 */
public class ArrayReduce {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        int len = arr.length;
        while(true){
            if(len==5){
                //第一个循环，输出内容不应该有继续，不符合中文语义
                System.out.print("请输入是否缩减(y/n):");
            }else{
                System.out.print("请输入是否继续缩减(y/n):");
            }
            //接受用户的y/n
            char s = myScanner.next().charAt(0);
            if(s=='y'){
                if(len==1){
                    System.out.println("数组长度为1，不能再缩减");
                    break;
                }
                //创建一个新的数组，长度比arr.length少一
                int[] arrNew = new int[len-1];
                for(int i=0;i<len-1;i++){
                    arrNew[i] = arr[i];
                }
                //接受用户需要扩容的具体值
//                System.out.print("你扩容的值为：");
//                int n = myScanner.nextInt();
//                arrNew[arrNew.length-1] = n;
                //再把arrNew地址转移给arr
                arr = arrNew;//原先的arr会被自动销毁
                System.out.println("缩减后的arr：");
                for(int i=0;i<len-1;i++){
                    System.out.println("arr["+i+"]="+arr[i]);
                }
                len--;
            }else if(s=='n'){
                System.out.println("程序结束");
                break;
            }
            System.out.println("");
        }
    }
}
