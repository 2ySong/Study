package Day_13.map;

import java.util.*;

/**
 * @Author: Song-zy
 * @Date: 2021/10/26 19:03
 * @Description:
 */
public class MapExercise01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, new Employee(1, "张三", 19000));
        map.put(2, new Employee(2, "李四", 16000));
        map.put(3, new Employee(3, "王五", 23000));
        Set keyset = map.keySet();
        for (Object key : keyset) {
            Employee e = (Employee) map.get(key);
            if (e.getSalary() > 18000)
                System.out.println(e);
        }

        System.out.println("第二种遍历");
        //第二组：values：获取所有的值
        Collection values = map.values();
        //可以用Collection的所有遍历方法
        //1).迭代器
        Iterator it1 = values.iterator();
        while (it1.hasNext()) {
            Employee e = (Employee) it1.next();//向下转型
            if (e.getSalary() > 18000)
                System.out.println(e);
        }

    }
}

class Employee {
    private String name;
    private double salary;
    private int id;

    public Employee(int id, String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id + ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}