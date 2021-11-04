package Day_09.final_;

/**
 * @Author: Song-zy
 * @Date: 2021/10/1 17:57
 * @Description: final关键字
 */
public class FinalDetail01 {
}
class AA{
    //1。定义位置。必须赋初值
    public final double TAX_RATE=0.08;
    public final double TAX_RATE2;
    public final double TAX_RATE3;
    //2.在构造器中赋值
    public AA() {
        TAX_RATE2 = 9.8;
    }
    //3.在代码块中赋值
    {
        TAX_RATE3=8.4;
    }
}