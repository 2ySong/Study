package Day_13.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Song-zy
 * @Date: 2021/10/23 10:28
 * @Description:
 */
public class ListMethod {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
//        1) void add( int index, Object ele)：在 index位置插入ele元素
        list.add(1, "哈哈");
        System.out.println(list);
//        2) boolean addAll(int index, Collection eles)：从 index位置开始将eles中的所有元素添加进来
        List list1 = new ArrayList();
        list1.add("张三2");
        list1.add("李四2");
        list1.add("王五2");
        list.addAll(2,list1);
        System.out.println(list);
//        3) Object get(int index)：获取指定 index位置的元素
        System.out.println(list.get(3));
//        4) int indexOf(Object obj)：返回obj在集合中首次出现的位置
        System.out.println(list.indexOf("李四"));
//        5) int lastIndexOf(Object obj)：返回obj在当前集合中末次出现的位置
//        6) Object remove( int index)：移除指定 index位置的元素，并返回此元素
        list.remove(3);
//        7) Object set( int index, Object ele)：设置指定 index位置的元素为ele，相当于是==替换==.
        list.set(1,"换上我");
        System.out.println(list);
//        8) List subList( int fromIndex, int tolndex)：返回从 fromIndex到tolndex位置的子集合
        System.out.println(list.subList(2,4));
    }
}
