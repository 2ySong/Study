package com.algorithm.a20;

/**
 * @Author: Song-zy
 * @Date: 2021/9/24 21:21
 * @Description:
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * 如果反转后整数超过 32 位的有符号整数的范围[−2^31, 2^31− 1] ，就返回 0。
 * 假设环境不允许存储 64 位整数（有符号或无符号）
 */
public class ReverseInteger {
    public static void main(String[] args) {
        Solution_7 solution = new Solution_7();
        System.out.println(solution.reverse(123456789));
    }
}
class Solution_7 {
    public int reverse(int x) {
        int ans = 0;
        int flag = x>0?1:-1;	// 表示的就是 正数，负数的状态 flag
        x = x > 0 ? x : -x;		// 将x 转为正数 进行运算
        while(x !=0)
        {
            if(ans != (ans * 10)/10)	// 判断 是否溢出(溢出的话 数据ans/10 和原来的ans 不相等)
            {
                return 0;		// leetcode 上面 都是 直接 return 数据，所以形式有所不同
//                break;
            }
            ans =ans * 10 + x%10;	// 倒序输出
            x /= 10;
        }
        return flag * ans;	// 正负数状态输出
    }
}