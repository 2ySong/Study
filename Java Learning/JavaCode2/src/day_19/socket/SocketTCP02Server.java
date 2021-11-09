package day_19.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: Song-zy
 * @Date: 2021/11/9 20:48
 * @Description:
 */
public class SocketTCP02Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        System.out.println("服务端 socket="+socket.getClass());
        //
        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line = "";
        while ((line = br.readLine()) != null){
            System.out.println(line);
        }
        socket.shutdownInput();
        //
        OutputStream os = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        bw.write("hello,client");
        bw.newLine();
        //
        bw.close();
//        is.close();
        br.close();
        socket.close();
        System.out.println("服务端退出");
    }
}
