package Day_06;


/**
 * @八皇后问题
 *八皇后问题, 是一个古者而著名的问题, 是回
 * 算法的典型案例。该问题是国际西洋棋手
 * 马克斯贝瑟尔于1848年出:在8×8格的国
 * 际象棋上摆放八个皇后,使其不能互相攻击
 * 即:任意两个皇后都不能处于同一行、同一列
 * 或同一斜线上,问有多少种摆法。
 */
public class EightQueen {
    public static void main(String[] args) {
        //整个地图是一个int[8][8],元素默认为0
        int[][] map = new int[8][8];

    }
}
//创建一个E类
//class E{
//    //定义一个findWay方法
//    //返回值为boolean类型
//    public boolean findWay(int[][] map,int i,int j){
//        //设置起点为map[0][j]，终点map[7][j]
//        if(map[7][j]==1){
//            return true;
//        }else if(map[i][j]==0){
//            map[i][j] = 1;
//            if(findWay(map,i+1,j+2)) {
//                return true;
//            }else if(findWay(map,i+1,j+4)){
//
//            }
//        }
//    }
//
//}
