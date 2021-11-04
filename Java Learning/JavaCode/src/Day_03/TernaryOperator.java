package Day_03;

public class TernaryOperator {
    public static void main(String[] args){
        int a = 10;
        int b = 99;
        //a > b?是true,则把a的值赋给result，再a++。反之b--
        int result = a > b? a++ : b--;//a不小于b，所以result=99，b=99-1=98
        System.out.println(result);//99
        System.out.println(a);//10
        System.out.println(b);//98
    }
}
