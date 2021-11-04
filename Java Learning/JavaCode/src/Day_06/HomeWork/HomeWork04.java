package Day_06.HomeWork;

/**
 * 编写类A04,实现数组的复制功能 copyArr，输入旧数组,返回一个新数组,元素和旧数组一样
 */
public class HomeWork04 {
    public static void main(String[] args) {
        A04 a = new A04();
        double[] arr1 = {2,3,4,6,89.6};
        double[] arr2 = a.copyArr(arr1);
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]+"\t");
        }
    }
}
class A04{
    public double[] copyArr(double[] oldArr){
        double[] newArr = new double[oldArr.length];
        for(int i = 0; i<oldArr.length; i++){
            newArr[i] = oldArr[i];
        }
        return newArr;
    }
}