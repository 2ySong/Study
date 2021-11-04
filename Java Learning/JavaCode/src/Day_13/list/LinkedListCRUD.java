package Day_13.list;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @Author: Song-zy
 * @Date: 2021/10/23 20:09
 * @Description: LinkedList的增删改查
 */
public class LinkedListCRUD {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        //1. 增加
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        LinkedList linkedList1 = new LinkedList();
        linkedList1.add(1);
        linkedList1.add(2);
        linkedList1.add(3);
        System.out.println(linkedList);//1,2,3
        //2. 删除:默认删除第一个
        linkedList.remove();
        System.out.println(linkedList);//2,3
        //指定索引删除
        linkedList.remove(0);
        System.out.println(linkedList);//3
        //3. 修改
        linkedList1.set(0,9);//索引0，替换为9
        System.out.println(linkedList1);//9,2,3
        //4. 查
        System.out.println(linkedList1.contains(9));//true
        System.out.println(linkedList1.contains(5));//false
        //5. 根据获取对象
        System.out.println(linkedList1.get(1)+"\n====");//2

        Iterator it = linkedList1.iterator();
        while (it.hasNext()) {
            Object next =  it.next();
            System.out.println(next);
        }
        System.out.println("===");
        for (Object o :linkedList1) {
            System.out.println(o);
        }

    }
}
