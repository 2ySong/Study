package Day_11.exception_;

/**
 * @Author: Song-zy
 * @Date: 2021/10/5 14:48
 * @Description: `数字格式不正确异常
 */
public class NumberFormatException05 {
    public static void main(String[] args) {
        String name = "王琪琪";
        int num = Integer.parseInt(name);
    }
}
/*
D:\jdk\bin\java.exe "-javaagent:D:\idea\IntelliJ IDEA 2021.1.3\lib\idea_rt.jar=1232:D:\idea\IntelliJ IDEA 2021.1.3\bin" -Dfile.encoding=UTF-8 -classpath "E:\编程学习\Java Learning\JavaCode\out\production\JavaCode" Day_11.exception_.NumberFormatException05
Exception in thread "main" java.lang.NumberFormatException: For input string: "王琪琪"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:660)
	at java.base/java.lang.Integer.parseInt(Integer.java:778)
	at Day_11.exception_.NumberFormatException05.main(NumberFormatException05.java:11)
 */