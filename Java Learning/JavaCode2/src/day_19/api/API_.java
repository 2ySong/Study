package day_19.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author: Song-zy
 * @Date: 2021/11/9 19:39
 * @Description:
 */
public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        //1. 获取本机InetAddress对象：getLocalHost
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//LAPTOP-CVJ93VPB/192.168.137.1
        //2. 根据指定主机名/域名获取ip地址对象：getByName
        System.out.println(InetAddress.getByName("LAPTOP-CVJ93VPB"));//LAPTOP-CVJ93VPB/192.168.137.1
        //3. 根据域名，获取InetAddress对象的主机名：getHostName
        System.out.println(InetAddress.getByName("www.baidu.com"));//www.baidu.com/182.61.200.7
        //4. 获取InetAddress对象的地址：getHostAddress
        System.out.println(localHost.getHostAddress());//192.168.137.1
    }
}
