package Day_12.date;

import java.util.Calendar;

/**
 * @Author: Song-zy
 * @Date: 2021/10/20 21:23
 * @Description: 第二代日期类
 */
public class Calendar_ {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();//获取抽象类的对象实例，构造器被private
        System.out.println(c.getTime());//Wed Oct 20 21:32:55 CST 2021
        System.out.println(c.get(Calendar.YEAR)+"年");
        System.out.println(c.get(Calendar.MONTH)+"月");
        System.out.println((c.get(Calendar.DAY_OF_MONTH)+1)+"日");//月份要加1
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+"时");
        System.out.println(c.get(Calendar.MINUTE)+"分");
        System.out.println(c.get(Calendar.SECOND)+"秒");


        //Calendar没有转换格式的类。需要自己定义：
        String s = c.get(Calendar.YEAR)+"年"+c.get(Calendar.MONTH)+"月"+(c.get(Calendar.DAY_OF_MONTH)+1)+"日 "+
                c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND);
        System.out.println(s);
    }
}
