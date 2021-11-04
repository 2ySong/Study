package Day_12.homework;

/**
 * @Author: Song-zy
 * @Date: 2021/10/22 20:17
 * @Description:
 */
public class Homework03 {
    public static void main(String[] args) {
        String str = "Han shun Ping";
        int firstSpace = str.indexOf(' ');//第一个空格的索引
        int lastSpace = str.lastIndexOf(' ');

        String str1 = str.substring(0,firstSpace);
        String str2 = str.substring(firstSpace+1,firstSpace+2);
        String str3 = str.substring(lastSpace+1,str.length());
        System.out.println(str3 + ","+str1 + " ."+str2.toUpperCase());
    }
}
