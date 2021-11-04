package Day_09.codeblock;

/**
 * @Author: Song-zy
 * @Date: 2021/9/30 23:50
 * @Description:
 */
public class CodeBlockExercise02 {
    Sample sam1= new Sample("sam1成员初始化");//
    static Sample sam= new Sample("静态成员sam初始化");//
    static{
        System.out.println(" static块执行");//
        if(sam==null)System.out.println("sam is null");//不为空
    }
    CodeBlockExercise02(){
        System.out.println("CodeBlockExercise02默认构造函数被调用");//
    }
    public static void main(String str[]){
        CodeBlockExercise02 a= new CodeBlockExercise02();//无参构造器
    }
}
class Sample{
    Sample(String s){
        System.out.println(s);
    }
    Sample(){
        System.out.println("Sample类的默认构造函数被调用");
    }
}
/*输出
静态成员sam初始化
static块执行
sam1成员初始化
CodeBlockExercise02默认构造函数被调用
 */