package day_16;

/**
 * @Author: Song-zy
 * @Date: 2021/10/28 15:21
 * @Description:
 */
public class NumCPU {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        //当前电脑CPU数量
        int cpuNums = runtime.availableProcessors();
        System.out.println(cpuNums);
    }
}
