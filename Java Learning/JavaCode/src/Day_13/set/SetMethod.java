package Day_13.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @Author: Song-zy
 * @Date: 2021/10/23 21:03
 * @Description: Set方法详解: 以HashSet为例演示
 */
public class SetMethod {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("jack");
        set.add("tom");
        set.add("smith");
        set.add("szy");
        set.add("hsp");
        set.add("szy");//重复数据不会计入
        set.add(null);
        set.add(null);//重复数据不会计入
        //输出时，是没有顺序的:[null, tom, szy, smith, hsp, jack],这个顺序是固定的
        System.out.println(set);

        //遍历方式：两种
        //遍历1: 迭代器
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            System.out.print(next + " ");
        }
        System.out.println();

        //遍历2：增强for
        for (Object o : set) {
            System.out.print(o + " ");
        }
        //不能通过索引获取
        System.out.println();
    }
}
