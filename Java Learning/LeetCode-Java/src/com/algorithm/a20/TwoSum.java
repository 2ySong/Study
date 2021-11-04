package com.algorithm.a20;

/**
 * @Author: Song-zy
 * @Date: ${DATE} ${TIME}
 * @Description:
 *      给定一个整数数组 nums和一个整数目标值 target，
 *      请你在该数组中找出 和为目标值 target的那两个整数，并返回它们的数组下标。
 *      你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 */
public class TwoSum {
    public static void main(String[] args){
        Solution_01 solution = new Solution_01();
        int nums[] = {2,7,11,15};//数组赋初值
        int[] arr1 = solution.twoSum(nums,9);
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+"");
        }
    }
}
class Solution_01 {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i = 0;i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]+nums[j]==target){
                    arr[0] = i;
                    arr[1] = j;//下标数组赋值
                    // return arr;
                }
            }
        }
        return arr;//返回下标数组
    }
}
