package Day_10.homework;

/**
 * @Author: Song-zy
 * @Date: 2021/10/4 21:18
 * @Description:
 */
public class Homework06 {
    public static void main(String[] args) {
        Person p = new Person("唐僧",new Horse());
        p.bigRiver();
        p.common();
        p.FireMountain();
    }
}
//交通工具接口
interface Vehicles {
    void work();
}

//类
class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("正常情况，马儿是你的交通工具");
    }
}
class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("前面有大河，请坐船……");
    }
}

class Cloud implements Vehicles {
    @Override
    public void work() {
        System.out.println("前面是火焰山，请坐筋斗云过去");
    }
}
//交通工具工厂类
class Vehicle {
    //只有一匹马
    private static Horse horse = new Horse();//饿汉式

    private Vehicle() {
    }

    public static Horse getHorse() {
        return horse;
    }
    //不同的船
    public static Boat getBoat() {
        return new Boat();
    }
    private static Cloud cloud = new Cloud();

    public static Cloud getCloud() {
        return cloud;
    }
}

class Person {
    private String name;
    private Vehicles vehicles;//交通情况

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    //前面是大河--乘船
    public void bigRiver(){
        if(!(vehicles instanceof Boat)){
            vehicles = Vehicle.getBoat();
        }
        vehicles.work();
    }
    //正常情况--骑马
    public void common(){
        if(!(vehicles instanceof Horse)){
            vehicles = Vehicle.getHorse();
        }
        vehicles.work();
    }
    //火焰山--坐筋斗云
    public void FireMountain(){
        if(!(vehicles instanceof Cloud)){
            vehicles = Vehicle.getCloud();
        }
        vehicles.work();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}