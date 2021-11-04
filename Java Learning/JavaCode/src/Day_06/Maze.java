package Day_06;

/**
 * @迷宫问题
 * 小球得到的路径,和程序员设置的找路策略有
 * 即:找路的上下左右的顺序相关
 * 再得到小球路径时,可以先使用(下右上左)
 * 再改成(上右下左),看看路径是不是有变化
 * 测试回溯现象[8][7]
 */
public class Maze {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        for(int i=0;i<map.length;i++) {
            for (int j = 0; j < map[i].length; j++) {
                //定义迷宫的障碍元素为2
                //map[3][1],map[3][2]为障碍
                map[3][1] = 1;
                map[3][2] = 1;
                map[2][2] = 1;
                //定义迷宫的边界元素为1
                if (i == 0 || i == map.length - 1 || j == 0 || j == map[i].length - 1) {
                    map[i][j] = 1;
                }
                //其他的通道默认为0
            }
        }
        System.out.println("====当前迷宫地图====");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++){
                System.out.print(map[i][j]+"\t");
            }
            System.out.println();
        }
        //找路，调用findWay方法
        Ma ma = new Ma();
        ma.findWay(map,1,1);
        System.out.println("====找路图====");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++){
                System.out.print(map[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
class Ma{
    //使用递归回溯的思想来解决老鼠出迷宫
    //老韩解读
    //1. findway方法就是专内来找出迷宫的路径
    //2.如果找到,就返回true,否则返回 false
    //3.map就是二维数组,即表示迷宫
    //4.i,j就是老鼠的位置,初始化的位置为(1,1)
    //5.因为我们是递归的找路,所以我先规定map数组的各个值的含义
    //      0表示可以走1表示障碍物2表示可以走3表示走过,但是走不通是死路
    //6.当map[6][5]=2，说明找到通路到终点，结束找路
    //7.找路的策略：下->右->上->左
    public boolean findWay(int[][] map,int i,int j){
        if(map[6][5]==2){
            return true;//当map[6][5]=2，说明找到通路到终点，结束找路
        }else if(map[i][j]==0){//表示通路
            map[i][j]=2;//表示走过的路
            if(findWay(map,i+1,j)){//向下走
                return true;
            }else if(findWay(map,i,j+1)){//向右走
                return true;
            }else if(findWay(map,i-1,j)){//向上走
                return true;
            }else if(findWay(map,i,j-1)){//向左走
                return true;
            }else{
                map[i][j] = 3;//死路
                return false;
            }
        }else{
            return false;
        }
    }
}