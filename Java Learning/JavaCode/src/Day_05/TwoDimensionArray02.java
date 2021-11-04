package Day_05;

public class TwoDimensionArray02 {
    //main方法
    public static void main(String[] args) {
        //动态初始化
        int[][] twoArray = new int[3][2];//3行2列
        twoArray[1][0] = 2;
        for (int i = 0; i <twoArray.length; i++){//twoArray.length二维数组有几行
            for (int j = 0; j < twoArray[i].length; j++){//woArray[i].length二维数组有几列
                System.out.print(twoArray[i][j]+" ");//没有被赋值的元素默认为0；
            }
            System.out.println();
        }
    }
}
