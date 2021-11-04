package Day_04;

/**
 * 某人有100000元,每经过一次路口,需要交费规则如下
 * 1)当现金>50000时每次交5%
 * 2)当现金<=50000时每次交1000
 * 编程计算该人可以经过多少次路口,要求:使用 while break方式完成
 */
public class Control01 {
    public static void main(String[] args){
        double n=100000;
        int k=0;
        while(true){

            if(n>50000){
                n*=0.95;
                System.out.println(n);
            }else if(n>1000){
                n-=1000;
                System.out.println(n);
            }else{
                System.out.println("经过了"+k+"次路口");
                break;
            }
            k=k+1;
        }
    }
}
