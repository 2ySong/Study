package Day_10.enum_;

/**
 * @Author: Song-zy
 * @Date: 2021/10/4 16:41
 * @Description: 演示自定义枚举实现
 */
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season02.SPRING);

    }
}

//演示自定义枚举实现
class Season02 {
    private String name;
    private String description;//描述

    //1.将构造器私有化
    //2.去掉set方法，防止属性被修改
    //3.在内部创建固定的对象
    //4.优化：加入final修饰符，不用再加载不需要的
    private Season02(String name, String description) {
        this.name = name;
        this.description = description;
    }
    //创建了四个对象
    public static final Season02 SPRING = new Season02("春天", "温暖");
    public static final Season02 SUMMER = new Season02("夏天", "炎热");
    public static final Season02 AUTUMN = new Season02("秋天", "凉爽");
    public static final Season02 WINTER = new Season02("冬天", "寒冷");




    //

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Season02{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}