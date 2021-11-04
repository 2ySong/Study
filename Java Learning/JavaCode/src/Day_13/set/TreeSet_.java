package Day_13.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author: Song-zy
 * @Date: 2021/10/26 21:11
 * @Description:
 */
@SuppressWarnings("all")
public class TreeSet_ {
    public static void main(String[] args) {
//        TreeSet treeSet = new TreeSet();
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).compareTo((String)o2);
                /*
                    改变o1和o2的位置，可以改变它的排序方式
                        o1在前，或者没有这个匿名内部类。就是按首字母的ASCII值升序;A->Z->a->z
                        o2在前，就是降序。z->a->Z->A
                 */
                //按照长度大小排序: 改变匿名内部类的返回语句

                //return ((String)o2).length ()-((String)o1).length();



            }
        });
        treeSet.add("d");
        treeSet.add("a");
        treeSet.add("cd");
        treeSet.add("b");
        System.out.println(treeSet);//默认按首字母升序排列：[a, b, c, d]
    }
}
