package Day_06.HomeWork;
/*
编写类A01，定义方法max，实现求某个 double数组的最大值，并返回。
 */
public class HomeWork01 {
    public static void main(String[] args) {
        A01 a = new A01();
        double d = a.max(3.2, 4.5, 888, 6, 8.9, 99.7);
        System.out.println("最大值为"+d);
    }
}
class A01{
    public double max(double...arr){
        double maxIndex = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > maxIndex){
                maxIndex = arr[i];
            }
        }
        return maxIndex;
    }
}
