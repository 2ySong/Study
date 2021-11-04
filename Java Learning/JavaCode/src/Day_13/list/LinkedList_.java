package Day_13.list;


/**
 * @Author: Song-zy
 * @Date: 2021/10/23 18:53
 * @Description: 模拟双向链表
 */
public class LinkedList_ {
    @SuppressWarnings("all")
    public static void main(String[] args) {
//        LinkedList linkedList = new LinkedList();

        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node smith = new Node("smith");

        //将每个对象连接起来
        //jack->tom->smith
        jack.next = tom;
        tom.next = smith;
        //jack<-tom<-smith
        smith.prev = tom;
        tom.prev = jack;

        //确定头结点
        Node first = jack;
        //尾结点
        Node last = smith;

        //遍历: 从头到尾
        while (true) {
            if (first == null) {
                break;
            }
            //输出first信息
            System.out.println(first);
            first = first.next;
        }
        System.out.println("=====");
        //遍历：从尾到头
        while (true) {
            if (last == null) {
                break;
            }
            //输出last信息
            System.out.println(last);
            last = last.prev;
        }

        //添加元素szy,添加到jack的后面;tom的前面
        Node szy = new Node("szy");
        //jack->szy->tom->smith
        jack.next = szy;
        szy.next = tom;
        //jack<-szy<-tom<-smith
        szy.prev = jack;
        tom.prev = szy;
        System.out.println("添加szy到jack的后，遍历");
        //再次指向头结点
        first = jack;
        while (true) {
            if (first == null) {
                break;
            }
            //输出first信息
            System.out.println(first);
            first = first.next;
        }
    }

}

//定义一个Node类，Node对象表示双向链表的一个节点
class Node {
    public Object item;//真正存放数据
    public Node next;//指向后一个结点
    public Node prev;//指向前一个结点

    public Node(Object item) {
        this.item = item;
    }


    @Override
    public String toString() {
        return "Node{" +
                "name = " + item +
                '}';
    }
}