package Day_04;

public class WhileEx01 {
    public static void main(String[] args){
        //打印1~100之间能被3整除的数
        int i=0;
        while(i<100){
            if(i%3==0)
                System.out.println(i);
            i++;
        }
    }
}
