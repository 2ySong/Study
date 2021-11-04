package Day_05;

/**
 * 求数组的最大值，并输出对应的下标
 */
public class Array04 {
    public static void main(String[] args) {
        int arr[] = {4, 5, 30,-9, 89,44};
        int max=arr[0];//默认arr[0]是最大的，和剩下的比较
        int maxIndex=0;//默认arr[0]的下标是最大值的下标
        for(int i=0;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println(max);
        System.out.println(maxIndex);
    }
}
