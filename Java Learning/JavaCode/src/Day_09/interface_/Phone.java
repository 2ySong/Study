package Day_09.interface_;

/**
 * @Author: Song-zy
 * @Date: 2021/10/3 15:49
 * @Description:
 */
public class Phone implements UsbInterface {

    @Override
    public void start() {
        System.out.println("手机开始工作……");
    }
    public void end() {
        System.out.println("手机结束工作……");
    }
}
