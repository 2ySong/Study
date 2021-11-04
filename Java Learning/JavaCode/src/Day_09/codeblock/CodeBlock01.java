package Day_09.codeblock;

/**
 * @Author: Song-zy
 * @Date: 2021/9/30 13:46
 * @Description:
 */
public class CodeBlock01 {
    public static void main(String[] args) {
        System.out.print("电影1：");
        Movie movie01 = new Movie("你好，李焕英！");
        System.out.print("电影2：");
        Movie movie02 = new Movie("告白气球！");
        System.out.print("电影3：");
        Movie movie03 = new Movie("星际穿越！");
    }
}
class Movie{
    private String name;
    private double price;
    private String director;

    //代码块
    //无论调用哪一个构造器，都会优先执行代码块中的内容
    {
        System.out.println("电影开始了……");
        System.out.println("广告开始了……");
        System.out.println("电影结束了……");
    }

    public Movie(String name) {
        this.name = name;
    }

    public Movie(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
    }
}