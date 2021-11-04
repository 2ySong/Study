package Day_11.customexception;

/**
 * @Author: Song-zy
 * @Date: 2021/10/5 21:28
 * @Description: 自定义异常
 */
public class CustomException {
    public static void main(String[] args) {
        int age = 12;
        //要求年龄在18~120,否则抛出一个异常
        if(!(age>=18 && age<=120)){
            throw new AgeException("年龄需要在18~120之间");
        }
        System.out.println("你的年龄正确");
    }
}

//自定义的异常AgeException--运行时异常
class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}