package Day_10.enum_;

/**
 * @Author: Song-zy
 * @Date: 2021/10/4 18:43
 * @Description:
 */
public class EnumExercise02 {
    public static void main(String[] args) {
        Week[] weeks = Week.values();
        System.out.println("====所有星期的信息如下====");
        for (Week w : weeks) {
            System.out.println(w);
        }
    }
}
enum Week {
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"), THURSDAY("星期四"),
    FRIDAY("星期五"), SATURDAY("星期六"),SUNDAY("星期日");
    private String name;

    Week(String name) {
        this.name = name;
    }

    //重写toString方法，输出对象时，直接输出name
    @Override
    public String toString() {
        return name;
    }


}