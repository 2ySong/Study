package Day_04;

/**
 * 输出0~100之间不能被5整除的数，每五个一行
 */
public class Control05 {
    public static void main(String[]args){
        int i=0;
        int k=0;
        for(i=0;i<=100;i++){
            if(i%5!=0) {
                System.out.print(i+"\t");
                k++;
                if(k%5==0)
                    System.out.println();
            }

        }
    }
}
