package Day_06;

public class OverLoadExercise01 {
    //编写一个main方法
    public static void main(String[] args) {
        Method method = new Method();
        //调用m方法
        method.m(4);
        method.m(3,4);
        method.m("三个m方法重载");
        //调用max方法
        System.out.println(method.max(3,8));
        System.out.println(method.max(3.1,8.4));
        System.out.println(method.max(3.4,8.6,2.3));
        System.out.println(method.max(3,8,2));
    }
}
class Method{
    //三个m方法重载
    public void m(int n){
        System.out.println(n+"的平方="+n*n);
    }
    public void m(int n1,int n2){
        System.out.println(n1+"*"+n2+"="+n1*n2);
    }
    public void m(String s){
        System.out.println(s);
    }

    //三个max方法构成重载
    //返回两个int型的最大值
    public int max(int n1,int n2){
        return n1>n2? n1:n2;
    }
    //返回两个double的最大值
    public double max(double n1,double n2){
        return n1>n2? n1:n2;
    }
    public double max(double n1,double n2,double n3){
        double max1 = n1>n2?n1:n2;//得到n1和n2的最大值
        return max1>n3?max1:n3;//max和n3dezuidz
    }
}
