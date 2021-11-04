package Day_09.interface_;

/**
 * @Author: Song-zy
 * @Date: 2021/10/3 16:04
 * @Description:
 */
public class Camera implements UsbInterface {

    @Override
    public void start() {
        System.out.println("相机开始工作……");
    }
    public void end() {
        System.out.println("相机结束工作……");
    }
}
