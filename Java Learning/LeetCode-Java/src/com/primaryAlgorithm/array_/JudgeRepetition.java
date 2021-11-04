package com.primaryAlgorithm.array_;

import java.util.Arrays;

/**
 * @Author: Song-zy
 * @Date: 2021/9/25 16:53
 * @Description:
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 * 示例：
     * 输入: [1,2,3,1]
     * 输出: true
 */
public class JudgeRepetition {
    public static void main(String[] args) {
        Solution_04 solution = new Solution_04();
        int[] nums = {1,2,2,4};
        System.out.println(solution.containsDuplicate(nums));
    }
}
class Solution_04 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);//对输入的数组进行冒泡排序
        int n = nums.length;
        //由于数组是有顺序的，所以只要判定两个相邻的元素是否相等
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

}