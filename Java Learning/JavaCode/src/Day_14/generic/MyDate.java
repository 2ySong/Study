package Day_14.generic;


/**
 * @Author: Song-zy
 * @Date: 2021/10/27 18:06
 * @Description:
 */
public class MyDate implements Comparable<MyDate> {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return year +
                "/" + month +
                "/" + day;
    }

    public int compareTo(MyDate m) {
        int y = this.year-m.year;
        if (y != 0) {
            return y;
        } else {
            int z = this.month-m.month;
            if (z != 0) {
                return z;
            } else {
                return this.day-m.day;
            }
        }
    }
}
