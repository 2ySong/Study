package Day_04;

/**
 * 输出a~z和Z~A
 */
public class Control06 {
    public static void main(String[] args) {
        for(int i=97;i<=122;i++){
            System.out.print((char)+i+" ");
        }
        //第二种方法
        System.out.println();
        System.out.println("第二种输出方法");
        for(char c='a';c<='z';c++){
            System.out.print(c+" ");
        }
        System.out.println();
        for(int i=65;i<=90;i++){
            System.out.print((char)+i+" ");
        }
    }
}
