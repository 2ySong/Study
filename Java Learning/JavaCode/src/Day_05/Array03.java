package Day_05;

/**
 * 将A~Z存放到一个数组中
 */
public class Array03 {
    public static void main(String[] args) {
        char arr1[] = new char[26];
        int j=0;
        for(char c='A';c<='Z';c++){
            arr1[j]=c;
            j++;
        }
        System.out.println("所有大写字母存放到一个数组中：");
        for (int i=0;i<26;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
