package Day_06;

/**
 * @可变参数的学习
 */
public class VarParameter01 {
    public static void main(String[] args) {
        HspMethod hspMethod = new HspMethod();
        System.out.println(hspMethod.sum(4,5,6));
        System.out.println(hspMethod.sum(100,5,6,898));
    }
}
class HspMethod{
    public int sum(int...nums){
        //此处的接收的数相当于一个数组
        System.out.println("接收了"+nums.length+"个参数，和=");
        //遍历求和
        int sum1 = 0;
        for(int i=0; i<nums.length; i++){
            sum1 += nums[i];
        }
        return sum1;
    }
}