package Day_13.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: Song-zy
 * @Date: 2021/10/23 10:40
 * @Description:
 */
public class ListExercise {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 11; i++) {
            list.add("hello"+(i+1));
        }

        System.out.println("1.list"+list);

        list.add(1,"韩顺平教育");
        System.out.println("2.list"+list);

        System.out.println(list.get(6));
        list.remove(6);
        list.set(6,"hello77");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object next =  it.next();
            System.out.println(next);
        }
        for (Object o : list) {
            System.out.println(o);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
