package Day_13.homework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author: Song-zy
 * @Date: 2021/10/26 22:30
 * @Description:
 */
public class Homework03 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put("jack",650);
        map.put("toml",1200);
        map.put("smith",2900);

        map.put("jack",2600);
        Set keyset = map.keySet();
        for (Object key : keyset) {

            map.put((String) key,(map.get(key)+100));
        }

        System.out.println("姓名\t\t工资");
        Set entrySet = map.entrySet();
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry =(Map.Entry) it.next();
            System.out.println(entry.getKey()+"\t"+entry.getValue()+"元");
        }
    }
}
