package Day_02;

public class StringToBasic {
    public static void main(String[] args){
        // String->对应的基本数据类型
        String s5="123";
        int num1= Integer.parseInt(s5);
        double num2 = Double.parseDouble(s5);
        float num3 = Float.parseFloat(s5);
        long num4 = Long.parseLong(s5);
        byte num5= Byte.parseByte(s5);
        String a = "true";
        boolean b = Boolean.parseBoolean(a);
        short num6 = Short.parseShort(s5);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
        //怎么把字符串转成字符char,含义是指把字符串中的一个字符返回
        System.out.println(s5.charAt(0));//第0个字符1
        System.out.println(s5.charAt(1));//第1个字符2
    }
}
