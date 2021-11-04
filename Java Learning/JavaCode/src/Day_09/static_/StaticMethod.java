package Day_09.static_;

/**
 * @Author: Song-zy
 * @Date: 2021/9/30 1:25
 * @Description: 静态方法
 */
public class StaticMethod {
    public static void main(String[] args) {
        Student student1 = new Student("jack");
        Student.payFee(100);
        Student student2 = new Student("j22ack");
        Student.payFee(200);
        Student.showFee();

    }
}
class Student{
    private String name;
    //定义一个静态变量来累积学生的学费
    private static double fee;//被Student类的所有实例对象共享

    public Student(String name) {
        this.name = name;
    }
    //被static修饰的方法叫做静态方法
    public static void payFee(double fee){
        Student.fee+=fee;
    }
    public static void showFee(){
        System.out.println("总学费有"+Student.fee);
    }
}