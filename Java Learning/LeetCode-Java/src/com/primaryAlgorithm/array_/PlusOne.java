package com.primaryAlgorithm.array_;


/**
 * @Author: Song-zy
 * @Date: 2021/11/7 22:12
 * @Description: 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
@SuppressWarnings("all")
public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {8, 9, 9, 9};
        int[] result = plusOne(digits);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }

    public static int[] plusOne(int[] digits) {
//        int[] result;
//
//        int count = 0;
//        for (int i = digits.length - 1; i >= 0; i--) {
//            if (digits[i] == 9) {
//                count++;//计算数组中，从最后一位到前面，共有几个连续的9
//            } else {
//                break;
//            }
//        }
//        //如果全部都是9，就要进位，形式为100...
//        if (count == digits.length) {
//            result = new int[digits.length + 1];
//            result[0] = 1;
//            return result;
//        }
//        else if (count == 0) {
//            digits[digits.length - 1]++;
//            return digits;
//        } else {
//            digits[digits.length - count - 1] ++;
//            for (int i = digits.length - count; i < digits.length; i++) {
//                digits[i] = 0;
//            }
//            return digits;
//        }
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        //跳出for循环，说明数字全部是9
        int[] temp = new int[digits.length + 1];
        temp[0] = 1;
        return temp;
    }
}
