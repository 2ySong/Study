package Day_13.set;

import java.util.HashSet;
import java.util.Objects;

/**
 * @Author: Song-zy
 * @Date: 2021/10/24 21:35
 * @Description:
 */

public class HashSetExercise02 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee1("jack", 2000, new MyDate(2000, 2, 12)));
        hashSet.add(new Employee1("toml", 3000, new MyDate(2001, 8, 6)));
        hashSet.add(new Employee1("jack", 1000, new MyDate(2000, 2, 12)));
        hashSet.add(new Employee1("kang", 9000, new MyDate(1999, 5, 28)));

        for (Object o : hashSet) {
            System.out.println(o);
        }

    }
}

@SuppressWarnings("all")
class Employee1 {
    private String name;
    private double salary;
    private MyDate birthday;

    public Employee1(String name, double salary, MyDate birthday) {
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee1 employee1 = (Employee1) o;
        return Objects.equals(name, employee1.name) && Objects.equals(birthday, employee1.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                "￥, birthday=" + birthday +
                '}';
    }
}

@SuppressWarnings("all")
class MyDate {
    private int year;// < 2030
    private int month;//1~12
    private int day;//28~31

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return "("+year+"/"+month+"/"+day+")";
    }
}