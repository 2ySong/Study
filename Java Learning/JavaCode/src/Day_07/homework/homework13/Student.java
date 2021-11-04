package Day_07.homework.homework13;


/**
 * @Author: Song-zy
 * @Date: 2021/9/27 18:51
 * @Description:
 */
public class Student extends Person {
    private int stu_id;

    public Student(String name, char sex, int age, int stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public void study(){
        System.out.println("我承诺，我会好好学习！");
    }
    @Override
    public String play() {
        return getName()+"喜欢踢足球！";
    }

    @Override
    public String toString() {
        return "Student{" +"name='" + getName() + '\'' +
                ", sex=" +'\''+ getSex() + '\''+
                ", age=" + getAge() +
                ", stu_id=" + stu_id +
                '}';
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }
}
