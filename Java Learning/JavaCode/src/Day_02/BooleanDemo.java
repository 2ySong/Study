package Day_02;

public class BooleanDemo {
    public static void main(String[] args){
        //定义一个布尔变量
        boolean b = true;
        if(b == true){
            System.out.println("恭喜你，考试合格！");
        }else{
            System.out.println("考试不合格");
        }
        //演示自动转换
        int a = 'b';//可以自动转换，char-->int
        System.out.println(a);
        double c = 89;//可以自动转换，int-->double
        System.out.println(c);
        //演示强制转换
        int m = (int)1.9;
        System.out.println("m="+m);//精度损失
        int j = 2000;
        byte n = (byte)j;
        System.out.println("n="+n);//精度溢出

    }
}
