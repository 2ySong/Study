package Day_04;

public class BreakDemo {
    public static void main(String[] args){
        int i;
        label:
        for(i=1;;i++) {
            System.out.println("第"+i+"个随机数是"+(int) (Math.random() * 100));//生成一个随机数
            double n=(Math.random() * 100);
            if(n==97){
                System.out.println("在第"+i+"个数生成97");
                break label;
            }
        }
    }
}
