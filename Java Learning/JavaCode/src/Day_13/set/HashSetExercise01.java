package Day_13.set;

import java.util.HashSet;
import java.util.Objects;

/**
 * @Author: Song-zy
 * @Date: 2021/10/24 21:11
 * @Description:
 */
public class HashSetExercise01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("jack", 17));
        hashSet.add(new Employee("tomj", 18));
        hashSet.add(new Employee("jack", 17));
        for (Object o : hashSet) {
            System.out.println(o);
        }


    }
}

@SuppressWarnings("all")
class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}