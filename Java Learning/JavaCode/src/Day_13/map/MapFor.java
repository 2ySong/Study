package Day_13.map;

import java.util.*;

/**
 * @Author: Song-zy
 * @Date: 2021/10/26 15:27
 * @Description: Map遍历方式
 */
public class MapFor {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超", "孙俪");
        map.put("王宝强", "马蓉");
        map.put("宋泽", "马蓉");
        map.put("szy", null);
        map.put(null, "刘亦菲");
        map.put("鹿晗", "关晓彤");

        //第一组:先取出所有的Key,通过Key取出对应的 Value
        Set keyset = map.keySet();
        //1).增强for
        for (Object key : keyset) {
            System.out.println(key + "-" + map.get(key));
        }
        System.out.println("=====");
        //2).迭代器
        Iterator it = keyset.iterator();
        while (it.hasNext()) {
            Object key = it.next();
            System.out.println(key + "-" + map.get(key));
        }
        //第二组：values：获取所有的值
        Collection values = map.values();
        //可以用Collection的所有遍历方法
        System.out.println("===");
        //1).迭代器
        Iterator it1 = values.iterator();
        while (it1.hasNext()) {
            Object value = it1.next();
            System.out.println(value);
        }
        //2).增强for
        System.out.println("===");
        for (Object o : values) {
            System.out.println(o);
        }

        //第三组：entrySet：获取所有关系
        Set entrySet = map.entrySet();
        //1)
        for (Object o : entrySet) {
            Map.Entry e = (Map.Entry) o;
            System.out.println(e.getKey()+"-"+e.getValue());
        }

        //2)
        Iterator it2 = entrySet.iterator();
        while (it2.hasNext()) {
            Object o=  it2.next();
            Map.Entry e = (Map.Entry) o;
            System.out.println(e.getKey()+"-"+e.getValue());
        }

    }
}
