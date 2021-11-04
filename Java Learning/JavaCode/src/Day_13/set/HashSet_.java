package Day_13.set;

import java.util.HashSet;

/**
 * @Author: Song-zy
 * @Date: 2021/10/23 21:21
 * @Description:
 */
public class HashSet_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        /*构造器：就是HashMap
            public HashSet() {
                map = new HashMap<>();
            }
         */
        HashSet hashSet = new HashSet();
        System.out.println(hashSet.add("jack"));//true
        System.out.println(hashSet.add("tom"));//true
        System.out.println(hashSet.add("smith"));//true
        System.out.println(hashSet.add("szy"));//true
        System.out.println(hashSet.add("hsp"));//true
        System.out.println(hashSet.add("szy"));//false重复数据不会计入
        System.out.println(hashSet.add(null));//true
        System.out.println(hashSet.add(null));//false重复数据不会计入

        System.out.println(hashSet.remove("szy"));//true
        System.out.println(hashSet);//[null, tom, smith, hsp, jack]
    }
}
