package Day_13.collection;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Author: Song-zy
 * @Date: 2021/10/22 22:41
 * @Description: 集合
 */
public class Collection01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        //add方法，添加元素
        arrayList.add("jack");
        arrayList.add("tom");
        arrayList.add("smith");
        System.out.println(arrayList);

        //
        HashMap hashMap = new HashMap();
        //put方法，添加元素
        hashMap.put("NO1","北京");
        hashMap.put("NO2","上海");
        hashMap.put("NO3","杭州");
        System.out.println(hashMap);
    }
}
