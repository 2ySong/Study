package Day_06;
//递归
public class Recursive {
    public static void main(String[] args) {
        R1 r1 = new R1();
        r1.test(4);//会输出n=2，3，4
        //求阶乘
        System.out.println("阶乘:"+r1.factorial(-1));
    }
}
class R1{
    public void test(int n) {
        if(n>2){
            test(n-1);
        }
        System.out.println("n="+n);
    }
    //阶乘
    public int factorial(int n) {
        if(n==1||n==0){
            return 1;//0和1的阶乘为1
        }else{
            return factorial(n-1)*n;
        }
    }
}