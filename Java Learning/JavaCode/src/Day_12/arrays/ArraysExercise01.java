package Day_12.arrays;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: Song-zy
 * @Date: 2021/10/19 14:37
 * @Description:
 */
public class ArraysExercise01 {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("红楼梦~", 100);
        books[1] = new Book("金瓶梅~", 90);
        books[2] = new Book("青年文摘~", 5);
        books[3] = new Book("java从入门到放弃~", 300);
        books[4] = new Book("c语言",78);
        System.out.println("按书籍价格从大到小排序");
        Book.f1(books);
        for (int i = 0; i < books.length; i++) {
            System.out.println((i+1)+" ,"+books[i]);
        }

        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object b1, Object b2) {
                Book book1 = (Book) b1;
                Book book2 = (Book) b2;
                double x = book1.getPrice() - book2.getPrice();
                if (x > 0){
                    return 1;
                }else if(x <0){
                    return -1;
                }else{
                    return 0;
                }
            }
        });

        System.out.println("按书籍价格从小到大排序");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i+1)+" ,"+books[i]);
        }

        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object b1, Object b2) {
                Book book1 = (Book) b1;
                Book book2 = (Book) b2;
                return book1.getName().length() - book2.getName().length();
            }
        });

        System.out.println("按书籍名称长度从小到大排序");
        for (int i = 0; i < books.length; i++) {
            System.out.println((i+1)+" ,"+books[i]);
        }


    }
}

class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /**对书籍数组按照书记价格排序(大-->小)。**/
    public static Book[] f1(Book[] books) {
        Book temp = null;
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - 1 - i; j++) {
                if (books[j].price < books[j + 1].price) {
                    temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
        return books;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}