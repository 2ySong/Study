package Day_12.date;

import java.time.Instant;
import java.util.Date;

/**
 * @Author: Song-zy
 * @Date: 2021/10/20 22:37
 * @Description: Instant类，时间戳
 */
public class Instant_ {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        Date date = Date.from(now);
        Instant instant  = date.toInstant();
        System.out.println(date);
    }
}
