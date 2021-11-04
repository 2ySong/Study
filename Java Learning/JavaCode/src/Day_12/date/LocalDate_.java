package Day_12.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @Author: Song-zy
 * @Date: 2021/10/20 21:57
 * @Description: 第三代日期类LocalDateTime
 */
public class LocalDate_ {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();//返回当前的时间
        System.out.println(ldt);//2021-10-20T22:00:07.057186700
        System.out.print(ldt.getYear()+"年");
        System.out.print(ldt.getMonthValue()+"月");
        System.out.print(ldt.getDayOfMonth()+"日--");
        System.out.print(ldt.getHour()+":");
        System.out.print(ldt.getMinute()+":");
        System.out.println(ldt.getSecond());
        //2021年10月20日--22:5:44

        //格式化日期
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh:mm:ss E");
        System.out.println(dtf.format(ldt));//当前日期：2021年10月20日 10:53:58 周三
        System.out.println(dtf.format(ldt.plusDays(30)));//30天后的日期：2021年11月19日 10:53:58 周五
        System.out.println(dtf.format(ldt.minusDays(30)));//30天前的日期：2021年09月20日 10:53:58 周一
    }
}
