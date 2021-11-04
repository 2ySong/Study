package Day_01;

import java.util.Scanner;

/**
 * @Author: Song-zy
 * @Date: 2021/9/24 23:28
 * @Description:
 * 第一行一个整数N，表示所有提交的次数(0<N<=2000000)。
 * 以下N行，表示每次提交对应的学生编号Ai,(0<Ai<=1000000)。
 * 接下来一行，一个整数M，表示要查询学生的数量M(0<M<=10000)。
 * 接下来M行，每行一个学生编号（编号在int范围内）
 */
public class Pta5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        int[] ai = new int[n];
        for (int i = 0; i < n; i++) {
            int x = myScanner.nextInt();
            ai[i] = x;
        }

        int m = myScanner.nextInt();
        int[] stu = new int[m];
        for (int i = 0; i < m; i++) {
            int x = myScanner.nextInt();
            stu[i] = x;
        }

        int[] index = new int[m];
        for (int i = 0; i < m; i++) {
            index[i] = -1;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(stu[i]==ai[j]){
                    index[i] = j;
                }
            }

        }
        for (int j = 0; j < m; j++) {
            if(index[j]!=-1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
