package Day_09.interface_;

/**
 * @Author: Song-zy
 * @Date: 2021/10/3 15:51
 * @Description:
 */
public interface UsbInterface {
    public void start();
    public void end();
    public static void job(){
        System.out.println("接口中的静态方法");
    }

    default public void say(){
        System.out.println("szy......");
    }
}
