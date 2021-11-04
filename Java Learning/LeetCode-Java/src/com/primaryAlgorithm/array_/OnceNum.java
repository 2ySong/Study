package com.primaryAlgorithm.array_;

/**
 * @Author: Song-zy
 * @Date: 2021/9/30 8:55
 * @Description:
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *      说明：你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * 示例 1:
 *      输入: [2,2,1]
 *      输出: 1
 * 示例2:
 *      输入: [4,1,2,1,2]
 *      输出: 4
 * 异或
 *      a^a=0；自己和自己异或等于0
 *      a^0=a；任何数字和0异或还等于他自己
 *      a^b^c=a^c^b；异或运算具有交换律
 */
public class OnceNum {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(Solution_05.singleNumber(nums));
    }
}
class Solution_05 {
    public static int singleNumber(int[] nums) {
        int reduce = 0;
        for (int i = 0; i < nums.length; i++){
            reduce = reduce^nums[i];//进行位运算，异或，如果相同，reduce永远为0，不相同则返回返回不同的数字
        }
        return reduce;
    }
}