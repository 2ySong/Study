package Day_12.string_;

/**
 * @Author: Song-zy
 * @Date: 2021/10/12 17:24
 * @Description:
 */
public class StringMethod01 {
    public static void main(String[] args) {
        System.out.println("szy".equals("szy"));//区分大小写,判断内容是否相等
        String str ="Szyz";
        System.out.println(str.equalsIgnoreCase("szyz"));//忽略大小写的判断内容是否相等
        System.out.println(str.length());//获取字符的个数,字符串的长度
        System.out.println(str.indexOf("z"));//1/获取字符在字符串中第1次出现的索引,索引从0开始,如果找不到返回-1
        System.out.println(str.indexOf("yz"));//2
        System.out.println(str.lastIndexOf("z"));//3/获取字符在字符串中最后1次出现的索引,索引从0开始,如找不到返回-1
        System.out.println(str.substring(1));//zyz/取指定范围的子串,截取1索引及以后的字符。
        System.out.println(str.substring(1,3));//zy/取指定范围的子串,,截取[1,3)的字符，即索引1，2的字符。。
        System.out.println("  szy ".trim());//去前后空格
        System.out.println(str.charAt(1));//获取某索引处的字符,注意不能使用 Str[index]这种方式
//        - equals//区分大小写,判断内容是否相等
//        equalsIgnoreCase//忽略大小写的判断内容是否相等
//                length//获取字符的个数,字符串的长度
//        indexOf//获取字符在字符串中第1次出现的索引,索引从0开始如果找不到返回-1
//                lastIndexOf//获取字符在字符串中最后1次出现的索引索引从0开始如找不到返回-1
//        substring//取指定范围的子串
//                trim//去前后空格
//        charAt//获取某索引处的字符,注意不能使用 Str[index]这种方式


    }
}
