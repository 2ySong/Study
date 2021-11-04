package Day_04;

public class Control07 {
    public static void main(String[]args){
        //求出1-1/2+1/3-1/4+...-1/100
        double sum=0;
        for(double i=1;i<=100;i++){
            sum = sum - Math.pow((-1),i)/i;
        }
        System.out.println(sum);
        //求1+(1+2)+(1+2+3)+...(1+..+100)
        int sum2=0;
        int n=0;
        for (int i=1;i<=100;i++){
            n=n+i;
            sum2 = sum2 + n;
        }
        System.out.println(sum2);
    }
}
