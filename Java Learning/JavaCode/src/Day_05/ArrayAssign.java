package Day_05;

public class ArrayAssign {
    public static void main(String[] args) {
        //基本数据类型賦值,賦值方式为值拷贝
        //n2的变化,不会影响到n1的值
        int n1 = 10;
        int n2 = n1;
        n2 = 88;
        System.out.println("n1=" + n1);//10
        System.out.println("n2=" + n2);//80
        //数组在默认情况下是引用传递,賦的值是地址,赋值方式为引用传达
        //是一个地址,arr2变化会影响到arr1
        int[] arr1 = {1,2,3};
        int[] arr2 = arr1;//把arr1赋给arr2
        arr2[0] = 10;//同时会改变arr1[0]的值。也变成10
        System.out.print("输出arr1的值：");
        //遍历arr1
        for(int i=0;i< arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
