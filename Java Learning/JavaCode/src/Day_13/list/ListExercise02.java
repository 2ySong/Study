package Day_13.list;

import java.util.ArrayList;
import java.util.List;

import static Day_13.list.Book.sortPrice;

/**
 * @Author: Song-zy
 * @Date: 2021/10/23 11:09
 * @Description:
 */
@SuppressWarnings("all")
public class ListExercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("红楼梦", 128, "曹雪芹"));
        list.add(new Book("西游记", 111, "吴承恩"));
        list.add(new Book("水浒传", 206, "施耐庵"));
        list.add(new Book("三国志", 306, "罗贯中"));
        sortPrice(list);//按价格排序
        for (Object o : list) {
            System.out.println(o);
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

    //按照价格从低到高进行排序
    public static void sortPrice(List list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                //取出对象
                Book book1 = (Book) list.get(j);//向下转型
                Book book2 = (Book) list.get(j + 1);//向下转型
                if (book1.price > book2.price) {
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "书名: " + name + "\t\t价格: " + price + "￥\t\t作者: " + author;
    }
}