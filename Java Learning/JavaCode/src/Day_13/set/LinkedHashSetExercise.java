package Day_13.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @Author: Song-zy
 * @Date: 2021/10/24 22:32
 * @Description:
 */
public class LinkedHashSetExercise {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("奥拓", 1000));
        linkedHashSet.add(new Car("奥迪", 300000));
        linkedHashSet.add(new Car("法拉利", 400000));
        linkedHashSet.add(new Car("奥迪", 30000));//f
        linkedHashSet.add(new Car("保时捷", 700000));
        linkedHashSet.add(new Car("奥迪", 30000));
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            System.out.println(next);
        }
    }
}

class Car {
    private String name;
    private int price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                "￥}";
    }
}