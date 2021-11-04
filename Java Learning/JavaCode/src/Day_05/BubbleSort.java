package Day_05;

/**
 * 冒泡排序
 * 将[24,69,80,57,13]五个数升序排列
 */
public class BubbleSort {
    public static void main(String[] args) {
        //化繁为简，先死后活
        int[] arr = {2,2,4,4,2,2,4,4};
        int temp;
        int n = arr.length;//将数组的长度赋值给一个变量。可以随意添加数组的元素
        for (int j = 0; j < n-1; j++) {
            for (int i = 0; i < n-1-j; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            System.out.print("第"+(j+1)+"轮排序后arr为：");
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
