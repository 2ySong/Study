package Day_12.stringbuffer;

/**
 * @Author: Song-zy
 * @Date: 2021/10/13 13:31
 * @Description:
 */
public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("hello");
        //1.增
        s.append(',');//增-->s="hello,"
        s.append("琪琪子");
        s.append("宋章耀").append(';').append(12.12).append(s).append(true);
        System.out.println(s);

        //2.删除
        StringBuffer a = new StringBuffer("abcde");
        a.delete(2,4);//删除索引为2~4中间的字符，不包括4.
        System.out.println(a);//abe
        //3.改/换
        StringBuffer b = new StringBuffer("abcde");
        b.replace(2,4,"XXX");//用"XXX"替换[2,4)的内容，即替换掉"cd"
        System.out.println(b);//abXXXe
        b.replace(1,2,"s").replace(2,3,"y");
        //4.插入
        StringBuffer c = new StringBuffer("abcde");
        c.insert(1,"HHH");//在索引为1的位置插入HHH，后面的字符向后移
        System.out.println(c);//aHHHbcde
        //5.长度
        System.out.println(c.length());//8
    }
}
