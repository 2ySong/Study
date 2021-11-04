package Day_06;

/**
 * @汉诺塔问题
 */
public class HanoiTower {
    public static void main(String[] args) {
        Tower tower = new Tower();
        char a = 'A';
        char b = 'B';
        char c = 'C';
        tower.move(3,a,b,c);
    }
}
class Tower{
    //num表示盘的个数；a,b,c分别表示A塔，B塔，C塔
    public void move(int num,char a,char b,char c){
        if(num==1){
            System.out.println(a+"->"+c);
        }else{
            //如果有多个盘，看作两个盘：最下面的盘和上面的所有盘(num-1)
            //先移动上面的盘到B，借助C
            move(num-1,a,c,b);
            //把最下面的盘移动到C
            System.out.println(a+"->"+c);
            //再把B塔所有盘移动到C，借助A塔
            move(num-1,b,a,c);
        }
    }
}
