package Day_06;

/**
 * @重载
 */
public class OverLoad01 {
    public static void main(String[] args) {
        O o = new O();
        System.out.println(o.calculate(1,3));
        System.out.println(o.calculate(1,3.1));
        System.out.println(o.calculate(1.5,3));
        System.out.println(o.calculate(1,3,9));
    }
}
class O{
    //下面四个calculate方法构成重载
    public int calculate(int n1,int n2){
        return n1+n2;
    }

    public double calculate(int n1 , double n2){
        return n1+n2;
    }
    public double calculate(double n2, int n1){
        return n1+n2;
    }
    public int calculate (int n1, int n2, int n3){
        return n1+n2+n3;
    }
}
