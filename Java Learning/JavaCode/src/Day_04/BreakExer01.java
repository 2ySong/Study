package Day_04;

/**
 * 1-100以内的数的qiann项和,求出当和第一次大于20的当前数【for+ break]
 */
public class BreakExer01 {
    public static void main(String[]args){
        int sum = 0;
        for (int i=1;i<=100;i++){
            sum = sum+i;
            if(sum>20) {
                System.out.println("前" + i + "项的和" + "第一次大于20");
                break;
            }
        }
    }
}
