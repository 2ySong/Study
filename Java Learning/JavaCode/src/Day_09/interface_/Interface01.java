package Day_09.interface_;

/**
 * @Author: Song-zy
 * @Date: 2021/10/3 15:47
 * @Description:
 */
public class Interface01 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Computer computer = new Computer();
        computer.work(phone);//将手机接入到电脑
        Camera camera = new Camera();
        computer.work(camera);//将相机接入到电脑
    }
}
