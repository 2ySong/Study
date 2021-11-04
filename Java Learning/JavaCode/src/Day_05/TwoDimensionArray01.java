package Day_05;

/**
 * 二维数组
 */
public class TwoDimensionArray01 {
    public static void main(String[] args) {
        //输出二维数组
        int[][] twoArray = {{1,2,3},{5,6,7},{0,8,9},{9,4,0}};
        for(int i=0;i<twoArray.length;i++){
            //twoArray[i].length得到对应的一维数组的长度
            for(int j=0;j<twoArray[i].length;j++){
                System.out.print(twoArray[i][j]+" ");
            }
            System.out.println();
        }
    }
}
