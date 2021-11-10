package day_19.jpgcopy;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Author: Song-zy
 * @Date: 2021/11/10 14:19
 * @Description: 文件上传客户端
 */
public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception {
        //客户端连接服务端8888,得到 Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        //创建读取磁盘文件的输入流
        String filePath = "src/day_19/head.jpg";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
        //文件内容bytes
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes, 0, bytes.length);//写入数据通道
        bis.close();//关闭输入流
        socket.shutdownOutput();//写入(输出)结束标记
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = "";
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();

        //
        bos.close();
        socket.close();

    }
}
