package day_19.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @Author: Song-zy
 * @Date: 2021/11/9 20:05
 * @Description: 客户端
 */
public class SocketTCPO1Client {
    public static void main(String[] args) throws IOException {
        //1。连接服务端（ip，端口）
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 socket="+socket.getClass());
        //2. 连接上后，生成Socket，通过socket.getOutputStream()
        OutputStream os = socket.getOutputStream();
        os.write("hello,server".getBytes(StandardCharsets.UTF_8));
        os.close();
        socket.close();
        System.out.println("客户端退出");
        //
        //3。通过输出流，写入数据到数据通道

    }
}
