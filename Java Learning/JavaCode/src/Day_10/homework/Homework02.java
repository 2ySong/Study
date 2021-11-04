package Day_10.homework;

/**
 * @Author: Song-zy
 * @Date: 2021/10/4 20:00
 * @Description:
 */
public class Homework02 {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());//100100
        System.out.println(Frock.getNextNum());//100200
        System.out.println(new Frock().getSerialNumber());//100300
        System.out.println(new Frock().getSerialNumber());//100400
        System.out.println(new Frock().getSerialNumber());//100500
    }
}
class Frock {
    private static int currentNum = 100000;//作为衣服出厂的序列号的起始值
    private int serialNumber;//序列号

    public Frock() {
        this.serialNumber = getNextNum();
    }

    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

}