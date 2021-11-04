package Day_07.polymorphisc_.detail;

/**
 * @Author: Song-zy
 * @Date: 2021/9/26 2:28
 * @Description: instanceof比较操作符，用于判断**对象的运行类型**是否为Xx类型或Xx类型的子类型
 */
public class InstanceOf_ {
    public static void main(String[] args) {
        BB b = new BB();
        System.out.println(b instanceof AA);//true
        System.out.println(b instanceof BB);//true

        AA a = new AA();
        System.out.println(a instanceof BB);//false

        AA ab = new BB();
        System.out.println(ab instanceof AA);//true
        System.out.println(ab instanceof BB);//true
    }
}
class AA{
}
class BB extends AA{
}
class CC{
}