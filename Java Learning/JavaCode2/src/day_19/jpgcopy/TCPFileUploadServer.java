package day_19.jpgcopy;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: Song-zy
 * @Date: 2021/11/10 14:19
 * @Description: 文件上传的服务端
 */
public class TCPFileUploadServer {
    public static void main(String[] args) throws Exception {
        //1.服务端在本机监听8888端口
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端在8888端口监听，等待连接...");
        //等待连接
        Socket socket = serverSocket.accept();
        //通过Socket得到输入流
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);//将图片转成字节数组
        //将得到数组写入到指定的路径保存
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/day_19/head_copy.jpg"));
        bos.write(bytes);
        //
        bos.close();


        socket.shutdownInput();
        //向客户端反馈信息
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("收到图片");
        bw.newLine();
        bw.flush();
        socket.shutdownOutput();//写入结束标记
        //
        bw.close();
        bis.close();
        socket.close();
        serverSocket.close();
    }
}
