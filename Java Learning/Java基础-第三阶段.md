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

2. 使用字符流[SocketTCP02Server.java](https://github.com/Zhy-Song/Study/blob/main/Java%20Learning/JavaCode2/src/day_19/socket/SocketTCP02Server.java), [SocketTCP02Client.java](https://github.com/Zhy-Song/Study/blob/main/Java%20Learning/JavaCode2/src/day_19/socket/SocketTCP02Client.java)

3. 应用案例4，TCPFileCopy.java

   [TCPFileUploadServer.java](https://github.com/Zhy-Song/Study/blob/main/Java%20Learning/JavaCode2/src/day_19/jpgcopy/TCPFileUploadServer.java)   [TCPFileUploadClient.java](https://github.com/Zhy-Song/Study/blob/main/Java%20Learning/JavaCode2/src/day_19/jpgcopy/TCPFileUploadClient.java)
   
   - 编写一个服务端，和一个客户端
   - 服务器端在8888端口监听
   - 客户端连接到服务端，发送一张**图片**
   - 服务器端接收到客户端发送的图片，保存到src下，发送“收到图片”再退出
   - 客户端接收到服务端发送的“收到图片”，再退出
   - 该程序要求使用[StreamUtils.iava](https://github.com/Zhy-Song/Study/blob/main/Java%20Learning/JavaCode2/src/day_19/jpgcopy/StreamUtils.java)

**netstat指令**

1. `netstat -an`可以查看当前主机网络情况，包括端口监听情况和网络连接情况。
2. `netstat -an | more`可以分页显示
3. 要求在dos控制台下执行

**UDP网络通信编程[了解]**

- 基本介绍
  1. 类DatagramSocket和DatagramPacket[数据包/数据报]实现了基于UDP协议网络程序
  2. UDP数据报通过数据报套接字DatagramSocket发送和接收，系统不保证UDP数据报一定能够安全送到目的地，也不能确定什么时候可以抵达
  3. DatagramPacket对象封装了UDP数据报，在数据报中包含了发送端的IP地址和端口号以及接收端的IP地址和端口号。
  4. UDP协议中每个数据报都给出了完整的地址信息，因此无须建立发送方和接收方的连接

注意：UDP没有明确的服务端和客户端，演变成数据的发送端和接收端。

- 基本流程
  1. 核心的两个类/对象DatagramSocket与DatagramPacket
  2. 建立发送端，接收端（没有服务端和客户端概念
  3. 发送数据前，建立数据包/报 DatagramPacket对象
  4. 调用DatagramSocket的发送、接收方法
  5. 关闭DatagramSocket

0678~0729暂时不听。直接学数据库，以后再听

---

## Day-22 数据库

### 0100 mysql

数据库连接

<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111141101588.png" alt="image-20211113000602042" style="zoom:67%;" />

### 0101 Navicat、SQLyog两款软件。

### 0102 数据库三层结构

基本介绍

1. 所谓安装Mysql数据库，就是在主机安装一个数据库管理系统（DBMS，这个管理程序可以管理多个数据库。DBMS（database manage system）
2. 一个数据库中可以创建多个表，以保存数据（信息）
3. 数据库管理系统（DBMS）、数据库和表的关系如图所示：

数据库-表，本质上是文件

**SOL语句分类**

- DDL：数据定义语句
  [create表，库...
  [增加
- update，删除deletel
  DML：数据操作语句
- insert，修改
  DOL：数据查询语句
- select
  DCL：数据控制语句[管理数据库：比如用户权限
  revoke
  grant

### 0103 数据库操作

#### 1 创建数据库

- **语法规则**：

  <img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111141101591.png" alt="image-20211113095152636" style="zoom:50%;" />

- CHARACTER SET：指定数据库采用的字符集，如果不指定字符集，默认utf8
- COLLATE：指定数据库字符集的校对规则（常用的 ut8_bin[区分大小写]、utf8_general_ci[不区分大小写]注意默认是ut8_general_ci)[举例说明 database.sql文件]
- 注意：在创建数据库，表的时候，为了规避关键字，可以使用==反引号==解决。

#### 2 删除数据库

指令：`DROP DATABASES db1;`

#### 3 SQL语句

1. 查询：

   ```sql
   SELECT * FROM user WHERE NAME = 'tom';
   SELECT * FROM user;
   ```

2. 显示数据库

   ```sql
   SHOW DATABASES
   ```

3. 显示数据库创建的语句：

   ```sql
   SHOW CREATE DATABASE db_name
   ```

4. 数据库删除：

   ```sql
   DROP DATABASE [IF EXISTS] db_name
   ```

#### 4 备份数据库(命令行)

- 备份数据库(注意:在DOS执行)命令行

  **mysqldump -u 用户名 -p -B数据库1 数据库2 数据库n > 安装目录:\\\文件名.sql**

  ```sql
  mysqldump -u root -p -B db01 db02>e:\\bak.sql
  ```

- 恢复数据库注(意:进入 Mysql命令行再执行)--通过mysql -u root -p键入MySQL命令行。
  **Source 文件名.sql**

  ```sql
  Source e:\\bak.sql
  ```

- 备份数据库中的某些表：

  ```sql
  mysqldump -u root -p db01 t1 t2 tn >e:\\bak_t1.sql
  ```

  - 恢复

    ```sql
    use db_name;
    Source e:\\bak_t1.sql;
    ```

    

### 0104 表

#### 1 创建表

基本语法

 <img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111141101592.png" alt="image-20211113111217423" style="zoom:39%;" />

- 注意：在数据库中创建表时，要根据需保存的数据创建相应的列，并根据数据的类型定义相应的列类型(字段类型)。

  - 例如：user表

     <img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111141101593.png" alt="image-20211113111451428" style="zoom:35%;" />

  - 指令：

    ```sql
    CREATE TABLE t_1(
    	id INT PRIMARY KEY,
    	`name` VARCHAR(255),
        `pwd` VARCHAR(255),
        `birthday` DATE)
    ```

#### 2 删除表

```sql
DROP TABLE table_name ;
```

#### 3 修改表

**如何修改表**

1. 添加列

   - 语法

       ```sql
       ALTER TABLE table_name
       ADD		(column datatype [DEFAULT expr]
       	     [,CoLumn datatype]...);
   ```
   
   - 案例
   
     ```sql
     ALTER TABLE t_1 ADD (
     	image VARCHAR ( 12 ),
     sex VARCHAR ( 1 ));
   ```
   
2. 修改列

   - 语法

     ```sql
     ALTER TABLE table_name
     MODIFY	(column datatype [DEFAULT expr]
     		[,column datatype]...);
     ```

   - 更改列名：

     - 语法

       ```sql
       alter table table_name change column old_name new_name varchar(20);
       ```

3. 删除列

   - 语法

     ```sql
     ALTER TABLE table_name
     DROP column;
     查看表的结构:desc 表名;--可以查看表的列
     ```

   - 示例：

     ```sql
     ALTER TABLE t_1 
     DROP pwd;
     ```

4. 修改表名：Rename table 表名  to 新表名

   ```sql
   RENAME table t_1 to E_user;
   ```

5. 修改表字符集：alter table 表名 character set字符集

   ```sql
   alter table e_user character set utf8;
   ```

   

----

### 0105 Mysql常用数据类型(列类型)

MySQL 中定义数据字段的类型对你数据库的优化是非常重要的。

MySQL 支持多种类型，大致可以分为三类：数值、日期/时间和字符串(字符)类型。

------

#### 1 数值类型

> 说明，使用规范：在能够满足需求的情况下，尽量选择占用空间小的类型。默认使用int

- MySQL 支持所有标准 SQL 数值数据类型。
- 这些类型包括严格数值数据类型(INTEGER、SMALLINT、DECIMAL 和 NUMERIC)，以及近似数值数据类型(FLOAT、REAL 和 DOUBLE PRECISION)。
- 关键字INT是INTEGER的同义词，关键字DEC是DECIMAL的同义词。
- BIT数据类型保存位字段值，并且支持 MyISAM、MEMORY、InnoDB 和 BDB表。
- 作为 SQL 标准的扩展，MySQL 也支持整数类型 TINYINT、MEDIUMINT 和 BIGINT。下面的表显示了需要的每个整数类型的存储和范围。

|       类型       | 大小                                     | 范围（有符号）                                               | 范围（无符号）                                               | 用途            |
| :--------------: | :--------------------------------------- | :----------------------------------------------------------- | :----------------------------------------------------------- | :-------------- |
|     TINYINT      | 1 Bytes                                  | (-128，127)                                                  | (0，255)                                                     | 小整数值        |
|     SMALLINT     | 2 Bytes                                  | (-32 768，32 767)                                            | (0，65 535)                                                  | 大整数值        |
|    MEDIUMINT     | 3 Bytes                                  | (-8 388 608，8 388 607)                                      | (0，16 777 215)                                              | 大整数值        |
| ==INT==或INTEGER | 4 Bytes                                  | (-2 147 483 648，2 147 483 647)                              | (0，4 294 967 295)                                           | 大整数值        |
|      BIGINT      | 8 Bytes                                  | (-9,223,372,036,854,775,808，9 223 372 036 854 775 807)      | (0，18 446 744 073 709 551 615)                              | 极大整数值      |
|      FLOAT       | 4 Bytes                                  | (-3.402 823 466 E+38，-1.175 494 351 E-38)，0，(1.175 494 351 E-38，3.402 823 466 351 E+38) | 0，(1.175 494 351 E-38，3.402 823 466 E+38)                  | 单精度 浮点数值 |
|      DOUBLE      | 8 Bytes                                  | (-1.797 693 134 862 315 7 E+308，-2.225 073 858 507 201 4 E-308)，0，(2.225 073 858 507 201 4 E-308，1.797 693 134 862 315 7 E+308) | 0，(2.225 073 858 507 201 4 E-308，1.797 693 134 862 315 7 E+308) | 双精度 浮点数值 |
|     DECIMAL      | 对DECIMAL(M,D) ，如果M>D，为M+2否则为D+2 | 依赖于M和D的值                                               | 依赖于M和D的值                                               | 小数值          |

- 默认是有符号的，定义一个无符号的整数，只需要加关键字`unsigned`.

  <img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111141101594.png" alt="image-20211113181620300" style="zoom:35%;" />

------

#### 2 日期和时间类型

表示时间值的日期和时间类型为DATETIME、DATE、TIMESTAMP、TIME和YEAR。

每个时间类型有一个有效值范围和一个"零"值，当指定不合法的MySQL不能表示的值时使用"零"值。

TIMESTAMP类型有专有的自动更新特性，将在后面描述。

| 类型      | 大小 ( bytes) | 范围                                                         | 格式                | 用途                         |
| :-------- | :------------ | :----------------------------------------------------------- | :------------------ | :--------------------------- |
| DATE      | 3             | 1000-01-01/9999-12-31                                        | YYYY-MM-DD          | 日期值                       |
| TIME      | 3             | '-838:59:59'/'838:59:59'                                     | HH:MM:SS            | 时间值或持续时间             |
| YEAR      | 1             | 1901/2155                                                    | YYYY                | 年份值                       |
| DATETIME  | 8             | 1000-01-01 00:00:00/9999-12-31 23:59:59                      | YYYY-MM-DD HH:MM:SS | 混合日期和时间值             |
| TIMESTAMP | 4             | 1970-01-01 00:00:00/2038结束时间是第 **2147483647** 秒，北京时间 **2038-1-19 11:14:07**，格林尼治时间 2038年1月19日 凌晨 03:14:07；自动设置当更新为前时间加入:   NOT NULL DEFAULT CURRENT_TIMESTAMP<br/>ON UPDATE CURRENT_TIMESTAMP | YYYYMMDD HHMMSS     | 混合日期和时间值，==时间戳== |

------

#### 3 字符串类型

字符串类型指CHAR、VARCHAR、BINARY、VARBINARY、BLOB、TEXT、ENUM和SET。该节描述了这些类型如何工作以及如何在查询中使用这些类型。

| 类型       | 大小                  | 用途                            |
| :--------- | :-------------------- | :------------------------------ |
| CHAR       | 0-255 bytes           | ==定长==字符串                  |
| VARCHAR    | 0-65535 bytes         | ==变长==字符串                  |
| TINYBLOB   | 0-255 bytes           | 不超过 255 个字符的二进制字符串 |
| TINYTEXT   | 0-255 bytes           | 短文本字符串                    |
| BLOB       | 0-65 535 bytes        | 二进制形式的长文本数据          |
| TEXT       | 0-65 535 bytes        | 长文本数据                      |
| MEDIUMBLOB | 0-16 777 215 bytes    | 二进制形式的中等长度文本数据    |
| MEDIUMTEXT | 0-16 777 215 bytes    | 中等长度文本数据                |
| LONGBLOB   | 0-4 294 967 295 bytes | 二进制形式的极大文本数据        |
| LONGTEXT   | 0-4 294 967 295 bytes | 极大文本数据                    |

**注意**：char(n) 和 varchar(n) 中括号中 n 代表==字符的个数，并不代表字节个数==，比如 CHAR(30) 就可以存储 30 个字符。

CHAR 和 VARCHAR 类型类似，但它们保存和检索的方式不同。它们的最大长度和是否尾部空格被保留等方面也不同。在存储或检索过程中不进行大小写转换。

BINARY 和 VARBINARY 类似于 CHAR 和 VARCHAR，不同的是它们包含二进制字符串而不要非二进制字符串。也就是说，它们包含字节字符串而不是字符字符串。这说明它们没有字符集，并且排序和比较基于列值字节的数值值。

BLOB 是一个二进制大对象，可以容纳可变数量的数据。有 4 种 BLOB 类型：TINYBLOB、BLOB、MEDIUMBLOB 和 LONGBLOB。它们区别在于可容纳存储范围不同。

有 4 种 TEXT 类型：TINYTEXT、TEXT、MEDIUMTEXT 和 LONGTEXT。对应的这 4 种 BLOB 类型，可存储的最大长度不同，可根据实际情况选择。

- VARCHAR：可变长度字符串最大65532字节【utf8编码最大21844字符1-3个字节用于记录大小】

### 0104 CRUD

#### 1 Insert语句（添加数据）

基本语法：

```sql
INSERT INTO table_name ( field1, field2,...,fieldN )
                       VALUES
                       ( value1, value2,...valueN );
```

实例：

```sql
INSERT INTO t2 ( birthday, job_time )
VALUES
	( '2000-10-9', '2021-5-8 10:34:23' );
```

- 注意：
  1. 字符和日期型数据应包含在'单引号'中。
  2. 列可以插入空值，前提是该字段允许为空 insert into table value(null）
  3. insert into table_name(列名)
     values（），（），（）
  4. 如果是给表中的所有字段添加数据，可以不写前面的字段名称
  5. 默认值的使用，当不给某个字段值时，如果有默认值就会添加，否则报错。

#### 2 Update语句（更新数据）

语法：

```sql
UPDATE table_name SET field1=new-value1, field2=new-value2
[WHERE Clause]
```

- 注意：不带where，代表修改全部数据。

- ```sql
  UPDATE `goods`
  SET price = 3000,
      g_name='szy手机'
  WHERE id = 1;
  ```

- ```sql
  UPDATE `goods`
  SET price=price + 1000
  WHERE id = 1;
  ```

#### 3 Delete语句（删除数据）

基本语法

```sql
DELETE FROM table_name [WHERE Clause]
```

- 注意：不带where代表删除表中所有的数据。
- delete不能删除某一列的全部值。
- 只能删除表的记录，不能删除表。

#### 4 Select语句（查找数据）

语法

```sql
SELECT [DISTINCT] *|column_name,column_name
FROM table_name
[WHERE Clause]
[LIMIT N][ OFFSET M]
```

- Select指定查询哪些列的数据
- column指定列名
- *号代表查询所有列
- FROM指定查询哪张表
- DISTINCT可选，指显示结果时，是否==去掉重复数据==
- 你可以使用 LIMIT 属性来设定返回的记录数。
- 你可以通过OFFSET指定SELECT语句开始查询的数据偏移量。默认情况下偏移量为0。

案例：

```sql
SELECT*
FROM student;
SELECT name, english
FROM student;
SELECT DISTINCT english
FROM student;
#要查询的字段全都相同,才能去重
SELECT DISTINCT name, english
FROM student;
```

在where语句中常用的运算符

<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111141101595.png" alt="image-20211113215935012" style="zoom:50%;" />

案例

```sql
#
SELECT `name`, math
FROM student
WHERE math > 60
  AND id > 1;
#
SELECT `name`, english, chinese
FROM student
WHERE english > chinese;
#
SELECT *
FROM student
WHERE math + chinese + english > 200
  AND math < chinese
  AND name LIKE '张%';#张开头的人名
#
SELECT name, english
FROM student
WHERE english BETWEEN 60 AND 80;
#
SELECT name, math
FROM student
WHERE math IN (89, 90, 91);
```

- order by子句，对查询结果进行排序

  - order by指定排序的列，排序的列既可以是表中的列名，也可以是select语句后指定的列名。

  - Asc升序[默认]、Desc降序

  - ORDER BY子句应位于SELECT语句的结尾。

  - 案例

    ```sql
    SELECT name, english
    FROM student
    order by english DESC;
    ```

    - 对总分进行排序

      ```sql
      SELECT name, (chinese + math + english) AS total_sorce
      FROM student
      ORDER BY total_sorce DESC;
      ```

      输出结果<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111141101596.png" alt="image-20211113222445516" style="zoom:50%;" />

### 0105 函数

#### 1 统计函数-count

- count返回行的总数

  ```sql
  SELECT count(*)|count (列名) FROM table_name 
  [WHERE ...] 
  ```

  - count（列）：统计满足条件的某列有多少个，但是会排除为nu11的列

- 案例：

  ```sql
  # --统计共有多少个学生
  SELECT count(*)
  FROM student;
  #统计数学成绩大于90的学生个数
  SELECT count(*)
  FROM student
  WHERE math >= 90;
  ```

#### 2 合计函数

**sum**

- 注意：用于数值列

- 语法

  ```sql
  #统计所有学生的数学综合成绩
  SELECT SUM(math)
  FROM student;
  #各科
  SELECT SUM(math), SUM(chinese), SUM(english)
  FROM student;
  #统计语文平均分
  SELECT SUM(chinese) / count(*) AS avg_ch
  FROM student
  ```

**AVG-求平均值**

实例：

```sql
SELECT AVG(math), AVG(chinese), AVG(english)
FROM student;
```

<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111141101597.png" alt="image-20211113224706947" style="zoom:50%;" />

**max最大值，min最小值**

- 实例：

  ```sql
  SELECT MAX(math), MIN(english)
  FROM student;
  ```

#### 3 分组函数-GROUP BY

GROUP BY 语句根据一个或多个列对结果集进行分组。

在分组的列上我们可以使用 COUNT, SUM, AVG等函数。

GROUP BY 语法

```sql
SELECT column_name, function(column_name)
FROM table_name
WHERE column_name operator value
GROUP BY column_name;
```

实例：显示平均工资低于2000的部门号和它的平均工资,

```sql
SELECT AVG(sal) AS avg_sal, deptno
FROM emp
GROUP BY deptno
HAVING avg_sal < 2000;
```

- 注意：HAVING 和GROUP BY是一对好兄弟，通常配合使用

#### 4 字符串函数

| 函数                                  | 描述                                                         | 实例                                                         |
| :------------------------------------ | :----------------------------------------------------------- | :----------------------------------------------------------- |
| CHARSET(str)                          | 返回字串字符集                                               |                                                              |
| CHAR_LENGTH(s)                        | 返回字符串 s 的字符数                                        | 返回字符串 RUNOOB 的字符数`SELECT CHAR_LENGTH("RUNOOB") AS LengthOfString;` |
| CHARACTER_LENGTH(s)                   | 返回字符串 s 的字符数                                        | 返回字符串 RUNOOB 的字符数`SELECT CHARACTER_LENGTH("RUNOOB") AS LengthOfString;` |
| CONCAT(s1,s2...sn)                    | 字符串 s1,s2 等多个字符串合并为一个字符串                    | 合并多个字符串`SELECT CONCAT("SQL ", "Runoob ", "Gooogle ", "Facebook") AS ConcatenatedString;` |
| CONCAT_WS(x, s1,s2...sn)              | 同 CONCAT(s1,s2,...) 函数，但是每个字符串之间要加上 x，x 可以是分隔符 | 合并多个字符串，并添加分隔符：`SELECT CONCAT_WS("-", "SQL", "Tutorial", "is", "fun!")AS ConcatenatedString;` |
| FIELD(s,s1,s2...)                     | 返回第一个字符串 s 在字符串列表(s1,s2...)中的位置            | 返回字符串 c 在列表值中的位置：`SELECT FIELD("c", "a", "b", "c", "d", "e");` |
| FIND_IN_SET(s1,s2)                    | 返回在字符串s2中与s1匹配的字符串的位置                       | 返回字符串 c 在指定字符串中的位置：`SELECT FIND_IN_SET("c", "a,b,c,d,e");` |
| FORMAT(x,n)                           | 函数可以将数字 x 进行格式化 "#,###.##", 将 x 保留到小数点后 n 位，最后一位四舍五入。 | 格式化数字 "#,###.##" 形式：`SELECT FORMAT(250500.5634, 2);     -- 输出 250,500.56` |
| INSERT(s1,x,len,s2)                   | 字符串 s2 替换 s1 的 x 位置开始长度为 len 的字符串           | 从字符串第一个位置开始的 6 个字符替换为 runoob：`SELECT INSERT("google.com", 1, 6, "runoob");  -- 输出：runoob.com` |
| LOCATE(s1,s)                          | 从字符串 s 中获取 s1 的开始位置                              | 获取 b 在字符串 abc 中的位置：`SELECT LOCATE('st','myteststring');  -- 5`返回字符串 abc 中 b 的位置：`SELECT LOCATE('b', 'abc') -- 2` |
| LCASE(s)                              | 将字符串 s 的所有字母变成小写字母                            | 字符串 RUNOOB 转换为小写：`SELECT LCASE('RUNOOB') -- runoob` |
| LEFT(s,n)                             | 返回字符串 s 的前 n 个字符                                   | 返回字符串 runoob 中的前两个字符：`SELECT LEFT('runoob',2) -- ru` |
| LOWER(s)                              | 将字符串 s 的所有字母变成小写字母                            | 字符串 RUNOOB 转换为小写：`SELECT LOWER('RUNOOB') -- runoob` |
| LPAD(s1,len,s2)                       | 在字符串 s1 的开始处填充字符串 s2，使字符串长度达到 len      | 将字符串 xx 填充到 abc 字符串的开始处：`SELECT LPAD('abc',5,'xx') -- xxabc` |
| LTRIM(s)                              | 去掉字符串 s 开始处的空格                                    | 去掉字符串 RUNOOB开始处的空格：`SELECT LTRIM("    RUNOOB") AS LeftTrimmedString;-- RUNOOB` |
| MID(s,n,len)                          | 从字符串 s 的 n 位置截取长度为 len 的子字符串，同 SUBSTRING(s,n,len) | 从字符串 RUNOOB 中的第 2 个位置截取 3个 字符：`SELECT MID("RUNOOB", 2, 3) AS ExtractString; -- UNO` |
| POSITION(s1 IN s)                     | 从字符串 s 中获取 s1 的开始位置                              | 返回字符串 abc 中 b 的位置：`SELECT POSITION('b' in 'abc') -- 2` |
| REPEAT(s,n)                           | 将字符串 s 重复 n 次                                         | 将字符串 runoob 重复三次：`SELECT REPEAT('runoob',3) -- runoobrunoobrunoob` |
| REPLACE(s,s1,s2)                      | 将字符串 s2 替代字符串 s 中的字符串 s1                       | 将字符串 abc 中的字符 a 替换为字符 x：`SELECT REPLACE('abc','a','x') --xbc` |
| REVERSE(s)                            | 将字符串s的顺序反过来                                        | 将字符串 abc 的顺序反过来：`SELECT REVERSE('abc') -- cba`    |
| RIGHT(s,n)                            | 返回字符串 s 的后 n 个字符                                   | 返回字符串 runoob 的后两个字符：`SELECT RIGHT('runoob',2) -- ob` |
| RPAD(s1,len,s2)                       | 在字符串 s1 的结尾处添加字符串 s2，使字符串的长度达到 len    | 将字符串 xx 填充到 abc 字符串的结尾处：`SELECT RPAD('abc',5,'xx') -- abcxx` |
| RTRIM(s)                              | 去掉字符串 s 结尾处的空格                                    | 去掉字符串 RUNOOB 的末尾空格：`SELECT RTRIM("RUNOOB     ") AS RightTrimmedString;   -- RUNOOB` |
| SPACE(n)                              | 返回 n 个空格                                                | 返回 10 个空格：`SELECT SPACE(10);`                          |
| STRCMP(s1,s2)                         | 比较字符串 s1 和 s2，如果 s1 与 s2 相等返回 0 ，如果 s1>s2 返回 1，如果 s1<s2 返回 -1 | 比较字符串：`SELECT STRCMP("runoob", "runoob");  -- 0`       |
| SUBSTR(s, start, length)              | 从字符串 s 的 start 位置截取长度为 length 的子字符串         | 从字符串 RUNOOB 中的第 2 个位置截取 3个 字符：`SELECT SUBSTR("RUNOOB", 2, 3) AS ExtractString; -- UNO` |
| SUBSTRING(s, start, length)           | 从字符串 s 的 start 位置截取长度为 length 的子字符串         | 从字符串 RUNOOB 中的第 2 个位置截取 3个 字符：`SELECT SUBSTRING("RUNOOB", 2, 3) AS ExtractString; -- UNO` |
| SUBSTRING_INDEX(s, delimiter, number) | 返回从字符串 s 的第 number 个出现的分隔符 delimiter 之后的子串。 如果 number 是正数，返回第 number 个字符左边的字符串。 如果 number 是负数，返回第(number 的绝对值(从右边数))个字符右边的字符串。 | `SELECT SUBSTRING_INDEX('a*b','*',1) -- a SELECT SUBSTRING_INDEX('a*b','*',-1)  -- b SELECT SUBSTRING_INDEX(SUBSTRING_INDEX('a*b*c*d*e','*',3),'*',-1)  -- c` |
| TRIM(s)                               | 去掉字符串 s 开始和结尾处的空格                              | 去掉字符串 RUNOOB 的首尾空格：`SELECT TRIM('    RUNOOB    ') AS TrimmedString;` |
| UCASE(s)                              | 将字符串转换为大写                                           | 将字符串 runoob 转换为大写：`SELECT UCASE("runoob"); -- RUNOOB` |
| UPPER(s)                              | 将字符串转换为大写                                           | 将字符串 runoob 转换为大写：`SELECT UPPER("runoob"); -- RUNOOB` |

案例：

```sql
# 1. CHARSET(str),返回字串字符集
SELECT CHARSET(ename)
FROM EMP;
# 2. CONCAT(str1,str2,...),连接字符串
SELECT CONCAT(ename, 'job is ', job)
FROM emp;
# INSTR( string, substring)返回 substring在 string中出现的位置,没有返回0
SELECT INSTR('zbcde', 'bcd')
FROM DUAL;
# UCASE (str)转换成大写
SELECT UCASE('abcde');
# LCASE (str)转换成小写
SELECT LCASE('ABCDE');
# LEFT (str, length),从 str中的左边起取length个字符,右边同理
SELECT LEFT(ename, 2)
FROM emp;
#返回字符串字节长度
SELECT LENGTH(ename)
FROM emp;
#返回字符串的字符数
SELECT CHAR_LENGTH('宋章耀');
#替换将MANAGER替换成 经理
SELECT ename, REPLACE(job, 'MANAGER', '经理')
FROM emp;
#练习:以首字母大写的方式显示所有员工emp表的姓名；SUBSTRING是从索引1开始的
SELECT CONCAT(UCASE(LEFT(ename, 1)), LCASE(SUBSTRING(ename, 2)))
FROM emp;
```

---

#### 5 数学函数

![image-20211114110117916](https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111141101598.png)

#### 6 日期函数

<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111211416708.png" alt="image-20211114132320687" style="zoom: 33%;" />

案例：

 

```sql
SELECT CURRENT_DATE;#返回当前日期
SELECT CURRENT_TIME;#返回当前时间
SELECT CURRENT_TIMESTAMP;#时间戳，返回日期和时间
SELECT NOW();
#返回当前日期+时间
#创建表
CREATE TABLE news
(
    id        INT,
    `name`    VARCHAR(55),
    send_time TIMESTAMP
);
INSERT INTO news
VALUES (1, '北京新闻', NOW()),
       (2, '青岛新闻', now()),
       (3, '郑新闻', now());
INSERT INTO news
VALUES (4, '1北京新闻', NOW()),
       (5, '1青岛新闻', now()),
       (6, '1郑新闻', now());
SELECT*
FROM news;

SELECT id, name, DATE(send_time)
FROM news;#只显示日期
SELECT id, name, TIME(send_time)
FROM news;
#只显示时间
#请查询在3分钟内发布的新闻
SELECT *
FROM news
WHERE DATE_ADD(send_time, INTERVAL 3 MINUTE) >= now();
#两个日期差多少天
SELECT DATEDIFF('2021-11-5', '2021-11-2');
#3天;
#我活了多少天
SELECT DATEDIFF(DATE(NOW()), '2000-12-17');
#7637
#如果你能活80岁,求出你还能活多少天
SELECT DATEDIFF(DATE_ADD('2000-12-17', INTERVAL 80 YEAR), NOW());
SELECT YEAR(NOW());
SELECT MONTH(NOW());
SELECT HOUR(NOW());
#UNIX_TIMESTAMP(),返回1970-1-1到现在的秒数
SELECT UNIX_TIMESTAMP();
SELECT FROM_UNIXTIME(UNIX_TIMESTAMP(), '%Y/%m/%d %H:%i:%s');

```

---

#### 7 加密函数

![image-20211114141325484](https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111211416712.png)

- 案例

  ```java
  #查询用户
  SELECT USER();
  #查询当前数据库名
  SELECT DATABASE();
  #为字符串算出一个MD5 32的字符串,(用户密码)加密
  SELECT MD5('8784szy2810');#59950173de8f23738cbfaa3ae48868a0
  SELECT LENGTH(MD5('8784szy2810'));
  #32位
  #加密函数PASSWORD(str),mysql8.0已经删除该函数
  SELECT*
  FROM mysql.user;
  ```

#### 8 流程控制函数

<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111211416713.png" alt="image-20211117080807485" style="zoom:45%;" />

---

### 0106 表的查询

#### 1 查询增强--group by

1. 显示每种岗位的雇员总数、平均工资。

   ```mysql
   SELECT COUNT(*) AS num_emp , FORMAT(avg(sal), 2) AS avg_sal, job
   FROM emp
   GROUP BY job;
   ```

2. 显示庭员总数，以及获得补助的雇员数。

   ```mysql
   SELECT COUNT(*) AS num_emp, COUNT(comm)
   FROM emp;
   ```

   - 如果行(comm)为空，则count不会统计

3. 显示管理者的总人数

   ```mysql
   SELECT COUNT(*) AS MANAGER_num
   FROM emp
   WHERE job = 'MANAGER';
   ```

4. 薪水差额

   ```mysql
   SELECT MAX(sal)-MIN(sal)
   FROM emp
   ```

- 如果语句中同时出现GROP BY; HAVING ;ORDER BY ; LIMIT,一定要严格按照这个顺序执行，否则会报错。

#### 2 多表查询

注意：多表查询的条件不能少于表的个数，不然会出现笛卡尔积

实例：

1. 如何显示部门号为10的部门名、员工名和工资

   ```mysql
   SELECT ename,sal,dname,emp.deptno
   FROM emp,
        dept
   WHERE dept.deptno =emp.deptno AND dept.deptno=10;
   ```

   <img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111231547016.png" alt="image-20211123144358637" style="zoom:45%;" />

2. 显示各个员工的姓名、工资、及其工资级别；按照工资级别升序排列

   ```mysql
   SELECT ename,sal,grade
   FROM emp,salgrade
   WHERE sal BETWEEN losal AND hisal
   ORDER BY grade
   ```

3. 显示雇员名、雇员工资及其所在部门的名字，并按部门降序

   ```mysql
   SELECT ename,sal,dname
   FROM emp,dept
   WHERE emp.deptno=dept.deptno
   ORDER BY dept.deptno;
   ```

---

#### 3 自连接

自连接是指在同一张表的连接查询【将一张表看作两张表】

```mysql
SELECT e1.ename AS '职员',e2.ename AS '上级'
FROM emp e1,emp e2
WHERE e1.mgr = e2.empno
ORDER BY e1.empno
```

<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111231547018.png" alt="image-20211123153456008" style="zoom:40%;" />

#### 4 子查询

在SELECT语句中嵌套SELECT

**单行子查询：**

- 案列：如何显示和SMITH同一个部门的所有员工

```mysql
SELECT ename,deptno
FROM emp
WHERE deptno = (
    SELECT deptno
    FROM emp
    WHERE ename = 'SMITH')
```

<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111231547019.png" alt="image-20211123154702974" style="zoom:40%;" />

**多行子查询**：

课堂练习：如何查询和部门10的工作相同的雇员的名字、岗位、工资、部门号，但是不含10号部门自己的雇员，

```mysql
SELECT ename, job, sal, deptno
FROM emp
WHERE job IN (SELECT DISTINCT job
              FROM emp
              WHERE deptno = 10)
  AND deptno != 10;
```

<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111231919836.png" alt="image-20211123160054007" style="zoom:40%;" />

**子查询临时表**

将子查询的结果当作一张临时表

```mysql
SELECT goods_id, ecs_goods.cat_id, goods_name, shop_price
FROM (
         SELECT cat_id, MAX(shop_price) AS max_price
         FROM ecs_goods
         GROUP BY cat_id) temp,
     ecs_goods
WHERE ecs_goods.cat_id = temp.cat_id
  AND temp.max_price = ecs_goods.shop_price;
```

<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111231919838.png" alt="image-20211123163254988" style="zoom:45%;" />

**ALL和ANY**：

显示工资比部门30的所有员工的工资高的员工的姓名、工资和部门号.

```mysql
SELECT ename, sal, deptno
FROM emp
WHERE sal > ALL (SELECT sal
                 FROM emp
                 WHERE deptno = 30)
```

<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111231919839.png" alt="image-20211123164024735" style="zoom:50%;" />

显示工资比部门30的其中一个员工的工资高的员工的姓名、工资和部门号

```mysql
SELECT ename, sal, deptno
FROM emp
WHERE sal > ALL (SELECT sal
                 FROM emp
                 WHERE deptno = 30)
```

<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111231919840.png" alt="image-20211123164058257" style="zoom:50%;" />

- 案例：请查询和赵云数学，英语，语文。完全相同的学生

  ```mysql
  #方式1
  SELECT student.name, student.chinese, student.math, student.english
  FROM (
           SELECT chinese, math, english
           FROM student
           WHERE name = '赵云'
       ) zy,
       student
  WHERE student.chinese = zy.chinese
    AND student.math = zy.math
    AND student.english = zy.english;
  #方式2
  SELECT *
  FROM student
  WHERE (chinese, math, english) = (
      SELECT chinese, math, english
      FROM student
      WHERE name = '赵云'
  );
  ```

  

- 查询每个部门的信息（包括：部门名，编号，地址）和人员数量

  ```mysql
  SELECT dept.*, count_emp AS '部门人数'
  FROM dept,
       (SELECT COUNT(*) AS count_emp, deptno
        FROM emp
        GROUP BY deptno
       ) temp
  WHERE dept.deptno = temp.deptno
  ```

  <img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111240013853.png" alt="image-20211123202524599" style="zoom:50%;" />

#### 5 表的复制

从别的表复制内容到新的表

```mysql
CREATE TABLE my_t1
(
    id     INT,
    name   VARCHAR(32),
    sal    DOUBLE,
    job    VARCHAR(32),
    deptno INT
);

INSERT INTO my_t1
SELECT empno, ename, sal, job, deptno
FROM emp;
```

自我复制：

```mysql
INSERT INTO my_t1
SELECT*
	FROM my_t1;
```

创建相同结构(列相同)的表：

```mysql
CREATE TABLE my_t2 LIKE my_t1;
```

- 注意：只复制了列，没有复制内容。

#### 6 表的去重

```mysql
INSERT INTO news2
    (SELECT DISTINCT*
     FROM news);
```

#### 7 合并查询--UNION

该操作符用于取得两个结果集的并集。当使用该操作符时，不会取消重复行。

---

### 0107  外连接

左外连接

```mysql
#1. 使用左连接(显示所有人的成绩，如果没有成绩，也要显示该人的姓名和id，成绩显示为空)
SELECT stu.id, name, grade
FROM stu
         LEFT JOIN exam ON stu.id = exam.id
```

<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111240013857.png" alt="image-20211123232100605" style="zoom:46%;" />

右外连接：

 即：右边的表与左边的表没有匹配的记录，也会把右表的记录显示出来，左表匹配值为NULL

```mysql
#2. 使用右连接(显示所有人的成绩，如果没有名字匹配，显示为空)
SELECT stu.id, name, grade
FROM stu
         RIGHT JOIN exam ON stu.id = exam.id;
```

<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111240013858.png" alt="image-20211123232438285" style="zoom:50%;" />

练习：

```mysql
# 列出部门名称和这些部门的员工信息(名字和工作),同时列出出那些没有员工的部门名。
# 1. 左外连接
SELECT dname, ename, job
FROM dept
         LEFT JOIN emp ON emp.deptno = dept.deptno;
# 2. 右外连接
SELECT dname, ename, job
FROM emp
         RIGHT JOIN dept ON emp.deptno = dept.deptno
```

---

### 0108 Mysql约束

**基本介绍**：

- 约束用于确保数据库的数据满足特定的商业规则。

- 在mysqI中，约束包括: not null、unique, primary key, foreign key, 和check 五种。

#### 1 primary key**主键注意细节：**

1. 主键字段的值不能重复且非空
2. 一张表最多只能有一个主键，但是可以是复合主键：`primary key(id+name)`
3. 主键的指定方式有两种
   - 直接在字段名后指定：字段名 primary key
   - 在表定义最后写：primary key(列名);
4. 使用desc 表名，可以看到primary key的情况
5. 在实际开发中，每个表都会有一个主键。

#### 2 not null、unique

not null：

- 如果在列上定义了not null，那么当插入数据时，必须为该列提供值。

unique：

- 当定义了唯一约束后，该列值是不能重复的。
- 注意细节：
  - 如果没有定义not null，则unique字段可以有多个null
  - 一张表可以有多个unique字段。

#### 3 外键

用于定义主表和从表之间的关系：外键约束要定义在从表上，主表必须具有主键约束或是unique约束，当定义外键约束后，要求外键列数据必在主表的主键列存在或是为null 。

<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111240013859.png" alt="image-20211124000245459" style="zoom:50%;" />

#### 4 check

用于强制行数据必须满足的条件，假定在sal列上定义了 check约束并要求sal列值在1000\~2000之间如果不再1000~2000之间就会提示出错。

<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111240013860.png" alt="image-20211124000510097" style="zoom:50%;" />

注意：

```mysql
CREATE TABLE t1
(
    id   INT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    sex  VARCHAR(6)   NOT NULL CHECK (sex IN ('men', 'women')) DEFAULT 'men',
    sal  DOUBLE CHECK (sal BETWEEN 1000 AND 5000)
);
```

- 在mysq中实现 check的功能，一般是在程序中控制，或者通过触发器完成。

**练习：商店表的设计**

数据库：shop_db

<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111281724536.png" alt="image-20211128140555565" style="zoom:45%;" />

- 示例代码：

  ```mysql
  CREATE TABLE goods
  (
      good_id    INT PRIMARY KEY,
      good_name  VARCHAR(64) NOT NULL DEFAULT '未知商品',
      unit_price DOUBLE      NOT NULL DEFAULT 0
          CHECK ( unit_price BETWEEN 1.0 AND 9999.99 ),
      category   INT         NOT NULL DEFAULT 0,
      provider   VARCHAR(64) NOT NULL DEFAULT '未知供应商'
  );-- 商品表
  CREATE TABLE customer
  (
      customer_id INT PRIMARY KEY,
      NAME        VARCHAR(64) NOT NULL DEFAULT '未知客户',
      address     VARCHAR(64),
      email       VARCHAR(64) UNIQUE,
      sex         VARCHAR(5)  NOT NULL DEFAULT ('男')
          CHECK ( sex IN ('男', '女') ),
      card_id     VARCHAR(18) UNIQUE
  );-- 客户表
  CREATE TABLE purchase
  (
      order_id    INT PRIMARY KEY,
      customer_id INT NOT NULL DEFAULT 0,
      good_id     INT NOT NULL DEFAULT 0,
      nums        INT NOT NULL DEFAULT 1,
      FOREIGN KEY (customer_id) REFERENCES customer (customer_id),
      FOREIGN KEY (good_id) REFERENCES goods (good_id)
  );-- purchase购买表
  
  DESC goods;
  DESC customer;
  DESC purchase;
  ```

  

#### 5 自增长

自增长格式

```mysql
field_name INT PRIMARY KEY auto_increment
```

数据类型是整型就行。

![image-20211128145255693](https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111281724539.png)

**自增长使用细节**

- 一般来说自增长是和 primary key配合使用的

- 自增长也可以单独使用[但是需要配合一个 unique]

- 自增长修饰的字段为整数型的(虽然小数也可以但是非常非常少）

- 这样使用自增长默认从1开始，你也可以通过如下命令修改 

  ```mysql
  alter table table_name auto_increment = 新的开始值;
  ```

- 如果你添加数据时，给自增长字段(列)指定的有值，则以指定的值为准。

---

### 0109 Mysql索引

提升数据库性能：空间换时间

创建索引：`field`表示要创建的索引的字段，以后就根据这个字段查询，就会非常快。

```mysql
CREATE INDEX field_index ON table_name(field)
```

原理：

- 当没有索引时，每一次查询都会==全表扫描==
- 当建立索引后，会建立一个二叉树。

索引代价：

- 占用磁盘空间
- 对dml(update delete insert)语句的效率影响

**1 创建索引**

> 注意：如果一个字段是主键或者unique约束，那么它就是一个索引。

索引的类型

1. 主键索引，==主键自动的为主索引==（类型Primary key）
2. 唯一索引（UNIQUE）
3. 普通索引（INDEX）
4. 全文索引（FULLTEXT）：[适用于MyISAM]
   开发中考虑使用：全文搜索Solr和ElasticSearch（ES）



查询一个表的索引字段：`SHOW INDEXES FROM table_name`

创建索引的方式：

1. 方式一：

   ```mysql
   CREATE INDEX name_index ON stu (name);
   ```

2. 方式二：

   ```mysql
   ALTER TABLE stu
       ADD INDEX name_index (name)
   ```

   

**2 删除索引**：

删除普通索引。

```mysql
DROP INDEX name_index ON stu
```

删除自己创建的主键索引

```mysql
ALTER TABLE stu DROP PRIMARY KEY;
```

**3 修改索引**

1. 先删除
2. 重新创建索引

**4 查询索引**

```mysql
SHOW INDEXES FROM stu;
```

```mysql
SHOW KEYS FROM stu
```

**小结：哪些列上适合使用素引**

- 较频繁的作为查询条件字段应该创建索引

  ```mysql
  select * from emp where empno=1
  ```

- 唯一性大差的字段不适合单独创建索引，即使频繁作为查询条件

  ```mysql
  select * from emp where sex=男
  ```

- 更新非常频繁的字段不适合创建索引

  ```mysql
  select * from emp
  where logincount =1
  ```

- 不会出现在WHERE子句中字段不该创建索引.

---

### 0110 MySQL的事务

**什么是事务**

- 事务用于保证数据的一致性，==它由一组相关的dml语句组合==，该组的dml语句要么全部成功，要么全部失败。
- 如：转账就要用事务来处理，用以保证数据的一致性。

**事务和锁**

- 当执行事务操作时（dml语句），mysql会在表上加锁，防止其它用户改表的数据这对用户来讲是非常重要的

**数据库控制台事务的几个重要操作（基本操**

- start transaction--开始一个事务
- savepoint 保存点名--设置保存点
- rollback to 保存点名--回退事务
- rollback--回退全部事务
- commit--提交事务，所有的操作生效，不能回退

```mysql
CREATE TABLE IF NOT EXISTS t1
(
    id   INT,
    name VARCHAR(255)
);
DESC t1;
SELECT *
FROM t1;
START TRANSACTION; #开始事务
SAVEPOINT a; #设置保存点a
INSERT INTO t1
VALUES (1, '小明');
SAVEPOINT b; #设置保存点b
INSERT INTO t1
VALUES (1, '大黄'); #插入数据
COMMIT;
rollback to b; #回退到b
```

- **回退事务**：

  在介绍回退事务前，先介绍一下保存点（savepoint），保存点是事务中的点，用于取消部分事务

  当结束事务时（commit），会自动的删除该事务所定义的所有保存点。

  当执行回退事务时，通过指定保存点可以回退到指定的点。这里我们作图说明。

- 提交事务

  使用commit语句可以提交事务，当执行了commit语句子后会确认事务的变化、结束事务、删除保存点、释放锁，数据生效。

  当使用commit语句结束事务子后，其它会话将可以查看到事务变化后的新数据。

**事务细节：**

- 如果不开始事务，默认情况下，dml操作是自动提交的，不能回滚。
- 如果开始一个事务，你没有创建保存点，你可以执行rollback，默认就是回退到你事务开始的状态
- 你也可以在这个事务中（还没有提交时），创建多个保存点比如：savepoint aaa；执行dml，savepoint bbb；
- 你可以在事务没有提交前，选择回退到哪个保存点
- mysql的事务机制需要innodb的存储引擎还可以使用，myisam不好使
- 开始一个事务`start transaction`，`set autocommit=off`。

**事务的隔离级别**：

- 多个连接开启各自事务操作数据库中数据时，数据库系统要负责隔离操作，以保证各个连接在获取数据时的准确性。（通俗解释）
- 如果不考虑隔离性，可能会引发如下问题：脏读，不可重复读，幻读。
  - **脏读**（dirty read）：当一个事务读取另一个事务尚未提交的修改时，产生脏读。
  - **不可重复读**（nonrepeatable read）：同一查询在同一事务中多次进行，由于其他提交事务所做的修改或删除，每次返回不同的结果集，此时发生不可重复读。
  - **幻读**（phantom read）：同一查询在同一事务中多次进行，由于其他提交事务所做的插入操作，每次返回不同的结果集，此时发生幻读。

![image-20211128173928305](https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111281950925.png)

修改隔离级别：`SET SESSION TRANSACTION ISOLATION LEVEL` 

```mysql
SET SESSION TRANSACTION ISOLATION LEVEL READ UNCOMMITTED
```

查看当前隔离级别

```mysql
SELECT @@transaction_isolation
```

查看系统当前隔离级别

```mysql
SELECT @@global.transaction_isolation;
```

设置当前会话隔离级别

```mysql
SET SESSION TRANSACTION ISOLATION LEVEL READ UNCOMMITTED
```

查看系统前隔离级别

```mysql
SET GLOBAL TRANSACTION ISOLATION LEVEL READ UNCOMMITTED
```

---

**事务的acid特性**

1. 原子性(Atomicity）

   原子性是指事务是一个不可分割的工作单位，事务中的操作要么都发生，要么都不发生

2. 一致性（Consistency）

   事务必须使数据库从一个一致性状态变换到另外一个一致性状态

3. 隔离性（isolation）

   事务的隔离性是多个用户并发访问数据库时，数据库为每一个用户开启的事务，不能被基他事务的操作数据所干扰，多个并发事务之间要相互隔离。

4. 持久性（Durability）

   持久性是指一个事务一旦被提交，它对数据库中数据的改变就是永久性的。接下来即使数据库发生故障也不应该对其有任何影响

### 0111 mysql存储引擎

**基本介绍**

- MySQL的表类型由存储引擎（Storage Engines）决定，主要包括MyISAM、innoDB、Memory等。

- MySQL数据表主要支持六种类型，分别是：CSV、ARCHIVE，Memory、MRG，MYISAM、InnoBDB。

- 这六种又分为两类，一类是”事务安全型”（transaction-safe），InnoDB；其余都属于第二类，称为”“非事务安全型”（non-transaction-safe）[mysiam和memory]

- 查看所有的存储引擎：`SHOW ENGINES`

  <img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111281949387.png" alt="image-20211128185426612" style="zoom:36%;" />

如何选择存储引擎

---

### 0112 MySQL视图(view)

基本概念

- 视图是一个虚拟表，其内容由查询定义。同真实的表一样，视图包含列，==其数据来自对应的真实表==（基表）
- 视图和基表关系的示意图
- 通过视图可以修改基表的数据
- 基表的改变，视图也会随之改变

视图的基本使用：

1. create view 视图名 as select语句--创建

   ```mysql
   CREATE VIEW stu_view AS
   SELECT id, name
   FROM stu;
   ```

2. alter view 视图名 as select语句--修改

3. SHOW CREATE VIEW  视图名

4. drop view 视图名1,视图名2..

**视图最佳实践**

1. **安全**。一些数据表有着重要的信息。有些字段是保密的，不能让用户直接看到。这时就可以创建一个视图，在这张视图中只保留一部分字段。这样，用户就可以查询自己需要的字段，不能查看保密的字段。
2. **性能**。关系数据库的数据常常会分表存储，使用外键建立这些表的之间关系。这时数据库查询通常会用到连接（JOIN）。这样做不但麻烦，效率相对也比较低。如果建立一个视图，将相关的表和字段组合在一起，就可以避免使用JOIN查询数据。
3. **灵活**。如果系统中有一张旧的表，这张表由于设计 的问题，即将被废弃。然而，很多应用都是基于这张表，不易修改。这时就可以建立一张视图，视图中的数据直接映射到新建的表。这样，就可以少做很多改动，也达到了升级数据表的目的。

---

### 0113 MySQL用户管理

MySQL中的用户，都存储在系统数据库mysql中user表中

其中user表的重要字段说明：

1. host：允许登录的“位置”，localhost表示该用户只允许本机登录，也可以指定ip地址，比如：192.168.1.100
2. user：用户名；
3. authentication_string：密码，是通过mysql的password()函数加密之后的密码。

新建一个用户

```mysql
CREATE USER 'szy_wq'@localhost IDENTIFIED BY '000000'
```

删除用户

```mysql
DROP USER 'szy_wq'@localhost
```

修改自己的密码：

```mysql
SET PASSWORD = PASSWORD ('123456')
```

---

**给用户授权**：

基本语法：

- grant 权限列表 on `*.*` to '用户名'@'登陆位置'  【identified by '密码'】

说明：

1. 权限列表，多个权限用逗号分开

   grant select on ....

   grant select，delete，create on...

   grant all【privileges】on...//表示赋予该用户在该对象上的所有权限

2. 特别说明

   `*.*`：代表本系统中的所有数据库的所有对象（表，视图，存储过程）
   库.*：表示某个数据库中的所有数据对象（表，视图，存储过程等

3. identified by可以省略，也可以写出

   （1）如果用户存在，就是修改该用户的密码。

   （2）如果该用户不存在，就是创建该用户！

**回收权限：**

- 基本语法：revoke 权限列表 on 库.对象名 from 用户名"@“登录位置；

- 权限生数指令

  如果权限没有生效，可以执行下面命令刷新：FLUSH PRIVILEGES:

**注意事项：**

- 在创建用户的时候，如果不指定Host则为%，%表示表示所有IP都有连接权限

- create user xxx.你也可以这样指定create user 'xxx'@'192.168.1.%'，%表示XX用户在192.168.1.*的Ip可以登录mysql

- 在删除用户的时候，如果host不是%，需要明确指定'用户'@"host值"

---

## Day-23 JDBC和连接池

### 0114 JDBC

JDBC API是一系列的接口，它统一和规范了应用程序与数据库的连接、执行SQL语句，并到得到返回结果等各类操作，相关类和接口在java.sql与javax.sql包中

<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202112022059685.png" alt="image-20211128221829039" style="zoom:50%;" />

连接代码

```java 
package day_22.sql_demo;


import com.mysql.jdbc.Driver;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @Author: Song-zy
 * @Date: 2021/11/28 22:31
 * @Description:
 */
public class Jdbc01 {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/db01?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        1.注册驱动
        Class.forName(JDBC_DRIVER);
        //得到连接
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "8784szy2810");
        Connection connect = DriverManager.getConnection(DB_URL, properties);//获取连接
        String sql = "INSERT INTO stu VALUES (3,'tom')";
        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql);//执行sql受影响的行数，如果>0，成功
        System.out.println(rows > 0 ? "Database connection succeeded" : "Database connection failure");
        //关闭资源
        statement.close();
        connect.close();

    }
}

```

---

两种连接方式

```java
public class JdbcConn {
    String url = "jdbc:mysql://localhost:3306/db01?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

    //连接方式1
    @Test
    public void connect01() throws SQLException {
        Driver driver = new Driver();
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "8784szy2810");
        Connection conn = driver.connect(url, properties);
        System.out.println("方式1：" + conn);
    }

    //连接方式2
    @Test
    public void connect02() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");//可以不写，自动加载
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "8784szy2810");
        Connection conn = DriverManager.getConnection(url, properties);
        System.out.println("方式2：" + conn);
    }
}

```

- 在实际应用中，要关闭连接。

**最常用的方式**

实际开发中，常常把端口号、用户名、密码写到一个mysql.properties配置文件中，更方便管理，==记住value值不要加引号。==

```properties
url=jdbc:mysql://localhost:3306/db01?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC
user=root
password=8784szy2810
driver=com.mysql.cj.jdbc.Driver
```

java代码：

```java
    public void connect03() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/day_22/sql_demo/mysql.properties"));
        String url = properties.getProperty("url");
        String password = properties.getProperty("password");
        String user = properties.getProperty("user");
        String driver = properties.getProperty("driver");
        //
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println(conn);
    }
```

- Class.forName(driver);这句话可以不写，因为底层会自动调用。但是为了便于我们分析代码，尽量写上。

---

### 0115 ResultSet

```java
package day_22.sql_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @Author: Song-zy
 * @Date: 2021/12/2 20:26
 * @Description:
 */
public class ResultSet_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        //加載配置文件
        properties.load(new FileInputStream("src/day_22/sql_demo/mysql.properties"));
        String url = properties.getProperty("url");
        String password = properties.getProperty("password");
        String user = properties.getProperty("user");
        String driver = properties.getProperty("driver");
        //注冊驱动
        Class.forName(driver);
        //获取连接
        Connection conn = DriverManager.getConnection(url, user, password);
        //
        Statement statement = conn.createStatement();
        //sql语句
        String sql = "SELECT*FROM actor";
        //返回单个的ResultSet对象
        ResultSet resultSet = statement.executeQuery(sql);
        //循环取出每一行;resultSet.next(),当没有下一行时，会返回false
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            System.out.println(id + "\t" + name);
        }
        //关闭连接
        resultSet.close();
        statement.close();
        conn.close();
    }
}

```

上述代码返回结果：<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202112022059689.png" alt="image-20211202205833997" width=100 />

ResultSet底层：

<img src="C:/Users/szy/AppData/Roaming/Typora/typora-user-images/image-20211202210014699.png" alt="image-20211202210014699" width=500 />

---

### 0116 SQL注入

#### Statement

- **基本介绍**

  - Statement对象用于执行静态SQL语句并返回其生成的结果的对象

  - 在连接建立后，需要对数据库进行访问，执行命名或是SQL语句，可以通过：

    - Statement[存在SQL注入问题]，实际开发中不会用
    - Preparedstatement[预处理]
    - CallableStatement「存储过程]

  - ==Statement对象执行SQL语句，存在SQL注入风险.==

    ```SQL
    CREATE TABLE IF NOT EXISTS admin
    (
        user VARCHAR(12) PRIMARY KEY,
        pwd  VARCHAR(255) NOT NULL DEFAULT '123'
    );
    INSERT INTO admin
    VALUES ('szy', '1234');
    ```

    - 当我们输入用户名和密码为：`1' OR`     `OR '1'='1` 就会出现如下状况

      ```sql
      SELECT*
      FROM admin
      WHERE user = '1' OR 'AND pwd = ' OR '1' = '1';
      ```

      就可以直接判断正确。出现漏洞。非法登录，但是Preparedstatement不会出现该漏洞。

  - SQL注入是利用某些系统没有对用户输入的数据进行充分的检查，而在用户输入数据中注入非法的SQL语句段或命令，恶意攻击数据库。sqlinjection.sql

  - 要防范SQL注入，只要用`PreparedStatement`(从Statement扩展而来）取代Statement就可以了

#### PreparedStatement

1. PreparedStatement执行的SQL语句中的参数用问号`？`来表示，调用PreparedStatement对象的setXxx()方法来设置这些参数。setXxx()方法有两个参数，第一个参数是要设置的SQL语句中的参数的索引（从1开始），第二个是设置的SQL语句中的参数的值。

2. 调用executeQuery()，返回ResultSet对象

3. 调用executeUpdate()：执行更新，包括增、删、修改

   ```java
   String sql = "SELECT* FROM admin WHERE user =? AND pwd =?";
   PreparedStatement preparedStatement = conn.prepareStatement(sql);
   preparedStatement.setString(1, admin_user);
   preparedStatement.setString(2, admin_pwd);
   //返回单个的ResultSet对象
   ResultSet resultSet = preparedStatement.executeQuery();//括号里面不要加sql
   ```

   输入：用户名和密码为：`1' OR`     `OR '1'='1` 不会出现SQL注入问题。

   - `preparedStatement.setString(1, admin_user);`中的1代表第一个问好，一一对应
   - preparedStatement.executeQuery()里面不要加sql，会出现错误，但是statement.executeQuery(sql)要加入sql。

**PrepareStatement预处理的好处：**

1. 不再使用+拼接sql语句，减少语法错误
2. 有效的解决了SQL注入问题！
3. 大大减少了编译次数，效率较高
