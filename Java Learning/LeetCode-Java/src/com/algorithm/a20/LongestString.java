package com.algorithm.a20;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: Song-zy
 * @Date: 2021/9/24 19:34
 * @Description: 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度
 */
public class LongestString {
    public static void main(String[] args) {
        Solution_03 solution03 = new Solution_03();
        String str = "abcabcbb";
        System.out.println(solution03.lengthOfLongestSubstring(str));
    }
}

class Solution_03 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}

