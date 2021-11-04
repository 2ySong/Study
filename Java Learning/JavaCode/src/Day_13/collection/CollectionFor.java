package Day_13.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author: Song-zy
 * @Date: 2021/10/23 9:52
 * @Description: 增强for循环遍历集合或者数组
 */
public class CollectionFor {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("红楼梦", 45, "曹雪芹"));
        col.add(new Book("西游记", 89, "吴承恩"));
        col.add(new Book("水浒传", 99, "罗贯中"));

        System.out.println(col);//输出
        System.out.println("使用增强for循环遍历");
        //1.使用增强for循环遍历集合
        for (Object book : col) {
            System.out.println(book);
        }

        //2.使用增强for循环遍历数组
        int[] arr = {1, 2, 3, 4, 5};
        for (int a : arr) {
            System.out.print(a+" ");
        }
    }
}
