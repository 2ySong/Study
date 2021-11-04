package Day_04;

import java.util.Scanner;

/*
使用 switch把小写类型的char型转为大写(键盘输入)。只转换a,b,c,de
其它的输出" other"。
 */
public class SwitchExer01 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个小写字母(a~e)：");
        char c1 = myScanner.next().charAt(0);
        switch (c1){
            case 'a' :
                System.out.println('a'+"的大写为："+'A');
                break;
            case 'b' :
                System.out.println('B');
                break;
            case 'c' :
                System.out.println('C');
                break;
            case 'd' :
                System.out.println('D');
                break;
            case 'e' :
                System.out.println('E');
                break;
            default:
                System.out.println("other");
        }
    }
}
