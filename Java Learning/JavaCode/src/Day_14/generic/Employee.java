package Day_14.generic;

/**
 * @Author: Song-zy
 * @Date: 2021/10/27 18:15
 * @Description:
 */
public class Employee implements Comparable<Employee> {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public int compareTo(Employee e){
        return this.getName().length()-e.getName().length();
    }
    @Override
    public String toString() {
        return name + "\t\t" + sal +
                "\t\t"+birthday;
    }
}


