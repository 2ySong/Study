package Day_13.set;

/**
 * @Author: Song-zy
 * @Date: 2021/10/23 22:16
 * @Description: 模拟HashMap底层
 */
public class HashSetStructure {
    @SuppressWarnings("all")
    public static void main(String[] args) {

        //1. 创建一个数组: 称作表
        Node[] table = new Node[16];
        System.out.println("table=" + table);

        Node john = new Node("John", null);
        table[2] = john;
        Node jack = new Node("Jack", null);
        john.next = jack;
        Node rose = new Node("Rose", null);
        jack.next = rose;
        //
        Node szy = new Node("Szy", null);
        table[3] = szy;
        Node wqq = new Node("Wqq", null);
        szy.next = wqq;
        Node hsp = new Node("Hsp", null);
        wqq.next = hsp;
        System.out.println(table);
        for (int i = 0; i < table.length ; i++) {
            if(table[i] != null)
                System.out.println(table[i]);
        }
    }
}

class Node {
    Object item;
    Node next;

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "item=" + item +
                ", next=" + next +
                '}';
    }
}