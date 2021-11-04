package Day_13.set;

import java.util.HashSet;

/**
 * @Author: Song-zy
 * @Date: 2021/10/23 21:31
 * @Description:
 */
public class HashSet02 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add("lucy");
        hashSet.add("lucy");
        hashSet.add(new Dog("大黄"));
        hashSet.add(new Dog("大黄"));//不同于上面那个狗，可以加入
        System.out.println(hashSet);//[Dog{name='大黄'}, Dog{name='大黄'}, lucy]

        //经典面试题
        hashSet.add(new String("szy"));
        hashSet.add(new String("szy"));//false
    }
}
@SuppressWarnings("all")
class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}