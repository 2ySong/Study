package Day_12.homework;

/**
 * @Author: Song-zy
 * @Date: 2021/10/22 20:41
 * @Description:
 */
public class Homework03_ {
    public static void main(String[] args) {
        String str = "Han shun Ping";
        formatName(str);
    }

    public static void formatName(String str) {
        if(str==null){
            System.out.println("注意：名字不能为空");
            return;
        }

        String[] names = str.split(" ");
        if(names.length!=3){
            System.out.println("注意：名字格式不正确");
            return;
        }
        String format = String.format("%s,%s .%c",names[2],names[0],names[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
