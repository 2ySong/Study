package Day_06;

import java.util.Scanner;

/**
 * 1.编写类AA新方法:判断一个数是奇数odd还是偶数,返回 boolean
 * 根据行、列、字符打印对应行数和列数的字符,比如:行:4,列:4,字符#则打印相应的效果
 */
public class methodExer01 {
    public static void main(String[] args) {
        AA aa = new AA();
        if(aa.oddOrEven(9)){
            System.out.println("是奇数");
        }else{
            System.out.println("是偶数");
        }
        //打印字符
        aa.print(4,6,'#');//传入实参
    }
}
class AA{
    // * 1.编写类AA新方法:判断一个数是奇数odd还是偶数,返回 boolean
    public boolean oddOrEven(int n){
        return n % 2 != 0;
    }
    //  根据行、列、字符打印对应行数和列数的字符,比如:行:4,列:4,字符#则打印相应的效果
    //    /思路
    //1.方法的返回类型Void
    //2.方法的名字 print
    //3.方法的形参( int row, int col, char c)
    //4.方法体,半断
    public void print(int row, int col, char c){
        for(int i=0; i<row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(c + "\t");
            }
            System.out.println();
        }
    }
}
