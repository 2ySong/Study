package Day_07.homework.homework13;

/**
 * @Author: Song-zy
 * @Date: 2021/9/27 19:12
 * @Description:
 */
public class Teacher extends Person{
    private int work_age;

    public Teacher(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public void teach(){
        System.out.println("我承诺，我会认真教学！");
    }

    public String play() {
        return getName()+"喜欢下象棋！";
    }

    @Override
    public String toString() {
        return "Teacher{" +"name='" + getName() + '\'' +
                ", sex=" + '\''+getSex() + '\''+
                ", age=" + getAge() +
                ", work_age=" + work_age +
                '}';
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
}
