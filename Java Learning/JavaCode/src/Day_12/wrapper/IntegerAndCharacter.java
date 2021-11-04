package Day_12.wrapper;

/**
 * @Author: Song-zy
 * @Date: 2021/10/9 13:36
 * @Description: Integer和Character类的常用方法
 */
public class IntegerAndCharacter {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);//返回最小值
        System.out.println(Integer.MAX_VALUE);//返回最大值
        System.out.println(Character.isDigit('a'));//判断是不是数字
        System.out.println(Character.isLetter('a'));//判断是不是字母
        System.out.println(Character.isUpperCase('a'));//判断是不是大写
        System.out.println(Character.isLowerCase('a'));//判断是不是小写
        System.out.println(Character.isWhitespace('a'));//判断是不是空格
        System.out.println(Character.toUpperCase('a'));//转传成大写
        System.out.println(Character.toLowerCase('A'));//转传成小写
    }
}
