package Day_09.single_;

/**
 * @Author: Song-zy
 * @Date: 2021/10/1 0:23
 * @Description: 单例模式--饿汉式
 * 1. 构造器私有化：防止直接new
 * 2. 类的内部创建对象：
 * 3. 向外暴露一个静态的公共方法：getInstance()
 * 4. 代码实现
 */
public class SingleTon01 {
    public static void main(String[] args) {
        GirlFriend instance = GirlFriend.getInstance();//无论创建多少次，对象只有一个
        instance.say();
        GirlFriend instance1 = GirlFriend.getInstance();//无论创建多少次，对象只有一个
        instance1.say();//instance1==instance
    }
}
//有一个类GirlFriend
//只能有一个女朋友
class GirlFriend{
    private String name;
    //2.在类的内部创建一个对象，单例
    private static GirlFriend g1 = new GirlFriend("jack");

    //1.将构造器私有化，类的外部不能在new一个对象
    private GirlFriend(String name){
        this.name = name;
    }
    //3.向外暴露一个静态的公共方法：getinstance
    public static GirlFriend getInstance(){
        return g1;
    }
    public void say(){
        System.out.println("jack是我唯一的女朋友");
    }
}