package Day_13.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: Song-zy
 * @Date: 2021/10/26 21:48
 * @Description: Collections工具类
 */
@SuppressWarnings("all")
public class Collections_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);//[1, 2, 3, 4]
        //1) reverse(List)：反转List中元素的顺序
        Collections.reverse(list);
        System.out.println(list);//[4, 3, 2, 1]
        //2) shuffle(List)：对List集合元素进行随机排序
        Collections.shuffle(list);
        System.out.println(list);//[3, 2, 4, 1]
        //3) sort(List)：根据元素的自然顺序对指定List集合元素按升序排序
        Collections.sort(list);
        System.out.println(list);//[1, 2, 3, 4]
        //4) sort(List,Comparator)：根据指定的 Comparator产生的顺序对List集合元素进行排序

        list.set(0,"tom");
        list.set(1,"jack");
        list.set(2,"we");
        list.set(3,"jjjjj");
        try {
            Collections.sort(list, new Comparator<Object>() {
                @Override
                public int compare(Object o1, Object o2) {
                    return ((String)o1).length()-((String)o2).length();//根据字符串长度排序
                }
            });
            System.out.println(list);//[we, tom, jack, jjjjj]
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //5) swap(List,int,int)：将指定list集合中的i处元素和j处元素进行交换
        Collections.swap(list,1,3);
        System.out.println(list);//[we, jjjjj, jack, tom]
    }
}
