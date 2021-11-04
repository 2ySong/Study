package Day_13.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: Song-zy
 * @Date: 2021/10/23 9:28
 * @Description:
 */
@SuppressWarnings("all")
public class Iterator_ {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("红楼梦",45,"曹雪芹"));
        col.add(new Book("西游记",89,"吴承恩"));
        col.add(new Book("水浒传",99,"罗贯中"));

        System.out.println(col);//输出

        System.out.println("====循环遍历====");
        //遍历集合
        //1.先得到该集合的迭代器
        Iterator iterator = col.iterator();
        //2.使用while循环遍历
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //3.当退出 whiLe循环后,这时 iterator迭代器,指向最后的元素
        //iterator.next()://NoSuchELementException
        //4。如果希望再次遍历,需要重置我们的迭代器
        iterator = col.iterator();
        System.out.println("第二次遍历。要重置迭代器");
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
@SuppressWarnings("all")
class Book {
    private String name;
    private double price;
    private String author;

    public Book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}