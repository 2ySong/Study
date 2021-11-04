package Day_12.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: Song-zy
 * @Date: 2021/10/15 16:30
 * @Description: Arrays类方法详解
 */
public class ArraysMethod01 {
    public static void main(String[] args) {
        Integer[] arr1 = {1, 23, 57};
        System.out.println("1.toString方法：" + Arrays.toString(arr1));//[1,23,57]
        Integer[] arr2 = {1, 23, 57, 12, 765, 0};
        Arrays.sort(arr2);
        System.out.println("2.sort方法(小-->大)：" + Arrays.toString(arr2));
        //定制排序
        Arrays.sort(arr2, new Comparator() {//实现了Comparator接口的匿名内部类
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println("3.定制sort方法(大-->小)：" +Arrays.toString(arr2));
        //binarySearch通过二分搜索法进行查找，要求必须排好序
        Integer[] arr3 = {1,3,56,78,98};
        System.out.println(Arrays.binarySearch(arr3,3));
        //copyOf拷贝数组
        Integer[] newArr = Arrays.copyOf(arr3,arr3.length-1+5);
        System.out.println("copyOf拷贝后的数组："+Arrays.toString(newArr));

        Integer[] num = new Integer[]{1,2,3};
        Integer[] s = new Integer[]{1,2,3};
//        Arrays.fill(num,99);//将num全部替换为99
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.equals(s,num));

        //asList方法，将数组元素转成类似集合中
        List list = Arrays.asList(s);
        System.out.println("asList="+list);//asList=[1, 2, 3]
        System.out.println(list.getClass());//class java.util.Arrays$ArrayList
    }
}
