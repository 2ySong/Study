package Day_07.homework;

/**
 * @Author: Song-zy
 * @Date: 2021/9/27 15:23
 * @Description:
 * 编写 Doctor类{name，age，job， gender，sal}，相应的 getter()和 setter()方法，5个参数的构造器，重写父类的 equals(),
 *
 * 方法: public boolean equals( Object obj)，并判断测试类中创建的两个对象是否相等。相等就是判断属性是否相同
 */
public class Homework10 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("jack",34,"外科主任",'男',20000);
        Doctor doctor2 = new Doctor("jack",34,"外科主任",'男',20000);
        Doctor doctor4 = new Doctor("jack",56,"外科主任",'男',20000);
        Doctor doctor3 = doctor1;
        System.out.println(doctor1.equals(doctor2));//true
        System.out.println(doctor1==doctor2);//false
        System.out.println(doctor1.equals(doctor3));//true
        System.out.println(doctor1==doctor3);//true
        System.out.println(doctor1.equals(doctor4));//true
    }
}
class Doctor{
    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;

    public Doctor() {
    }

    public Doctor(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
    }
    /*
       public boolean equals(Object obj) {
        return (this == obj);
    }
     */
    @Override
    //判断测试类中创建的两个对象是否相等。相等就是判断属性是否相同
    public boolean equals( Object obj){
        if(this == obj){
            return true;
        }
        if (!(obj instanceof Doctor)) {
            return false;
        }
        Doctor doctor = (Doctor) obj;
        if(this.name.equals(doctor.name)&&this.age==doctor.age&&this.job.equals(doctor.job)&&this.gender==(doctor.gender)&&this.sal==(getSal())){
            return true;
        }
        return false;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}