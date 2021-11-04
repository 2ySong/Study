package Day_12.homework;

/**
 * @Author: Song-zy
 * @Date: 2021/10/22 20:49
 * @Description:
 */
public class Homework04 {
    public static void main(String[] args) {
        String str = "ABCDacdeA128v";
        number(str);
    }
    public static void number(String str){
        char[] chars = str.toCharArray();
        int m = 0;
        int n = 0;
        int o = 0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] >= 'A'&&chars[i] <= 'Z'){
                m++;
            }else if(chars[i] >= 'a'&&chars[i] <= 'z'){
                n++;
            }else if(chars[i] >= '0'&&chars[i]<='9'){
                o++;
            }
        }

        System.out.println("\'"+str+"\'中\n"
                +"有"+m+"个大写字母; \n"
                +"有"+n+"个小写字母; \n"
                +"有"+o+"个数字。" );
    }
}
