package Day_10.homework;

/**
 * @Author: Song-zy
 * @Date: 2021/10/5 1:47
 * @Description:
 */
public class Homework07 {
    public static void main(String[] args) {
        Car01 c1 = new Car01(50);
        c1.getAir().flow();
        Car01 c2 = new Car01(-50);
        c2.getAir().flow();
        Car01 c3 = new Car01(20);
        c3.getAir().flow();
    }
}
class Car01 {
    private double temperature;

    public Car01(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    //成员内部类--空调
    class Air {
        public void flow(){
            if(temperature>40){
                System.out.println("温度超过40℃，吹冷风...");
            }else if(temperature<0){
                System.out.println("温度低于0℃，吹热风...");
            }else{
                System.out.println("车内温度适宜(0~40), 关闭空调...");
            }
        }
    }
    //返回一个Air类
    public Air getAir() {
        return new Air();
    }

}