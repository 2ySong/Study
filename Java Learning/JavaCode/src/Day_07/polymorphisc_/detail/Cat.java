package Day_07.polymorphisc_.detail;

/**
 * @Author: Song-zy
 * @Date: 2021/9/26 2:04
 * @Description:
 */
public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
    public void catchMoused() {
        System.out.println("猫抓老鼠");
    }
}
