package Day_07.homework;

/**
 * @Author: Song-zy
 * @Date: 2021/9/27 22:22
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Father f = new Son();
//        f.study();//f的编译类型是Father，不能调用子类中特有的方法，
        f.run();//运行类型是Son，调用时，先从子类中查找run方法
        Son s = (Son)f;//向下转型后，编译类型编程了Son，可以调用子类中的特有方法
        s.study();
    }
}
class Father{
    public void run(){
        System.out.println("F-run");
    }
    public void eat(){
        System.out.println("F-eat");
    }
}
class Son extends Father{
    public void run(){
        System.out.println("S-run");
    }
    public void study(){
        System.out.println("S-study");
    }
}