package Day_02;

public class CharDemo {
    public static void main(String[] args){
        //在java中,char的本质是一个整数,在输出时,得到的时unicode码对应的字符
        char c1 = 'a';
        char c2 = '\t';
        char c3 = '宋';
        char c4 = 97;
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);//但输出c4时，会输出56对应的字符
        System.out.println((int)c1);//输出字符a对应的数字
        System.out.println((int)c3);//输出字符 宋对应的数字
        System.out.println('a'+20);

        //int x = (int)10*3.5 + 2.5;//编译错误，double不能自动转换为int
        int y = (int)(10*3.5 + 2.5);//结果为x = 37
        System.out.println(y);
    }
}
