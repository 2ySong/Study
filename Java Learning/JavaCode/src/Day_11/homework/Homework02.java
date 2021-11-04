package Day_11.homework;

/**
 * @Author: Song-zy
 * @Date: 2021/10/5 22:58
 * @Description:
 */
public class Homework02 {
    public static void main(String [] args){
        if(args[4].equals("john")){//ArrayIndexOutOfBoundsException异常
            System.out.println("AA");
        }else {
            System.out.println("BB");
        }
        Object o = args[2];
        Integer i = (Integer)o;
    }
}
