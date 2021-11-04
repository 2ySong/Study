package Day_09.innerclass;

/**
 * @Author: Song-zy
 * @Date: 2021/10/4 0:52
 * @Description:
 * 测试手机类的闹钟功能, 通过匿名内部类对象)作为参数,打印:懒猪起床了
 * 再传入另一个匿名内部类对象),打印:小伙伴上课了
 */
public class InnerClassExercise02 {
    public static void main(String[] args) {
        CellPhone phone = new CellPhone();
        phone.alarmclock(new Bell(){
            public void ring(){
                System.out.println("懒猪起床了");
            };
        });
        phone.alarmclock(new Bell(){
            public void ring(){
                System.out.println("小伙伴上课了");
            };
        });
    }
}

//铃声接口
interface Bell{
    void ring();
}
//手机类
class CellPhone {
    public void alarmclock(Bell bell){
        System.out.println(bell.getClass());
        bell.ring();
    }
}