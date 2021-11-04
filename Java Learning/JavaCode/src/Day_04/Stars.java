package Day_04;

/**
 * 打印金字塔
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 */
public class Stars {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            //输出前面的空格
            for(int k=1;k<=5-i;k++){
                System.out.print(" ");
            }
            //输出*
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //空心金字塔
        for(int i=1;i<=5;i++){
            //输出前面的空格
            for(int k=1;k<=5-i;k++){
                System.out.print(" ");
            }
            //输出*
            for(int j=1;j<=2*i-1;j++){
                if(j==1||j==2*i-1||i==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
