package day_19.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @Author: Song-zy
 * @Date: 2021/11/9 20:48
 * @Description:
 */
public class SocketTCP02Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 socket=" + socket.getClass());

        OutputStream os = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        bw.write("hello,server");
        bw.newLine();//内容输出结束。要求对方使用readLine
        //必须刷新
        bw.flush();
        socket.shutdownOutput();
        //
        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = "";
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        bw.flush();
        //
        bw.close();
//        is.close();
        br.close();
        socket.close();
        System.out.println("服务端退出");
    }
}
