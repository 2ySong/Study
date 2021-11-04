package Day_07.polymorphisc_.example;

/**
 * @Author: Song-zy
 * @Date: 2021/9/26 0:54
 * @Description:
 */

//动物类--父类
public class Animal {
    private String name;
    //构造器
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }
}
