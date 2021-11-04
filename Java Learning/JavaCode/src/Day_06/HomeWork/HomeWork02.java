package Day_06.HomeWork;

/**
 * 编写类A02,定义方法find,实现查找某字符串数组中的元素查找,并返回索引。如果找不到,返回-1.
 */
public class HomeWork02 {
    public static void main(String[] args) {
        A02 a = new A02();
        int subscript = a.find("szy1","a","b","c","d");
        System.out.println(subscript);
    }
}
class A02{
    public int find(String s,String...strs){
        int index = -1;
        for(int i=0; i<strs.length; i++){
            if(s.equals(strs[i])){
                index = i;
            }
        }
        return index;
    }
}