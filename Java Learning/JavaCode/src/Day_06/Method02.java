package Day_06;

/**
 * 要求用成员方法调用，遍历二位数组map[][]={{1,2,3},{4,5,6},{9,8,7}}
 * 输出每一个元素
 */
public class Method02 {
    public static void main(String[] args) {
        int[][] map = {{1,2,3},{4,5,6},{9,8,7}};
        TwoArray twoArray = new TwoArray();
        twoArray.traverse(map);//打印
    }
}
class TwoArray{

    //创建一个traverse方法
    //接收一个数组
    public void traverse(int[][] map){
        //遍历数组
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[i].length; j++) {
                System.out.print("map[" + i + "][" + j + "] = " + map[i][j]+"\t");
            }
            System.out.println();//换行
        }
    }
}

