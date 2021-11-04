package Day_07.polymorphisc_.Exercise01;

/**
 * @Author: Song-zy
 * @Date: 2021/9/26 14:45
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count);
        s.display();

        Base b = s;//向上转型
        System.out.println(b==s);
        System.out.println(b.count);//编译类型是Base，所以10
        b.display();//运行类型是Sub，所以输出20
        //方法看运行类型，属性看编译类型
    }
}
