package Day_04;

public class ContinueEx01 {
    public static void main(String[] args){
        int i=1;
        while (i<=10){
            i++;
            if(i*i<20) {
                continue;//如果i的平方小于20，就不执行下面的语句，直接进入下一次循环条件的判断
            }
            System.out.println(i+"的平方大于20");

        }
    }
}
