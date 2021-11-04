package Day_13.map;

import java.util.Hashtable;

/**
 * @Author: Song-zy
 * @Date: 2021/10/26 20:31
 * @Description:
 */
public class HashTable_ {
    @SuppressWarnings("all")
    public static <HashTable> void main(String[] args) {
        Hashtable hashTable = new Hashtable();
        hashTable.put("john",100);//T
        try {
            hashTable.put(null,20);//F，异常
            hashTable.put("jack",null);//F，异常
        } catch (Exception e) {
            System.out.println("NullPointerException: "+e.getMessage());;
        }
        hashTable.put("tom",28);
        hashTable.put("smith",18);
        hashTable.put("john",27);//替换
        System.out.println(hashTable);
    }
}
