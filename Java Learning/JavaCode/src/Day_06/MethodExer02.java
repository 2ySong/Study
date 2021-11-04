package Day_06;

public class MethodExer02 {
    public static void main(String[] args) {
        //实例化MyTool
        MyTool myTool = new MyTool();
        int[][] arr = {{1,2,3},{4,5,6},{6,7,8}};
        myTool.print(arr);
    }
}
//创建一个MyTool类
class MyTool{
    //创建一个print方法，用于打印数据
    public void print(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();//换行
        }
    }
}
