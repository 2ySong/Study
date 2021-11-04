package Day_12.homework;

/**
 * @Author: Song-zy
 * @Date: 2021/10/20 22:56
 * @Description: 将字符串中指定部分进行反转比如将"abcdef"反转为" aedcbf"
 * 编写方法 public static String reverse( String str, int start, int end)搞定
 */
public class Homework01 {
    public static void main(String[] args) {
        System.out.println(reverse1("abcdef", 1, 4));
        try{
            System.out.println(reverse2("我爱琪琪子", 1, 6));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    //方法1
    public static String reverse1(String str, int start, int end) {
        String s1 = str.substring(0, start);
        String s2 = str.substring(start, end + 1);
        StringBuffer sb1 = new StringBuffer(s2);
        String s3 = str.substring(end + 1, str.length());
        //调用StringBuffer类中的reverse方法，将选中部分的字符串翻转，再拼接上没有选中的部分
        return s1 + sb1.reverse() + s3;
    }

    //方法2
    public static String reverse2(String str, int start, int end) {

        if (!(str !=null && start >= 0 && end > start & end <str.length())){
            throw new RuntimeException("参数不正确");//抛出异常

        }
        //将字符串转换为字符数组
        char[] chs = str.toCharArray();
        char temp = ' ';
        for (int i = start, j = end; i < j; i++, j--) {
            temp = chs[i];
            chs[i] = chs[j];
            chs[j] = temp;
        }
        return new String(chs);
    }
}
