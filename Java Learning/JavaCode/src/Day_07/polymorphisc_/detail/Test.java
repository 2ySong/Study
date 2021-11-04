package Day_07.polymorphisc_.detail;

/**
 * @Author: Song-zy
 * @Date: 2021/9/26 2:06
 * @Description: 多态的细节，向下转型和向上转型
 */
public class Test {
    public static void main(String[] args) {
        Animal animal = new Cat();//向上转型
        animal.eat();
        animal.run();
        animal.sleep();
//        animal.catchMoused();//不能访问的原因：编译编译类型Animal中没有catchMoused()

        //如果想要访问catchMoused()方法，就需要对animal对象进行向上转型
        //将animal的编译类型强转为Cat类型，才可以访问子类中的特有成员
        Cat cat = (Cat) animal;//向上转型条件;animal本身就是new Cat()得到的，必须对应
        cat.catchMoused();



    }
}
