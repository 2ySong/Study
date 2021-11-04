package Day_10.enum_;

/**
 * @Author: Song-zy
 * @Date: 2021/10/4 16:54
 * @Description: enum关键字实现枚举
 */
public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
    }
}
@SuppressWarnings({"all"})
enum Season {
    //使用enum关键字实现枚举类
    //将常量(对象放在最前面)
    //如果有多个常量，使用逗号间隔
    SPRING("春天", "温暖"),SUMMER("夏天", "炎热"),
    AUTUMN("秋天","凉爽"),WINTER("冬天","寒冷");
    private String name;
    private String description;//描述

    //1.将构造器私有化
    //2.去掉set方法，防止属性被修改
    //3.在内部创建固定的对象
    //4.优化：加入final修饰符，不用再加载不需要的
    private Season(String name, String description) {
        this.name = name;
        this.description = description;
    }
    //创建了四个对象
//    public static final Season SPRING = new Season("春天", "温暖");
//    public static final Season SUMMER = new Season("夏天", "炎热");
//    public static final Season AUTUMN = new Season("秋天", "凉爽");
//    public static final Season WINTER = new Season("冬天", "寒冷");




    //
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}