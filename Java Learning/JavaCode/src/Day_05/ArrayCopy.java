package Day_05;

public class ArrayCopy {
    //编写一个main方法
    public static void main(String[] args) {
        //实现数组拷贝
        //要求arr2有独立的内存空间
        int arr1[] = {1,2,3};//初始化arr1，一个arr1de内存空间
        //创建一个数组arr2，开辟新的内存空间
        int arr2[] = new int[arr1.length];//设置arr2的长度和arr1的一样
        //遍历arr1,把arr1的元素拷贝到arr2对应的位置
        for(int i=0;i<arr1.length;i++){
            arr2[i] = arr1[i];//实现数组拷贝，两个数组各自拥有独立的内存空间
        }
        //改变arr2[0]的值
        arr2[0] = 20;
        //此时，arr1[0]的值不会改变，因为两个不是同一个地址
        System.out.print("遍历arr2:");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println("");
        System.out.print("遍历arr1:");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
