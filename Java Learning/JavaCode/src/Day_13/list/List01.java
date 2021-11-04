package Day_13.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Song-zy
 * @Date: 2021/10/23 10:18
 * @Description:
 */
public class List01 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        //List集合类中元素有序(即添加顺序和取出顺序一致)、且可重复
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("smith");
        list.add("tom");//可重复
        //List集合中的每个元素都有其对应的顺序索引，即支持==索引==。
        System.out.println(list.get(2));//smith
    }
}
