package Day_04;

/**
 * 九九乘法表
 */
public class LotFor {
    public static void main(String[] args){
        int i=1;
        while (i<10){
            int j=1;
            while (j<=i) {
                System.out.print(i + "*" + j + "=" + (i * j)+"\t");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
