# Java编程基础--第三阶段

## Day-19 网络



Socket
PTCP综程
UDP编程

### 0087 网络相关概念

- 网络通信

  - 概念：两台设备之间通过网络实现数据传输

  - 网络通信：将数据通过网络从一台设备==传输==到另一台设备

  - `java.net`包下提供了一系列的类或接口，供程序员使用，完成网络通信

     <img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111091929047.png" alt="image-20211109175346986" style="zoom:39%;" />

- 网络
  - 概念：两台或多台设备通过一定物理设备连接起来构成了网络
  - 根据网络的覆盖范围不同，对网络进行分类：
    - 局域网：覆盖范围最小，仅仅覆盖一个教室或一个机房
    - 城域网：覆盖范围较大，可以覆盖一个城市
    - 广域网：覆盖范围最大，可以覆盖全国，甚至全球，万维网是广域网的代表

- IP地址

  1. 概念：用于唯一标识网络中的每台计算机
  2. 查看ip地址：ipconfic
  3. ip地址的表示形式：点分十进制；XX.XX.XX.XX
  4. 每一个十进制数的范围：0~255
  5. ip地址的组成=网络地址+主机地址，比如：192.168.16.69
  6. iIPV6是互联网工程任务组设计的用于替代IPV4的下一代IP协议，其地址数量号称可
  7. 为全世界的每一粒沙子编上一个地址[11
  8. 由于IPV4最大的问题在于网络地址资源有限，严重制约了互联网的应用和发展。
  9. IPV6的使用，不仅能解决网络地址资源数量的问题，而且也解决了多种接入设备连入互联的障碍

- 域名

  1. www.baidu.com
  2. 好处：为了方便记忆，解决记ip的困难
  3. 概念：将ip地址映射成域名，这里怎么映射上，HTTP协议

- 端口号

  1. 概念：用于标识计算机上某个特定的网络程序
  2. 表示形式：以整数形式，范围0~65535
  3. **0~1024已经被占用**，比如ssh22，ftp21，smtp25，http80
  4. 常见的网络程序端口号
     - tomcat：8080
     - mysql:3306
     - oracle:1521
     - sqlserver:1433

- 网络通信协议

  - 协议（tcp/ip）

  - TCP/IP（Transmission  Control Protocol /Internet Protocol的简写

  - 中文译名为传输控制协议/因特网互联协议，又叫网络通讯协议，这个协议是Internet最基本的协议、Internet国际互联网络的基础，简单地说，就是由网络层的IP协议和传输层的TCP协议组成。

    ![image-20211109192854748](https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111091929048.png)

- TCP和UDP
  - **TCP协议：传输控制协议**
    1. 使用TCP协议前，须先建立TCP连接，形成传输数据通道
    2. 传输前，采用“==三次握手==“方式，是**可靠的**
    3. TCP协议进行通信的两个应用进程：客户端、服务端
    4. 在连接中可进行**大数据量**的传输.
    5. ==传输完毕，需释放已建立的连接，效率低==
  - **UDP协议：用户数据协议**
    1. 将数据、源、自的封装成数据包，不需要建立连接
    2. 每个数据报的大小限制在64K内，**不适合传输大量数据**
    3. 因无需连接，故是**不可靠**的
    4. 发送数据结束时无需释放资源（因为不是面向连接的），速度快
    5. 举例：厕所通知，发短信。

---

### 0088 InetAddress类

类关系图



**相关方法**

1. 获取本机lnetAddress对象：getLocalHost

2. 根据指定主机名/域名获取ip地址对象：getByName

3. 根据域名获取InetAddress对象的主机名：getHostName

4. 根据对象，获取InetAddress对象的地址：getHostAddress

   ```java
   //1. 获取本机InetAddress对象：getLocalHost
   InetAddress localHost = InetAddress.getLocalHost();
   System.out.println(localHost);//LAPTOP-CVJ93VPB/192.168.137.1
   //2. 根据指定主机名/域名获取ip地址对象：getByName
   System.out.println(InetAddress.getByName("LAPTOP-CVJ93VPB"));//LAPTOP-CVJ93VPB/192.168.137.1
   //3. 根据域名，获取InetAddress对象的主机名：getHostName
   System.out.println(InetAddress.getByName("www.baidu.com"));//www.baidu.com/182.61.200.7
   //4. 获取InetAddress对象的地址：getHostAddress
   System.out.println(localHost.getHostAddress());//192.168.137.1
   ```

### 0089 Socket

**基本介绍**

1. 套接字（Socket开发网络应用程序被广泛采用，以至于成为事实上的标准
2. 通信的两端都要有Socket，是两台机器间通信的端点
3. 网络通信其实就是Socket间的通信
4. Socket允许程序把网络连接当成一个流，数据在两个Socket通过IO传输。
5. 一般主动发起通信的应用程序属客户端，等待通信请求的为服务端

**TCP网络通信编程**

1. 案例：使用字节流

   [SocketTCP01Server.java](https://github.com/Zhy-Song/Study/blob/main/Java%20Learning/JavaCode2/src/day_19/socket/SocketTCP01Server.java),   [SocketTCPO1Client.java](https://github.com/Zhy-Song/Study/blob/main/Java%20Learning/JavaCode2/src/day_19/socket/SocketTCPO1Client.java)

   - 编写一个服务器端，和一个客户端
   - 先运行服务端，再运行客户端
   - 服务器端在9999端口监听
   - 客户端连接到服务器端，发送“hello，server”，然后退出
   - 服务器端接收到客户端发送的信息，输出，并退出

2. 使用字符流SocketTCP02Server.java, SocketTCP02Client.java
