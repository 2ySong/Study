package Day_07.polymorphisc_.example;

/**
 * @Author: Song-zy
 * @Date: 2021/9/26 0:58
 * @Description:
 */
public class Master {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Master(String name) {
        this.name = name;
    }
    //打印三者之间的关系
    public void feed(Animal animal,Food food){
        System.out.println("|主人："+getName()+" | 动物："+animal.getName()+" | 吃的食物："+food.getName()+" |");
    }
}
