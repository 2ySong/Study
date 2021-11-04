package Day_05;

import java.util.Scanner;

/**
 * 查找
 */
public class SeqSearch {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String king[] = {"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
        while(true){
            int index = -1;
            System.out.println("请输入一个人物：");
            String s = myScanner.next();
            for(int i=0; i<s.length(); i++){
                if(king[i].equals(s)){
                    System.out.println("数列中包含"+s+"，下标为："+i);
                    index = i;
                    break;//退出for循环
                }
            }
            if(index == -1){//如果找到。index将不等于-1
                System.out.println("找不到");
                break;
            }
        }
    }
}
