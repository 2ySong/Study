package Day_12.system;

import java.util.Arrays;

/**
 * @Author: Song-zy
 * @Date: 2021/10/19 15:56
 * @Description: System常用方法
 */
public class System01 {
    public static void main(String[] args) {
        //1. exit退出程序
        System.out.println(1);
        //System.exit(0);
        System.out.println(2);
        //2. arraycopy,复制数组元素，比较适合底层调用，一般使用。
        int[] src = {1, 2, 3};
        int[] dest = new int[5];
        System.arraycopy(src, 0, dest, 0, 3);
        /*
        src: 源数组
        srcPos: 从源数组中开始复制的下标位置
        dest: 目的数组
        destPos: 和srcPos对应
        length: 要复制的长度
         */
        System.out.println(Arrays.toString(dest));

        //3. currentTimeMillis：返回当前时间距离1970-1-1的毫秒数
        long x1 = System.currentTimeMillis();
        for (long i = 0; i < 100000; i++) {
            i++;
        }
        long x2 = System.currentTimeMillis();
        System.out.println(x2+"ms - "+x1+"ms = "+(x2-x1)+"ms");
        //4. gc：运行垃圾回收机制 System.gc();
    }
}
