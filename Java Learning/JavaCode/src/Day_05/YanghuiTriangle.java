package Day_05;

/**
 * 打印一个10行的杨辉三角
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 5 1
 */
public class YanghuiTriangle {
    public static void main(String[] args) {
        int arr[][] = new int[6][];//初始化一个二维数组
        for(int i=0;i<arr.length;i++){
            arr[i] = new int[i+1];//初始化二维数组中的每一个一维数组。长度为行数。
            for(int j=0;j<arr[i].length;j++){
                if(j==0 || j==arr[i].length-1){
                    arr[i][j] = 1;//第一个数和最后一个数用于为1
                }else{
                    arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
                }
            }
        }
        //遍历整个二维数组
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
