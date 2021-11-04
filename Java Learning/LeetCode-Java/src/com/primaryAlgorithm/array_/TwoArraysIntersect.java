package com.primaryAlgorithm.array_;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @Author: Song-zy
 * @Date: 2021/11/2 10:21
 * @Description: 给定两个数组，编写一个函数来计算它们的交集。
 */
public class TwoArraysIntersect {
    public static void main(String[] args) {
        Solution_06 solution_06 = new Solution_06();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] a = solution_06.intersect(nums1, nums2);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

class Solution_06 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (hashMap.containsKey(nums1[i])) {
                hashMap.put(nums1[i], hashMap.get(nums1[i]) + 1);
            }else {
                hashMap.put(nums1[i], 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (hashMap.containsKey(nums2[i]) && hashMap.get(nums2[i]) != 0) {
                list.add(nums2[i]);
                hashMap.put(nums2[i], hashMap.get(nums2[i]) - 1);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}