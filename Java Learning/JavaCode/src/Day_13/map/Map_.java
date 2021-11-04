package Day_13.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Song-zy
 * @Date: 2021/10/25 15:04
 * @Description:
 */
public class Map_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        Map map = new HashMap();
        //占坑位只和Key有关，和value无关
        map.put("no1","张无忌");//K-V
        map.put("no2","尹志平");//K-V
        //{no2=尹志平, no1=张无忌}
        map.put("no1","张三丰");//当有相同的Key时，就等价于替换先前Key中的Value；即table中的张无忌会被替换成张三丰
        //{no2=尹志平, no1=张三丰}
        map.put("no3","尹志平");//只要Key不同，相同的value值可以加入
        //{no2=尹志平, no1=张三丰, no3=尹志平}
        map.put(1,"hhh");
        //{no2=尹志平, no1=张三丰, 1=hhh, no3=尹志平}
        System.out.println(map);
        System.out.println(map.get("no2"));//尹志平
    }
}
