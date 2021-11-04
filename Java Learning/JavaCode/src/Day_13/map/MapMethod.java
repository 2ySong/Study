package Day_13.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Song-zy
 * @Date: 2021/10/26 15:06
 * @Description: Map接口常用方法
 */
public class MapMethod {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Map map = new HashMap();
        //1.put:添加
        map.put("邓超", new Book("", 100));
        map.put("邓超", "孙俪");
        map.put("王宝强", "马蓉");
        map.put("宋泽", "马蓉");
        map.put("szy", null);
        map.put(null, "刘亦菲");
        map.put("鹿晗", "关晓彤");

        System.out.println(map);
        //2.remove:删除
        map.remove("szy");
        System.out.println(map);
//        3. get：根据键获取值
        System.out.println(map.get("鹿晗"));//关晓彤
//        4. size：获取元素个数
        System.out.println(map.size());//5
//        5. isEmpty：判断个数是否为空
        System.out.println(map.isEmpty());//false

//        7. containsKey：查找键是否存在
        System.out.println(map.containsKey(null));//true
        //        6. clear：清除
        map.clear();
        System.out.println(map.isEmpty());//true
    }
}

class Book {
    private String name;
    private int num;

    public Book(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}