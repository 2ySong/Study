package com.algorithm.a20;

/**
 * @Author: Song-zy
 * @Date: 2021/9/24 20:34
 * @Description:
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 * 实例：
 *  输入：nums1 = [1,3], nums2 = [2]
 *  输出：2.00000
 *  解释：合并数组 = [1,2,3] ，中位数 2
 */
public class FindMedian {
    public static void main(String[] args) {
        Solution_04 solution = new Solution_04();
        int[] nums1 = {2,2,4,4};
        int[] nums2 = {2,2,4,4};
        double n = solution.findMedianSortedArrays(nums1,nums2);
        System.out.println(n);
    }
}
class Solution_04 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double [] newArray = new double[nums1.length+nums2.length];
        //将两个数组合并
        int k = 0;
        for (int i = 0; i < newArray.length; i++) {
            if(i< nums1.length){
                newArray[i] = nums1[i];
            }else{
                newArray[i] = nums2[k];
                k++;
            }
        }
//        遍历合并后的数组
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]+" ");
        }
        System.out.println();
        //将新数组从小到大排序:冒泡排序
        double temp;
        for (int i = 0; i < newArray.length-1; i++) {
            for (int j = 0; j < newArray.length-1-i; j++) {
                if(newArray[j]>newArray[j+1]){
                    temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }
        //遍历排序后的数组
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]+" ");
        }
        System.out.println();
        //找出中位数
        if(newArray.length%2==0){
            return (newArray[(newArray.length-2)/2]+newArray[(newArray.length)/2])/2;
        }else{
            return newArray[(newArray.length-1)/2];
        }
    }
}