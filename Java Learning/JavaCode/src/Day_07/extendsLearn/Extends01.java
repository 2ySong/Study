package Day_07.extendsLearn;

public class Extends01 {
    public static void main(String[] args) {
        Pupil p = new Pupil();
        p.name = "孙悟空";
        p.age = 13;
        p.setScore(70);
        p.testing();
        p.show();//调用父类中的方法
        Graduate g = new Graduate();
        g.name = "唐僧";
        g.age = 20;
        g.setScore(100);
        g.testing();
        g.show();
    }
}
class Student{//父类
    //共有的属性
    public String name;
    public int age;
    private double score;
    //共有的方法
    public void setScore(double score) {
        this.score = score;
    }

    public void show(){
        System.out.println("姓名："+name+", 年龄："+age+", 分数："+score);
    }
}

//Pupil继承Student类
class Pupil extends Student{
    //不同于父类。特有的方法
    public void testing(){
            System.out.println("小学生："+name+", 正在考试……");
    }
}

//Graduate继承Student类
class Graduate extends Student{
    //不同于父类。特有的方法
    public void testing(){
        System.out.println("大学生："+name+", 正在考试……");
    }
}