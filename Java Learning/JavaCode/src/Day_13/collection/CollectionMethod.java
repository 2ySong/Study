package Day_13.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Song-zy
 * @Date: 2021/10/22 22:57
 * @Description:
 */
public class CollectionMethod {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        List list = new ArrayList();
        //1. add(): 添加单个元素
        list.add("jack");
        list.add("tom");
        list.add(100);
        list.add(true);
        list.add(false);
        list.add(12);
        list.add("XXX");
        System.out.println(list);
        //2. remove(): 删除指定元素
        list.remove("jack");//等同于list.remove(0);
        list.remove(2);
        list.remove(new Integer(100));
        System.out.println(list);
        //3. contains()：查找元素是否存在
        System.out.println(list.contains("tom"));
        //4. szie()：获取元素个数
        System.out.println(list.size());//4
        //5. isEmpty()：判断是否为空
        System.out.println(list.isEmpty());
        //6. clear()：清空
//        list.clear();
        System.out.println(list);
        //7. addAll()：添加多个元素
        List list1 = new ArrayList();
        list1.add("红楼");
        list1.add("西游记");
        list.addAll(list1);
        System.out.println(list1+"\n"+list);
        //8. containsAll()：查找多个元素是否都存在
        System.out.println(list.containsAll(list1));
        //9. removeAll()：删除多个元素
        list.removeAll(list1);
        System.out.println(list);
    }
}
