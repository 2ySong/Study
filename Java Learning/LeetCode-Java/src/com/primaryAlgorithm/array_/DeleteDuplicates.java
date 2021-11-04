package com.primaryAlgorithm.array_;


/**
 * @Author: Song-zy
 * @Date: 2021/9/25 1:42
 * @Description:
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * 注意：
 *  0 <= nums.length <= 3 * 10^4
 * -(10^4) <= nums[i] <= 10^4
 * nums 已按升序排列
 */
public class DeleteDuplicates {
    public static void main(String[] args) {
        Solution_01 solution = new Solution_01();
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4,4,5,5,5};
        int len = solution.removeDuplicates(arr);
        System.out.println(len);
        for (int i = 0; i < len; i++) {
            System.out.println(arr[i]);
        }
    }
}

class Solution_01 {
    public int removeDuplicates(int[] nums) {
        int index = 0;  //当前没有重复数组的下标；
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[index]){
                index++;
                nums[index] = nums[i];
            }
        }
        return index+1;
    }
}