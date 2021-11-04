package Day_09.interface_;

/**
 * @Author: Song-zy
 * @Date: 2021/10/3 15:55
 * @Description:
 */
public class Computer {
    public void work(UsbInterface usbInterface){
        usbInterface.start();
        usbInterface.end();
    }
}
