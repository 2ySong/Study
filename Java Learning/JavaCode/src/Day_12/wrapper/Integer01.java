package Day_12.wrapper;

/**
 * @Author: Song-zy
 * @Date: 2021/10/9 1:22
 * @Description:
 */
public class Integer01 {
    public static void main(String[] args) {
        //1. jdk5前的手动装箱和拆箱方式，==装箱==：基本类型--->包装类型；反之，拆箱
        //2. jdk5以后(含jdk5)的自动装箱和拆箱方式
        int n1 = 100;
//        Integer integer= new Integer(n1);//该方式已经弃用
        Integer integer2= Integer.valueOf(n1);
        //手动拆箱
        int integer3 = integer2.intValue();

        //自动装箱int->Integer
        int n2 = 100;
        Integer i = n2;//底层使用的是Integer.valueOf(n2),和原来本质没有改变，只是形式改变了
        //自动拆箱Integer->int
        int n3 = i;//底层使用的是i.intValue();和原来本质没有改变，只是形式改变了

    }
}
