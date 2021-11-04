package com.primaryAlgorithm.array_;

import java.util.Scanner;

/**
 * @Author: Song-zy
 * @Date: 2021/9/25 15:17
 * @Description:
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 * 示例：
     * 输入: nums = [1,2,3,4,5,6,7], k = 3
     * 输出: [5,6,7,1,2,3,4]
     * 解释:
     * 向右旋转 1 步: [7,1,2,3,4,5,6]
     * 向右旋转 2 步: [6,7,1,2,3,4,5]
     * 向右旋转 3 步: [5,6,7,1,2,3,4]
 */
public class RotateArray {
    public static void main(String[] args) {
        Solution_03 solution = new Solution_03();
        int arr[] = {1,2,3,4,5,6,7};
        solution.rotate(arr,6);
    }
}
class Solution_03 {
    public void rotate(int[] nums, int k) {
        int[] index = new int[nums.length];//移动k位后的数组的各数对应原数组的下标数组
        for (int i = 0; i < index.length; i++) {
            index[i] = (nums.length+i-k)%nums.length;
            if(index[i]>=nums.length) {
                index[i] %= nums.length;
            }
        }

        //移动后的数组
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[index[i]];
        }
        //打印
        nums = arr;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}