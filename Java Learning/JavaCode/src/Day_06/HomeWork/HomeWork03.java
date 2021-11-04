package Day_06.HomeWork;

/**
 * 编写类Book,定义方法 updatePrice,实现更改某本书的价格,HomeWork03.java
 * - 具体:如果价格>150则更改为150,
 * - 如果价格<100,更改为100,否则不变
 */
public class HomeWork03 {
    public static void main(String[] args) {
        Book book1 = new Book("笑傲江湖",200);
        book1.show();
        System.out.print("更新后：");
        book1.updatePrice();book1.show();
        Book book2 = new Book("天龙八部",29);
        book2.show();
        System.out.print("更新后：");
        book2.updatePrice();book2.show();
//        int newPrice01 = a.updatePrice(180);
//        System.out.println("原价180，现价"+newPrice01);
//        int newPrice02 = a.updatePrice(140);
//        System.out.println("原价140，现价"+newPrice02);
//        int newPrice03 = a.updatePrice(50);
//        System.out.println("原价50，现价"+newPrice03);
    }
}
class Book{
    String name;
    int price;
    public Book(String name, int price){
        this.name = name;
        this.price = price;
    }
    public void updatePrice(){
        if(price>150){
            price = 150;
        }else if(price <100){
            price = 100;
        }
    }
    //显示书籍信息
    public void show(){
        System.out.println(name + "的价格是"+price);
    }
}
