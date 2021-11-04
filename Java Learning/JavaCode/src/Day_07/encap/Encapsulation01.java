package Day_07.encap;

import java.util.Scanner;

/**
 *  请大家看一个小程序( Encapsulation01.java)不能随便查看人的年龄工资
 * 等隐私并对设置的年龄进行合理的验证。年龄合理就设置,否则给默认
 * 年龄必须在1-120,年龄,工资不能直接查看,name的长度在2-6之间
 */
public class Encapsulation01 {
    public static void main(String[] args) {
        Employee em1 = new Employee();
        em1.setName("张三");
        em1.setAge(89);
        em1.setSalary(20000);
//        System.out.println(em1.name);
//        System.out.println(em1.name+"的工资"+em1.getSalary());
//        System.out.println(em1.name+"的工资"+em1.getSalary());
        System.out.println(em1.show());
    }
}
class Employee{
    public String name;//公开
    private int age;//私有
    private double salary;

    public Employee() {
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        //  name的长度在2-6之间
        if(name.length()>=2&&name.length()<=6) {
            this.name = name;
        }else{
            System.out.println("温馨提示：名字长度只能在2~6之间,你的默认名为\"无名\"");
            this.name = "\"无名\"";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //年龄必须在1-120
        if(age>=1&&age<=120){
            this.age = age;
        }else{
            System.out.println("温馨提示：年龄必须在1~120岁之间，你的输入有误");
            this.age = 18;//默认年龄为18
        }
    }

    public double getSalary() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("温馨提示：工资不能直接查看，请输入密码后查看:");
        String password = myScanner.next();
        if(password.equals("666666")){
            return salary;//默认密码是666
        }else{
            System.out.println("温馨提示：密码输入错误，工资默认为0.0");
            return 0;
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //写一个方法返回员工信息
    public String show() {
        return name + "的年龄为：" +age+",工资为"+getSalary();
    }
}
