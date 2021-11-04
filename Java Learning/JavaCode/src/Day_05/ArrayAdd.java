package Day_05;

public class ArrayAdd {
    public static void main(String[] args) {
        //实现对数组的扩容+4
        int arr[] = {1, 2, 3};
        //创建一个新的数组，长度比arr.length多一
        int arrNew[] = new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            arrNew[i] = arr[i];
        }
        arrNew[arrNew.length-1] = 4;
        //再把arrNew地址转移给arr
        arr = arrNew;//原先的arr会被自动销毁
        System.out.println("扩容后的arr：");
        for(int i=0;i<arr.length;i++){
            System.out.println("arr["+i+"]="+arr[i]);
        }
    }
}
