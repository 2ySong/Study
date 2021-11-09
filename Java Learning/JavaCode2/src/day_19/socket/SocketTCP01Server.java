package day_19.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @Author: Song-zy
 * @Date: 2021/11/9 20:05
 * @Description: 服务
 */
public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        //思路
        //1. 在本机的9999端口监听，等待连接
        ServerSocket ss = new ServerSocket(9999);//要求本机其他服务占用9999端口
        //2. 当没有客户端连接9999端口时，程序会阻塞，等待连接
        //如果有客户端连接，则会返回Socket对象
        Socket socket = ss.accept();
        System.out.println("服务端 socket=" + socket.getClass());
        //3. 通过socket.getInputStreamC）
        InputStream is = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        System.out.print("接收到客户端发送的信息：");
        while ((readLen = is.read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));
        }
        //结束接受
        socket.shutdownInput();
        OutputStream os = socket.getOutputStream();
        os.write("hello,clint".getBytes(StandardCharsets.UTF_8));
        is.close();
        os.close();
        ss.close();
        socket.close();
        System.out.println("服务端关闭");
        //客户端写入到数据通道的数据，显示

    }
}
