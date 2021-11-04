package Day_07.polymorphisc_.indoor;

/**
 * @Author: Song-zy
 * @Date: 2021/9/26 0:14
 * @Description: 对象的多态
 */
public class PolyObject {
    public static void main(String[] args) {
        //体验对象多态的特点

        //animal的编译类型就是Animal，运行类型是Dog
        Animal animal = new Dog();
        //因为运行时,执行到该行时, animal运行类型是Dog，所以cry就是Dog的cry方法
        animal.cry();//会输出  小狗汪汪叫……

        //此时animal的编译类型还是Animal，运行类型是Cat
        animal = new Cat();
        //因为运行时,执行到该行时, animal运行类型是Cat，所以cry就是Cat的cry方法
        animal.cry();//会输出  小猫喵喵叫……
    }
}
