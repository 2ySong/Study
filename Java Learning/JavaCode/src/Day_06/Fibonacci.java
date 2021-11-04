package Day_06;
/**
 * 斐波那契,F1=F2=1
 */
class F{
    public int fib(int n){
        if(n==1||n==2){
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }
    }
}
public class Fibonacci {
    public static void main(String[] args) {
        //实例化F类
        F f = new F();
        //打印
        System.out.println(f.fib(28));
    }
}
