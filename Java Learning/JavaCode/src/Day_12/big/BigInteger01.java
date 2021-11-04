package Day_12.big;

import java.math.BigInteger;

/**
 * @Author: Song-zy
 * @Date: 2021/10/19 18:51
 * @Description: BigInteger类学习
 * 用于存放很大的数，long也不能存放够
 */
public class BigInteger01 {
    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("999999999999");
        BigInteger bigInteger1 = new BigInteger("1");
        //add方法，加
        System.out.println(bigInteger.add(bigInteger1));//结果1000000000000

    }
}