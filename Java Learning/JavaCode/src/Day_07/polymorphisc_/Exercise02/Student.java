package Day_07.polymorphisc_.Exercise02;

/**
 * @Author: Song-zy
 * @Date: 2021/9/26 15:17
 * @Description:
 */
public class Student extends Person{
    private double score;

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    @Override
    public String say() {
        return super.say()+"score="+score+" | ";
    }
    //学生类特有方法
    public void study() {
        System.out.println(getName()+"在学习……");
    }
}
