package Day_14.generic;

/**
 * @Author: Song-zy
 * @Date: 2021/10/27 20:27
 * @Description:
 */
public class Box<T> {

    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        Integer i = 10;
        integerBox.add(i);
        stringBox.add(new String("菜鸟教程"));

        System.out.printf("整型值为 :%d\n\n", integerBox.get());
        System.out.printf("字符串为 :%s\n", stringBox.get());
    }
}