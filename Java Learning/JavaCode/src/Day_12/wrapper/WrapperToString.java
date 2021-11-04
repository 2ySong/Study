package Day_12.wrapper;

/**
 * @Author: Song-zy
 * @Date: 2021/10/9 13:01
 * @Description: 包装类型和String类型的相互转换
 */
public class WrapperToString {
    public static void main(String[] args) {
        //包装类-->String
        Integer in = 100;//自动装箱
        //方式一
        String str1 = in+"";//in本身并没有改变
        //方式二
        String str2= in.toString();
        //方式三
        String str3 = String.valueOf(in);
        //String->包装类
        String st1 = "1235";
        //方式一
        Integer int1 = Integer.parseInt(st1);//使用到自动装箱
        //方式二
        Integer int2 = Integer.valueOf(st1);
        System.out.println(int2);

    }
}
