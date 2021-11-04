package Day_14.generic;

/**
 * @Author: Song-zy
 * @Date: 2021/10/27 20:33
 * @Description: 自定义泛型接口
 */
public class GenericInterface {
    public static void main(String[] args) {

    }
}

@SuppressWarnings("all")
interface IUSB<U, R> {
    R get(U u);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

    default R method(U u) {
        return null;
    }
}

interface IA extends IUSB<String, Double> {

}
class AA implements IA {

    @Override
    public Double get(String s) {
        return null;
    }

    @Override
    public void hi(Double aDouble) {

    }

    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}
class BB implements IUSB<Integer,Float>{

    @Override
    public Float get(Integer integer) {
        return null;
    }

    @Override
    public void hi(Float aFloat) {

    }

    @Override
    public void run(Float r1, Float r2, Integer u1, Integer u2) {

    }
}
class CC implements IUSB{
    //默认是Object
    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }

    @Override
    public void run(Object r1, Object r2, Object u1, Object u2) {

    }
}