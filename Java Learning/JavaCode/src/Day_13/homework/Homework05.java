package Day_13.homework;

import java.util.HashSet;
import java.util.Objects;

/**
 * @Author: Song-zy
 * @Date: 2021/10/26 23:14
 * @Description:
 */
public class Homework05 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        HashSet set = new HashSet();

        Person p1 = new Person(1001, "AA");
        Person p2 = new Person(1002, "BB");
        set.add(p1);
        set.add(p2);

        p1.name = "CC";
        System.out.println(set.remove(p1));//false
        System.out.println(set);//[Person{id=1002, name='BB'}, Person{id=1001, name='CC'}]
        set.add(new Person(1001, "CC"));
        System.out.println(set);//[Person{id=1002, name='BB'}, Person{id=1001, name='CC'}, Person{id=1001, name='CC'}]
        set.add(new Person(1001, "AA"));
        System.out.println(set);//[Person{id=1002, name='BB'}, Person{id=1001, name='CC'}, Person{id=1001, name='CC'}, Person{id=1001, name='AA'}]
    }
}

class Person {
    private int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}