package Day_14.generic;

import java.util.*;

/**
 * @Author: Song-zy
 * @Date: 2021/10/27 16:35
 * @Description:
 */
public class GenericExercise {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        students.put("001",new Student("kang",17));
        students.put("002",new Student("jack",18));
        students.put("003",new Student("song",20));
        Set keyset = students.keySet();
        Iterator it = keyset.iterator();
        System.out.println("学号\t\t姓名\t\t年龄");
        while (it.hasNext()) {
            Object next =  it.next();
            System.out.println(next+"\t\t"+students.get(next).getName()+"\t"+students.get(next).getAge());
        }
        System.out.println("====");
        System.out.println("学号\t\t姓名\t\t年龄");
        Set<Map.Entry<String,Student>> entrySet = students.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Student> next =  iterator.next();
            System.out.println(next.getKey() + "\t\t"+next.getValue().getName()+"\t"+next.getValue().getAge());
        }

    }
}
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}