package Day_10.enum_;

/**
 * @Author: Song-zy
 * @Date: 2021/10/4 16:29
 * @Description: 枚举引出
 */
public class Enumeration01 {
    public static void main(String[] args) {
        Season01 spring = new Season01("春天", "温暖");
        Season01 summer = new Season01("夏天", "炎热");
        Season01 autumn = new Season01("秋天", "凉爽");
        Season01 winter = new Season01("冬天", "寒冷");
        //因为对于季节而已,他的对象(具体值),是固定的四个,不会有更多
        //安老师的这个设计类的思路,不能体现季节是固定的四个对象
        //因此,这样的设计不好===>枚举类[枚:一个一个举:例举,即把具体的对象一个一个例举出来的类
        //就称为枚举类]
    }
}
class Season01 {
    private String name;
    private String description;//描述

    public Season01(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}