### Java编程基础(第一阶段)

- 在B站韩顺平学习。
  - ⭐ 韩顺平 - 零基础 30 天学会 Java：https://www.bilibili.com/video/BV1fh411y7R8   （900 多集，顺序安排很合理，每个知识真正的打碎了，通俗、有示例、有实战、有思想）
- 准备好一款在线、随时随地写代码的工具，不用在本地去安装和配置，是初学者的好帮手
  - 推荐网站 - 菜鸟工具：https://c.runoob.com/compile/10

#### Day-01

##### 001 运行机制

- `Hello.java`-->`javac Hello.java`-->`java Hello`
  - ==.java文件==   $\underrightarrow{javac编译}$ ==.class文件（字节码文件）== $\underrightarrow{java运行}$ ==结果==
- 如果输出有中文一定要保存为GBK格式。
- 运行的本质就`.class`文件装载到**Jvm**机上执行。
- JDK,JRE,JVM的关系
  - JDK=RE+java开发工具
  - JRE=JWM+核心类库
- 环境变量path配置及其作用
  - 环境变量的作用是为了在dos的任意目录,可以去使用java和 Javac命令

##### 002 开发细节

- Java应用程序的执行入口时`main()`方法。有固定的书写格式：

  `public static viod main(String[] args){…}`
  
- Java所有语句必须用英文输入法书写；

- Java语言区分大小写；

- 每个语句要以“;”结束；

- 一个源文件中只能有一个`public`类。

##### 003 Java转义字符

- 常用的转义字符
  - `\t`：一个制表位，实现**对齐**的功能

  - `\n`：换行符

  - `\\`：一个\

  - `\"`：一个"

  - `\r`：一个回车
  - 例子：`System.out.println("书名\t\t作者\t\t价格\t\t销量\n红楼梦\t罗贯中\t120\t\t100");`
    -    <img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109171730202.png" alt="image-20210917173003925" style="zoom: 50%;" />

##### 004 注释介绍

- 单行注释

  ```java
  //注释文字
  具体代码
  ```
  
  
  
- 多行注释

  ```java
  /*注释文字
  注释
  注释
  */
  具体代码
  ```

  

- 文档注释
  ```java
  /**
   * 文档注释内容
   */
  public class……
  ```

  - 生成文档：`javadoc -d d: temp author -version Commento2 java`。d: temp是保存的文件夹。

##### 005 Java代码规范

1. 类、方法的注释，要以 java doc的方式来写。
2. 非 Java doc的注释，往往是给代码的维护者看的，着重告述读者为什么这样写如何修改，注意什么问题等。
3. 使用tab操作，实现缩进默认整体向右边移动，时候用shft+tab整体向左移。
4. 运算符和=两边习惯性各加一个空格。如:`2 + 4 * 5 = 22`
5. 源文件使用utf-8编码。
6. 行宽度不要超过80字符。
7. 代码编写次行风格和行尾风格。

##### 006 DOS原理

- Disk Operating System磁盘操作系统，简单说一下 windows的目录结构。
- **相对路径**和**绝对路径**。
  - 相对路径：从当前目录开始定位，形成的路径。
  - 绝对路径：从顶级目录开始定位，形成的路径。==必定有盘符==
- DOS命令
  1. 查看当前目录有什么内容？
     - `dir d: \ abc2\test200`
  2. 切换到其他盘下：盘符号cd
     - 案例演示：切换到c盘cd c:
  3. 切换到当前盘的其他目录下(使用相对路径和绝对路径演示）
     - 案例演示:：`cd d: \ abc2\test200\；cd..\\..\abc2\test200`
  4. 切换到上一级:
     - 案例演示：cd..
  5. 切换到根目录：cd\
  6. 查看子目录tree d:     tree d:\abc
  7. 清屏 cls
  8. 推出dos：exit
  9. 大家了解即可(md[创建目录],rd删除目录]copy拷贝文件],del删除文件],echo输入内容到文件]type,move剪切]

#### Day-02

##### 007 变量

- 为什么需要变量？

  - 变量是程序的基本组成单位，相当于内存中的一个存储空间的表示。
  - 变量三要素：类型+名称+值
    - 例子：`int a = 1`，类型是int整型，名称是a，值是1.

- 变量的基本步骤

  1. 声明变量
     - int a;
  2. 赋值
     - a = 60；
  3. 简写：int a = 60;
  4. 输出：System.out.println(a);

- 数据类型

  ```java
  String name ="jack";
  int age= 20;
  double score= 88.6;
  char gender='男';
  System.out.println (name);
  System.out.println(age);
  System.out.println(score);
  System.out.println(gender);
  ```

  

- 变量细节

  - int占4个字节，double占8个字节。
  - 变量在同一个作用域里不能同名。

- 程序中+的使用

  - 运算顺序：从左到右

  - 当左右兩边都是数值型时，则做加法运算。

  - 当左右两边有一方为字符串，则做拼接运算。

    ```java
    System.out.println(100+3);
    System.out.println(100+"23");
    System.out.println(100+3+"hello");
    System.out.println("100+3");
    ```

    - ​	<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109172216379.png" alt="image-20210917221600962" style="zoom:67%;" />

##### 008 数据类型

------

 <img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109191150757.png" alt="image-20210918004101622" style="zoom: 50%;" />

------

###### 1、整数类型

|     类型      | 占用存储空间 | 范围           |
| :-----------: | :----------: | -------------- |
|  byte[字节]   |    1字节     | -128~127       |
| short[短整型] |    2字节     | -2^15^~2^15^-1 |
|   int[整型]   |    4字节     | -2^31^~2^31^-1 |
| long[长整型]  |    8字节     | -2^63^~2^63^-1 |

-   整型的使用细节 
  - Java各整数类型有固定的范围和字段长度，不受具体OS操作系统的影响，以保证java程序的可移植性。

  - Java的整型常量(具体值)默认为int型，声明long型常量须后加"l"或"L"。

     ```java
     int n1 = 2;//对
     int n2 = 2L;//错的
     long n3 = 2L;//对的
     ```
     
  
    
  
  - java程序中变量常声明为int，除非不足以表示大数，才使用long
  
  - bit：计算机中的最小存储单位。byte：计算机中基本存储单元1byte=8bit。
  
    - [二进制再详细说,简单举例一个byte3和 short3]

###### 2、**浮点类型**

- 浮点数 = 符号位 + 指数位 +尾数

Java API文档：[Overview - Java 11中文版 - API参考文档 (apiref.com)](https://www.apiref.com/java11-zh/index.html)

###### 3、**字符类型char**

- char可以存放单个字符

  > //在java中,char的本质是一个整数,在输出时,得到的时unicode码对应的字符。==ASCII对照表==

  ```java
  char c1 = 'a';
  char c2 = '\t';
  char c3 = '宋';
  char c4 = 97;
  System.out.println(c1);
  System.out.println(c2);
  System.out.println(c3);
  System.out.println(c4);//但输出c4时，会输出56对应的字符
  System.out.println((int)c1);//输出字符a对应的数字
  System.out.println((int)c3);//输出字符 宋 对应的数字
  ```

  - 输出结果：<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109180134154.png" alt="image-20210918013430799" style="zoom:67%;" />

  ###### 4、布尔类型

  - 两种类型：**`true\flase`**。只占一个字节

  - 用于逻辑运算

    ```java
    //定义一个布尔变量
    boolean b = true;
    if(b == true){
        System.out.println("恭喜你，考试合格！");
    }else{
        System.out.println("考试不合格");
    }
    ```

    


###### 5、**类型转换**

- 自动类型转换

  - 当java程序在进行赋值或者运算时，**精度小的类型**自动转换为**精度大**的数据类型，这个就是自动类型转换。

  - 数据类型按精度(容量)大小排序为(背，规则)

    ![image-20210918015448676](https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109180154121.png)

    ```java
    //演示自动转换
    int a = 'b';//可以自动转换，char-->int
    System.out.println(a);//输出98
    double c = 89;//可以自动转换，int-->double
    System.out.println(c);//输出89.0
    int d = 1.5;//不可以
    System.out.println(d);//会报错
    ```

  - 自动提升原则：表达式中的数据类型自动转换为精度最大的数据类型。

- ==**强制类型转换**==

  - 自动类型转换的逆过程，将**容量大**的数据类型转换为**容量小**的数据类型。使用时要
    加上**强制转换符()**，==但可能造成精度降低或谥出==格外要注意。

    ```java
    //演示强制转换
    int m = (int)1.9;
    System.out.println("m="+m);//精度损失。输出1
    int j = 2000;
    byte n = (byte)j;
    System.out.println("n="+n);//精度溢出.输出-48
    ```

  - 强转符号直对最近的操作数有效，往往使用小括号提升优先级。
  
    ```java
    int x = (int)10*3.5 + 2.5;//编译错误，double不能自动转换为int
    int x = (int)(10*3.5 + 2.5);//结果为x = 37
    ```
  
  - char可以转换为int，但是不能保存int的变量值，需要强转。
  
    ```java
    char c1= 100;//ok
    int m= 100;//ok
    char c2=m;//错误
    char c3 =(char)m;//ok
    System.out.printin(c3);//输出100对应的ASCII字符d。
    ```

- 判断是否能够通过编译
  1. short s= 12://ok
  s=s-9;//错误int-> short
  2. byte b=10;∥/ok
  b=b+11;/错误int>byte
  b=(byte)(b+11);/l确,使用强转
  3. char c=a;//ok
  int i=16://ok
  float d =.314F.//ok
  double result =c+i+ d,//ok float->double
  4. byte b=16: //ok
  short s 14://ok
  short t=s+b;//错误int- short

###### 6、基本数据类型和Sting类型的转换

- basic-->String：`int a = 100;String b = a + ";`//其他基本数据类型也是一样。
- String-->basic：通过基本数据类型的包装类调用`Xx.parseXx()`

  ```java
  String s5 = "123";
  int num1= Integer.parseInt(s5);//123
  double num2 = Double.parseDouble(s5);//123.0
  float num3 = Float.parseFloat(s5);//123.0
  long num4 = Long.parseLong(s5);//123
  byte num5= Byte.parseByte(s5);//123
  boolean b = Boolean.parseBoolean("true");//true
  
  //怎么把字符串转成字符char,含义是指把字符串中的一个字符返回
  System.out.println(s5.charAt(0));//第0个字符1
  System.out.println(s5.charAt(1));//第1个字符2
  ```

- ```java
  String name = "jack";
  int age= 20;
  double score = 80.9;
  char gender='男';
  String hobby="打篮球";
  System.out.println("姓名\t\t年龄\t\t成绩\t\t性别\t\t爱好\n"+name+'\t'+
                      age+'\t'+'\t'+ score+'\t'+ gender+'\t'+'\t'+ hobby);
  ```

   <img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109181554644.png" alt="image-20210918155442681" style="zoom:67%;" />

#### Day-03 运算符

##### 1、算术运算符

![image-20210918160144273](https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109181601380.png)

###### /的使用

```java
System. out. print1n(10/4);//从数学来看是2.5,java中2
System, out println (10.0/4);//java225
//注释快捷键ctr1+/,再次输入ctr1+/取消注释
double d=18/4;//java中10/4=2,2=>2.
System.out.printin(d);//22.0
```

###### %的使用

- a % b = a- a /  b  * b

```java
System. out.printin(10 % 3);//1
System. out.println(-10 % 3);//-1
System. out.println(10 % -3);//1
System. out.printin(-10 % -3);//-1
```

###### ++、--的使用

- `k = ++j`//先自增后赋值。代表：j=j+1-->k = j

- `k = j++`//先赋值后加。代表：k=j-->j=j+1

- ```java
  int i1 = 1;
  i1 = i1++;
  System.out.println(i1);//1
  
  int i2 = 1;
  i2++;
  System.out.println(i2);//2
  
  int i3 = 1;
  i3 = ++i3;
  System.out.println(i3);//2
  
  int i4 = 1;
  ++i4;
  System.out.println(i4);//2
  
  ```

##### 2、赋值运算符

##### 3、关系运算符[比较运算符]

<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109181716506.png" alt="image-20210918171622801" style="zoom: 50%;" />

- 关系运算符的结果都是boolean类型，返回值只能值true或者false。

##### 4、逻辑运算符

- 用于连接多个条件（表达式），结果也是一个boolean型。
  - 与：&&
  - 或：||
  - 取反：！；例子：！a
  - 异或：^

##### 5、赋值运算符

- =、+=,-=,*=,/=,%=
- +=：a += b <=> a = a + b.其它同理

##### 6、位运算符[需要二进制基础]

- 

##### 7、三元运算符

- 基本语法：`条件表达式?表达式1:表达式2;`

- 运算规则

  1. 如果条件表达式为true,运算后的结果是表达式1;
  2. 如果条件表达式为 false,运算后的结果是表达式2

- 案例演示

  ```java
  int a = 10;
  int b = 99;
  //a > b?是true,则把a的值赋给result，再a++。反之b--
  int result = a > b? a++ : b--;//a不小于b，所以result=99，b=99-1=98
  System.out.println(result);//99
  System.out.println(a);//10
  System.out.println(b);//98
  ```

- ```java
  //案例:实现三个数的最大值
  int n1=55;
  int n2= 33;
  int n3=123;
  //思路
  //1.先得到n1和n2中最大数,保存到max1
  //2.然后再求出max1和n3中的最大数,保存到max2
  int max1 = n1>n2? n1: n2;
  int max2 = max1>n3? max1:n3;
  System.out.println("最大数="+max2);
  ```

##### 0010 标识符

- 标识符只能由==**0~9、26个英文字母、_、$**==组成,不可以数字开头,中间不能有空格	
- 命名规范
  1. 包名:多单词组成时所有字母都小写:aa.bbb.cc
     - 比如 `com. hsp`
  2. 类名、接口名:多单词组成时,所有单词的首字母大写: XxxYyyZzz
     - 比如: `TankShotGame`
  3. 变量名、方法名:多单词组成时,第一个单词首字母小写,第二个单词开始每个单词首字母大写: xxxYyyzzz
     - 比如: `tankShotGame`
  4. 常量名:所有字母都大写。多单词时每个单词用下划线连接: XXX_YYY_ZZZ
     - 比如:定义一个所得税率 `TAX_RATE`
  5. 后面我们学习到类,包,接口,等时,我们的命名规范要这样遵守更加详细的看文档.

##### 0011 键盘输入语句

- 在编程中，需要接收用户输入的数据，就可以使用键盘输入语句来获取。input. java,需要一个扫描器(对象),就是 Scanner.

- 步骤：

  - 导入该类的包：java.util.*

    ```java
    package Day_03;
    
    import java.util.Scanner;
    
    public class input {
        public static void main(String[] args){
            //演示接受用户的输入
            //步骤
            // Scanner类表示简单文本扫描器,在java.uti1包
            //1.引入/导入 Scanner类所在的包
            //2.创建 Scanner对象,new创建一个对象,体会
            // myScanner就是 Scanner类的对象
            Scanner myScanner = new Scanner(System.in);
            //3.接收用户输入了,使用相关的方法
            System.out.println("请输入名字：");
            String name = myScanner.next();//接收用户输入
            System.out.println("请输入年纪：");
            String age = myScanner.next();//接收用户输入
            System.out.println("名字：" + name + '\t' + "年纪：" + age);
        }
    }
    ```

    - 输出结果<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109181846821.png" alt="image-20210918184607268" style="zoom:50%;" />

##### 0012 进制

- 进制介绍

  对于整数,有四种表示方式:

  1. 二进制:0,1,满2进1以0b或0B开头。

  2. 十进制:0-9,满10进1

  3. 八进制:0-7,满8进1.以数字0开头表示。

  4. 十六进制:0-9及A(10)-F(15),满16进1以0x或0X开头表示。此处的AF不区分大小写。b11c12d13e1

- 举例说明 Binary Test java
  `intn1=0b1010`
  `intn2=1010`
  `intn3=01010`
  `ntn4=0x10101`

#### Day-04 控制结构

> 在程序中,程序运行的流程控制决定程序是如何执行的，是我们必须掌握的，主要有三大流程控制语句。

##### 0013 顺序控制

- 程序从上到下，逐个执行，中间没有任何判断和跳转

##### 0014 分支控制`if~else`

- 单分支

  ```java
  if(条件语句){
  	执行代码块1;//只有一句时，大括号可以省略
  }//当条件语句判断为true时，执行代码块1。
  ```
- 双分支
  ```java
  if(条件语句){
  	执行代码块1;//只有一句时，大括号可以省略
  }//当条件语句判断为true时，执行代码块1。
  else{
      执行代码块2;
  }//当条件语句判断为false时，执行代码块2。
  ```

  

- 多分支

    ```java
  if(条件语句1){
  	执行代码块1;//只有一句时，大括号可以省略
  }//当条件语句1判断为true时，执行代码块1。
  else if(条件语句2){
      执行代码块2;
  }//当条件语句2判断为true时，执行代码块2。
  ...
  else if(条件语句n){
      执行代码块n;
  }//当条件语句n判断为true时，执行代码块3。
  //多分支可以没有else
  else{
      执行代码块L;
  }//当所有的条件语句判断都为false时，执行代码块L。
  ```

- 嵌套分支

  - 基本介绍

    - 在一个分支结构中叉完整的嵌套了另一个完整的分支结构，里面的分支的结构称为内层分支外面的分支结构称为外层分支。规范:不要超过3层(可读性不好)

  - 基本语法

    ```java
    if(){
    	if(){
         //if-else.
        }else{
    	//if-else      
        }
    }
    ```

    

- **switch**

  - 流程图

   <img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109190115235.png" alt="image-20210918202753014" style="zoom: 33%;" />

  - 表达式的值与下面各个case块的常量比较，相同的话，就运行对应的语句块。

  ```java
  switch(表达式){
      	case 常量1://
              语句块1;
              break;
          case 常量2:
              语句块2;
              break;
          ...
          case 常量n:
              语句块n;
              break;
          
          default:
              default语句块;
              break;
  }
  ```

  - **switch注意事项和细节讨论**

    1. ==表达式数据类型，应和case后的常量类型一致，==

    2. ==或者是可以自动转成可以相互比较的类型，比如输入的是字符，而常量是int。==

    3. switch（表达式）中表达式的返回值必须是:(byte, short, int, char,enum, String)

       ```java
       double c = 1.1
       switch(c){//错误
       	case 1.1://错误
       		System.out.println("ok3");
       		break;
       ```

    4. case子句中的值必须是常量而不能是变量

    5. default子句是可选的，当没有匹配的case时，执行 default

    6. break语句用来在执行完一个case分支后使程序跳出 switch语句块；如果没有写break，程序会顺序执行到 switch结尾。

       ```java
       //对于输出结果一样的，可以通过穿透合并进行
       case 3:
       case 4:
       case 5:
       	System.out.println("3月是春季");
       	break;
       ```

       

##### 0015 循环控制

###### for 循环语句

- 基本语法

  - `for(循环变量初始化;循环条循环变量迭代){循环操作(可以多条语句);}`

- 规则

  1. for关键字,表示循环控制

  2. for有四要素:(1)循环变量初始化(2)循环条件(3)循环操作(4)循环变量迭代

  3. 循环操作,这里可以有多条语句,也就是我们要循环执行的代码

  4. 如果循环操作语句只有一条语句,{}可以省略仍,建议不要省略

     ```java
     //打印10个“我爱王琪”
     for (int i=0;i<10;i++){
         System.out.println("我爱王琪"+i);
     }
     
	   int i=0;
     for (;i<10;){
         System.out.println("我爱王琪"+i);
     }
     ```
  

######   while

- 基本语法

  ```java
  int i=0;
  while(i<0){
      System.out.println("王牌王琪"+i);
      i++;//循环变量迭代
  }
  ```

- 先判断再执行

###### do~while

- 基本语法

  ```java
  int i=0;
  do{
      System.out.println("还钱");
      i++;
  }while(i<10);
  ```

- 九九乘法表

  ```java
  int i=1;
  while (i<10){
      int j=1;
      while (j<i) {
          System.out.print(i + "*" + j + "=" + (i * j)+"\t");
          j++;
      }
      System.out.println();
      i++;
  }
  ```

   <img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109190115690.png" alt="image-20210919000502646" style="zoom:50%;" />

- 打印金字塔

  ```java
  for(int i=1;i<=5;i++){
      //输出前面的空格
      for(int k=1;k<=5-i;k++){
          System.out.print(" ");
      }
      //输出*
      for(int j=1;j<=2*i-1;j++){
          System.out.print("*");
      }
      System.out.println();
  }
  
  //空心金字塔
  for(int i=1;i<=5;i++){
      //输出前面的空格
      for(int k=1;k<=5-i;k++){
          System.out.print(" ");
      }
      //输出*
      for(int j=1;j<=2*i-1;j++){
          if(j==1||j==2*i-1||i==5){
              System.out.print("*");
          }else{
              System.out.print(" ");
          }
      }
      System.out.println();
  }
  ```

  - 结果<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109190115065.png" alt="image-20210919004639249" style="zoom:50%;" />

- **编程思想**
  - **化繁为简**
  - **先死后活**

###### break

- 注意细节`BreakExer02.java`
  - break语句块出现在多层嵌套中时，可以通过标签指明终止的是那一层语句块。
  - 标签Label的基本使用
    1. break语句可以指定退出哪层
    2. label1是标签，名字由程序员指定。
    3. break后指定到哪个label就退出到哪里
    4. 在实际的开发中，尽量不要使用标签
    5. ==如果没有指定 break，默认退出最近的**循环体**==
  - 对于字符串的比较用`equals()`方法。
    - 例子：**`"王琪".equals(name)`**;

###### continue

- 基本介绍

  - continue语句用于结束本次循环，继续执行下一次循环。
  - continue语句出现在多层嵌套的循环语句体中时，可以通过标签指明要跳过的是哪一层循环，这个和前面的标签的使用的规则一样。

- 基本语法

  ```java
  int i=1;
  while (i<=10){
      i++;
      if(i*i<20) {
          continue;/如果i的平方小于20，就不执行下面的语句，直接进入下一次循环条件的判断
      }
      System.out.println(i+"的平方大于20");
  ```

  

- 流程图

   <img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109192111845.png" alt="image-20210919170808873" style="zoom: 33%;" />

###### return

- 跳出当前方法或者跳出整个程序（main方法）

#### Day-05 数组

##### 0016 数组

- 数组可以存放多个同一类型的数据。数组也是一种数据类型，是==引用数据类型类型==。即：数组就是一组数据。
- `.length`,可以得到数组的长度

- ```java
  //创建一个数组，初始化
  //数组的下标是从0开始编号的
  double[] hens = {1,2,3,4.5,8.9,7};
  double sum=0;
  //遍历得到数组的和
  for(int i=0;i<6;i++){
      System.out.println("第"+(i+1)+"个元素是"+hens[i]);
      sum += hens[i];
  }
  System.out.println("和为"+sum+"，平均为"+(float)sum/6);
  //输出数组的长度
  System.out.println("数组的长度是"+hens.length);
  ```

###### 动态、静态初始化

- 动态初始化

  - 数据类型 数组名[] = new 数据类型[长度]；

  - ```java
    //第一种方式
    int arr[] = new int[6];//有6个元素
    //第二种方式
    int arr1[]或者int[] arr1;
    arr1[] = new int[10];
    ```

- 静态初始化
  - 如果知道数组的长度和具体的值，可以用静态初始化
  - `int arr[] = {1,2,3,4};`

- 细节

- //3.数组创建后,如果没有赋值,有默认值
  //int 0. short 0, byte 0，long 0；
  //float 0.0, double 0.0， char \u0000. Boolean false. String null
  
- ```java
  //1.数组是多个相同类型数据的组合,实现对这些数据的统一管理
  //int[l arr1=(1, 2, 3, 60, hello");//String ->int
  double[]arr2={1.1,2.2,3.3,60.6,108};//int-> double
  //2.数组中的元秦可以是任何数据类型,包括基本类型和引用类型,但是不能混用
  string[]arr3={"北京","jack"," milan"}
  //3.数组创建后,如果没有赋值,有默认值
  //int 0. short 0, byte 0，long 0；
  //float 0.0, double 0.0， char \u0000. Boolean false. String null
  ```
  
- 案例

  ```java
  //求数组的最大值，并输出对应的下标
  int arr[] = {4, 5, 30,-9, 89,44};
  int max=arr[0];//默认arr[0]是最大的，和剩下的比较
  int maxIndex=0;//默认arr[0]的下标是最大值的下标
  for(int i=0;i<arr.length;i++){
  	if(max < arr[i]){
  		max = arr[i];
  		maxIndex = i;
  	}
  }
  System.out.println(max);
  System.out.println(maxIndex);
  }
  ```

###### 数组赋值

- `ArrayAssign.java`

- 赋值机制

  - 基本数据类型赋值，这个值就是具体的数据，而且相互不影响。

  - 数组在默认情况下是==引用传递==，赋的值是==地址==。

    ```java
    //基本数据类型賦值,賦值方式为值拷贝
    //n2的变化,不会影响到n1的值
    int n1 = 10;
    int n2 = n1;
    n2 = 88;
    System.out.println("n1=" + n1);//10
    System.out.println("n2=" + n2);//80
    //数组在默认情况下是引用传递,賦的值是地址,赋值方式为引用传递
    //是一个地址,arr2变化会影响到arr1
    int[] arr1 = {1,2,3};
    int[] arr2 = arr1;//把arr1赋给arr2
    arr2[0] = 10;//同时会改变arr1[0]的值。也变成10
    ```

###### 数组拷贝

- 编写代码，实现数组拷贝。arr2不同于arr1的内存空间。==ArrayCopy.java==

  ```java
  //实现数组拷贝
  //要求arr2有独立的内存空间
  int arr1[] = {1,2,3};//初始化arr1，一个arr1de内存空间
  //创建一个数组arr2，开辟新的内存空间
  int arr2[] = new int[arr1.length];//设置arr2的长度和arr1的一样
  //遍历arr1,把arr1的元素拷贝到arr2对应的位置
  for(int i=0;i<arr1.length;i++){
      arr2[i] = arr1[i];//实现数组拷贝，两个数组各自拥有独立的内存空间
  }
  //改变arr2[0]的值
  arr2[0] = 20;
  //此时，arr1[0]的值不会改变，因为两个不是同一个地址.即arr1[0]==1
  ```

###### 数组翻转

- 即数组的逆置。

- 逆序输出

  ```java
  int arr[] = {1, 2, 3, 4, 5, 6};
  for(int i = arr.length - 1; i >= 0; i--) {
  System.out.print(arr[i]+"\t");
  }
  ```

- 重新定义一个arr2[]

  ```java
  int[] arr2 = new int[arr1.length];
  for(int i = 0;i<arr1.length;i++){
  	arr2[i] = arr1[arr1.length -1-i];
  }
  for(int i = 0;i<arr1.length;i++){
  	System.out.print(arr2[i]+" ");
  }//第二种方法
  ```

###### 数组扩容

- [==ArrayAdd.java==](https://gitee.com/song-zhangyao/study/blob/master/Java%20Learning/JavaCode/src/Day_05/ArrayAdd.java)

  ```java
  //实现对数组的扩容+4
  int arr[] = {1, 2, 3};
  //创建一个新的数组，长度比arr.length多一
  int arrNew[] = new int[arr.length+1];
  for(int i=0;i<arr.length;i++){
      arrNew[i] = arr[i];
  }
  arrNew[arrNew.length-1] = 4;
  //再把arrNew地址转移给arr
  arr = arrNew;//原先的arr会被自动销毁
  System.out.println("扩容后的arr：");
  for(int i=0;i<arr.length;i++){
      System.out.println("arr["+i+"]="+arr[i]);
  }
  ```

- 对上面的扩容，让用户可以选择是否继续添加（y/n)。==[ArrayAdd02.java](https://gitee.com/song-zhangyao/study/blob/master/Java%20Learning/JavaCode/src/Day_05/ArrayAdd02.java)==

- 课后练习题: [ArrayReduce.java](https://gitee.com/song-zhangyao/study/blob/master/Java%20Learning/JavaCode/src/Day_05/ArrayReduce.java)
  有一个数组{1,2,3,4,5}，可以将该数组进行缩减，提示用户是否继续缩减，每次缩减最后那个元素。当只剩下最后一个元素，提示：不能再缩减。

##### 0017 排序

- 介绍
  - 排序是将多个数据,依指定的顺序进行排列的过程。
  - 排序的分类
    1. 内部排序
       - 指将需要处理的所有数据都加载到内部存储器中进行排序。包括(交换式排序法、选择式排序法和插入式排序法)
    2. 外部排序法:
       - 数据量过大,无法全部加载到内存中,需要借助外部存储进行排序。包括(合并排序法和直接合并排序法)。
- **冒泡排序**( Bubble Sorting)的基本思想是: 
  
  - 通过对待排序序列从后向前(从下标较大的元素开始)，依次比较相邻元素的值，若发现逆序则交换，使值较大的元素逐渐从前移向后部,就象水底下的气泡一样逐渐向上冒。
  
  - ```java
    temp = arr[i];
    arr[i] = arr[i + 1];
    arr[i + 1] = temp;
    ```
  
    可以将两个数位置交换
  
  - **分析冒泡排序**:  数组[24,69,80,57,13]
  
    - 第1轮排序:目标把最大数放在最后
      第1次比较[24,  69,  80,  57,  13]//24<69，不变
      第2次比较[24,  69,  80,  57,  13]//69<80,，不变
      第3次比较[24,  69,  57,  80,  13]//80>57，交换位置
      第4次比较[24,  69,  57,  13,  80]//80>13，交换位置
    - 第2轮排序:目标把第二大数放在倒数第二位置
      第1次比较[24，69，57，13，80]
      第2次比较[24，57，69，13，80]//69>57，交换位置
      第3次比较[24，57，13，69，80]//69>13，交换位置
    - 第3轮排序:目标把第3大数放在倒数第3位置
      第1次比较[24，57，13，69，80]
      第2次比较[24，13，57，69，80]//57>13，交换位置
    - 第4轮排序:目标把第4大数放在倒数第4位置
      第1次比较[13，24，57，69，80]//24>13，交换位置
  
  - 代码实现[BubbleSort.java](https://gitee.com/song-zhangyao/study/blob/master/Java%20Learning/JavaCode/src/Day_05/BubbleSort.java)
  
    ```java
    int[] arr = {24,69,80,57,999,78};
    int temp = 0;
    int n = arr.length;
    for (int j = 0; j < n-1; j++) {
        for (int i = 0; i < n-1-j; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }
    ```
  
    输出结果<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109201432324.png" alt="image-20210920142943283" style="zoom:50%;" />

##### 0018 查找

- 顺序查找、二分查找
- 顺序查找[SeqSearch.java](https://gitee.com/song-zhangyao/study/blob/master/Java%20Learning/JavaCode/src/Day_05/SeqSearch.java)

##### 0019 二维数组

- 初始化。二维数组的每一个元素本质上是一个一维数组。每行的元素个数不一定要一样

  ```java
  int[][] twoArray = {{1,2,3},{5,6,7},{0,3,7}};
  ```

- 输出一个二维数组

  ```java
  int[][] twoArray = {{1,2,3},{5,6,7},{0,3,7}};
  for(int i=0;i<twoArray.length;i++){
      //twoArray[i].length得到对应的一维数组的长度
      for(int j=0;j<twoArray[i].length;j++){
          System.out.print(twoArray[i][j]+" ");
      }
      System.out.println();
  }
  ```

  - 输出结果<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109201643547.png" alt="image-20210920152006872" style="zoom: 67%;" />

###### 初始化

- 动态初始化

  ```java
  int twoArry[][] = new int[m][n];//m是数组的行数，n是列数。
  //第二种
  int twoArry2[][];
  twoArry2 = new int[m][n];
  ```

- 静态初始化

  int[][] twoArray = {{1,2,3},{5,6,7},{0,3,7}};

###### 杨辉三角

- YanghuiTriangle.java

-  ```java
    int arr[][] = new int[6][];//初始化一个二维数组
     for(int i=0;i<arr.length;i++){
        arr[i] = new int[i+1];//初始化二维数组中的每一个一维数组。长度为行数。
        for(int j=0;j<arr[i].length;j++){
            if(j==0 || j==arr[i].length-1){
                arr[i][j] = 1;//第一个数和最后一个数用于为1
            }else{
                arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
            }
        }
     }
    ```

- 输出结果<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109201643262.png" alt="image-20210920164154009" style="zoom: 50%;" />

###### 二维数组使用细节

- 一维数组的声明方式有:
  int[]  x或者int x[]
- 二维数组的声明方式有:
  `int[][] y`或者`int[] y[]`或者`int y[][]`
- 二维数组实际上是由多个一维数组组成的，它的各个一维数组的长度可以相同。也可以不相同。
  - 比如: maple是一个二维数组
    `map[][]={1,2},{3,4,5}}` 
  - 由map[0]是一个含有两个元素的一维数组，map[1]是一个含有三个元素的一维数组构成，我们也称为列数不等的二维数组。
- 练习题：
  1. 4.已知有个升序的数组,要求插入一个元素,该数组顺序依然是升序,比如:[10,12,45,90],添加23后,数组为[10,12,23,45,90]。[ArrayWork01Plus.java](https://gitee.com/song-zhangyao/study/blob/master/Java%20Learning/JavaCode/src/Day_05/ArrayWork01Plus.java)
  2. 随机生成10个整数(1~100的范围)保存到数组，并倒序打印以及求平均值、求最大值和最小值的下标、并查找里面是否有8？[ArrayWork02 .java](https://gitee.com/song-zhangyao/study/blob/master/Java%20Learning/JavaCode/src/Day_05/ArrayWork02.java)

#### Day-06 面向对象(基础)

- 类与对象
  成员方法
  成员方法传参机制
  重载( overload)
  可变参数
  作用成
  构造器
  this

##### 0020 类与对象

###### 简介

- class:类；object:对象
  - 一个人或者任何一个事物都可以被称之为一个对象
  - 对象=属性+行为
- 类与对象关系示意图
  - ![image-20210920213830634](https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109202140327.png)
    - 类就是数据类型，比如Cat\persion\dog
    - 对象就是一个具体的**实例**
  - ![image-20210920214835233](https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109202148399.png)

###### 入门

- ObjectCat.java

  - ```java
    //使用面向对象OOP来解决养猫问题
    //定义一个猫类--自定义数据类型
    class Cat{
        String name;
        int age;
        String color;
    }
    ```

  - ```java
    //实例化一只猫--创建一个猫对象
    //new Cat();创建一只猫
    //Cat cat1 = new Cat();把创建的猫赋给cat1
    Cat cat1 = new Cat();
    cat1.name = "小白";
    cat1.age = 3;
    cat1.color = "白色";
    ```

    

- 通过ObjectCat.java的案例和讲解我们可以看出

  - 类是抽象的,概念的,代表一类事物比如人类猫类,即它是数据类型
  - 对象是具体的,实际的,代表一个具体事物即是实例
  - 类是对象的模板,对象是类的一个个体,对应一个实例

- 对象在内存中的存在形式

###### 属性和成员变量

- 成员变量<=>属性<=>字段。例如：Cat类中的name；age；color;
- 可以是基本数据类型，也可以是引用类型。例如：一个数组或者一个类
- 属性注意事项和细节PropertyDetail.java
  - 属性的定义语法同变量，示例:**访问修饰符**，**属性类型**，**属性名**
    - 例如：在上述的Cat类中；`protected String name;`protected就是一个**访问修饰符**(控制属性的访问范围)
    - 访问修饰符:  public, protected,默认, private。
  - 属性的定义类型可以为任意类型，包含基本类型或引用类型
  - 定义属性后后,如果没有赋值,有默认值
    int 0. short 0, byte 0，long 0；float 0.0, double 0.0， char \u0000. Boolean false. String null
    - 案例演示:[ Person类]
- 如何创建一个对象
  1. 先声明再创建：Cat cat;cat = new Cat();
  2. 直接创建：Cat cat = new Cat();
- 如何访问属性 。对象名.属性名-->cat.name;

###### 类与对象的分配机制

- 对象之间的赋值，同数组一样也是**地址转移**；

- 类和对象的内存分配机制、Java内存的结构分析

  - **栈**: 一般存放基本数据类型(局部变量)
  - **堆**: 存放对象( Cat cat,数组等)
  - **方法区**: 常量池(常量,比如字符串)，类加载信息
  - 示意图[Cat(name,age, price)]

- Java刨建对象的流程简单分析

  ```java
  Person p = new Person();
  p.name = "jack";
  p.age = 10;
  ```

  1. 先加载Person类信息（属性和方法信息，只会加载一次）
  2. 在堆栈中分配空间，进行默认初始化，
  3. 把地址赋给p；p就指向对象
  4. 进行指定初始化。Example:p.name = "jack";p.age = 10;

- Object02.java <img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109210248417.png" alt="image-20210921024049348" style="zoom: 33%;" />

##### 0021 成员方法

- 基本介绍
  - 在某些情况下，我们要需要定义**成员方法**(简称方法)。比如人类除了有一些属性外(年龄,姓名)，我们人类还有一些**行为**，比如:  可以说话、跑步、通过学习,还可以做算术题。这时就要用**成员方法**才能完成。现在要求对 Person类完善。

###### 入门

- [Method01.java]

  - 对于Person类。构造三个方法

  1. //添加一个speak方法，输出“我是一个好人”
     //public表示方法是公开的；void表示没有返回值；()表示：形参列表

     ```java
     public void speak(){
         System.out.println("我是一个好人");
     }//方法体
     ```
     
  2.  //添加ca0l2成员方法该方法可以接收一个数n,计算从1+…+n的结果
     //(int n)表示形参列表，用户可以接收一个n

     ```java
     public void cal02(int n){
         int sum1 = 0;
         for(int i=1; i<=n; i++){
             sum1 += i;
         }
         System.out.println("1+…+n = "+sum1);
     }
     ```
     
  3. //添加 getSum成员方法可以计算两个数的和
     //int表示方法执行后，返回一个int值
     //(int x,int y)表示形参列表，用户可以接收两个int
     // return res:表示把res的值返回

     ```java
     public int getSum(int x,int y){
         int res = x + y;
         return res;
     }
     ```


  - 调用成员方法

    ```java
     per1.speak();
     //调用cal01成员方法可以计算从1+…+1000的结果
     per1.cal01();
     //添加ca0l2成员方法该方法可以接收一个数n,计算从1+…+n的结果
     per1.cal02(4);
     System.out.println(per1.getSum(6,9));//计算6+9
    ```

- 方法调用小结
  1. 当程序执行到方法时，就会辟一个独立的空间(栈空间)
  2. 当方法执行完毕，或者执行到 return语句时，就会返回
  3. 返回到调用方法的地方
  4. 返回后，继续执行方法后面的代码
  5. 当main栈里面的语句执行完之后，整个程序就结束

###### 成员方法的妙用

- 优点
  - 提高代码的复用性
  - 将实现的细节封装起来，然后供其他用户来使用即可

- 成员方法的定义

  - 访问修饰符 `返回数据类型` 方法名(形参列表)  方法体
    语句
    return返回值;

    1. 形参列表:表示成员方法输入`calo1(int n),traverse(int[][] map)`
    2. 数据类型(返回类型):表示成员方法输出,void表示没有返回值。可以是任何数据类型，例如：数组、对象.....
    3. 方法主体:表示为了实现某一功能代码块

    4. return语句不是必须的。(当`返回数据类型`不是void时，就要有return)
      - 一个方法最多一个返回值
      - return返回的值必须与`返回数据类型`的数据类型保持一致
    5. 老韩提示:结合前面的题示意图,来理解

  - 方法中不能嵌套定义

    

  - 如果一个类中有一个以上的方法，方法之间可以互相调用

  - 不在同一个类里的方法，调用时要通过对象名。

    - Person类。Method01.java

      ```java
      class Person{
          public void speak(){
              System.out.println("hhhh");
          }
          //可以直接调用speak方法
          public void sayOk(){
              //要调用A类中的方法
              //创建一个对象
              A a = new A();
              a.abc;//调用类A中的方法abc
              Speak();
              System.out.println("i am ok");
          }
      }
      class A{
          public void abc(){
              System.out.println("我是A类中的方法")
          }
      }
      ```

      

  - 练习

    - methodExer01.java

###### 方法传参机制

1. 对于**基本数据类型**，传递的是值（值拷贝），形参的任何改变不影响实参。
2. **引用类型传递**的是地址(传递也是值，但是值是地址)，可以通过形参影响实参。==难点==（0212集韩顺平）

###### 对象克隆

- MethodCopy.java

##### 0022 递归

- recursive：递归

- 递归能解决什么问题?
  1. 各种数学问题如:8皇后问题,汉诺塔,阶乘问题迷宫问题球和篮子的问题( google编程
     大赛)[简单演示
  2. 各种算法中也会使用到递归,比如快排,归并排序,二分查找,分治算法等.
  3. 将用栈解决的问题->递归代码比较简洁

###### 运行机制

- 栈：先进后出

-  <img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109211618439.png" alt="image-20210921161754299" style="zoom: 33%;" />

- ```java
  //阶乘
  public int factorial(int n) {
      if(n==1){
          return 1;
      }else{
          return factorial(n-1)*n;
      }
  }
  ```
  - 流程图<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109211833966.png" alt="image-20210921183348448" style="zoom:33%;" />

###### **递归重要规则**

1. 执行一个方法时，就创建一个新的受保护的独立空间栈空间)
2. 方法的局部变量是独立的，不会相互影响，比如n变量
3. 如果方法中使用的是引用类型变量(比如数组)，就会共享该引用类型的数据
4. 递归必须向退出递归的条件逼近，否则就是无限递归出现:StackOverflow Error，死龟了:
5. 当一个方法执行完毕，或者遇到 return，就会返回，遵守谁调用，就将结果返回给谁，同时当方法执行完毕者返回时，该方法也就执行完毕。

###### 递归经典案例

1. 斐波那契数列[Fibonacci.java](https://gitee.com/song-zhangyao/study/blob/master/Java Learning/JavaCode/src/Day_06/Fibonacci.java)
2. 迷宫问题[Maze.java](https://gitee.com/song-zhangyao/study/blob/master/Java%20Learning/JavaCode/src/Day_06/Maze.java)
3. 猴子吃桃问题[MonkeyPeach.java](https://gitee.com/song-zhangyao/study/blob/master/Java%20Learning/JavaCode/src/Day_06/MonkeyPeach.java)
4. 汉诺塔[HanoiTower.java](https://gitee.com/song-zhangyao/study/blob/master/Java%20Learning/JavaCode/src/Day_06/HanoiTower.java)
5. 八皇后[EightQueen.java](https://gitee.com/song-zhangyao/study/blob/master/Java%20Learning/JavaCode/src/Day_06/EightQueen.java)

##### 0023 重载

- overload:重载

- 基本介绍

  - java中允许同一个类中，多个同名方法的存在，但要求形参列表不一致!
  - 比如: Systen.out.println(10);out是 PrintStream类型

- 重载的好处

  1. 减轻了起名的麻烦

  2. 减轻了记名的麻烦

- 注意事项和使用细节

  1. ==方法名：必须相同==

  2. **形参列表**：必须不同(**参数类型**或**个数**或**顺序**，至少有一样不同，**参数名无要求**)

  3. **返回类型**：无要求	

  4. //下面四个calculate方法构成重载

     ```java
     public int calculate(int n1,int n2){
     	return n1+n2;
     }
     public double calculate(int n1 , double n2){
     	return n1+n2;
     }
     public double calculate(double n2, int n1){
     	return n1+n2;
     }
     public int calculate (int n1, int n2, int n3){
     	return n1+n2+n3;
     }
     ```

     

##### 0024 可变参数

- 基本概念

  - java允许将 ==同一个类== 中==多个同名==  ==同功能==但  ==参数个数不同==的方法，**封装**成一个方法。
  - 通过可变参数实现

- 基本语法

  - 访问修饰符 返回类型 方法名(数据类型…形参名){}

- 快速入门案例〔 [VarParametert01.java](https://gitee.com/song-zhangyao/study/blob/master/Java%20Learning/JavaCode/src/Day_06/VarParameter01.java))

  - 看一个案例类 HspMethod,方法sum【可以计算2个数的和,3个数的和,4个数的和，……】

  - ```java
    public int sum(int...nums){}
    ```

    

- 注意事项和使用细节VarParameterDetail. java

  1. 可变参数的**实参**可以为0个或任意多个。

  2. 可变参数的实参可以为==数组==。

  3. 可变参数的**本质就是数组**

  4. 可变参数可以和普通类型的参数一起放在形参列表，==但必须保证可变参数在最后==

     ```java
     public int sum(String str,int...nums){}
     ```

     

  5. 一个形参列表中只能出现**一个可变参数**

- 练习VarParameterExercise.java

  - 有三个方法，分别实现返回姓名和两门课成绩(总分)；返回姓名和三门课成绩(总分)；返回姓名和五门课成绩(总分)。封装成一个可变参数的方法

    ```java
    package Day_06;
    
    public class VarParameterExercise {
        public static void main(String[] args) {
            Var var = new Var();
            String xx = var.showScore("小明",45,78,45,35,90);
            System.out.println(xx);
        }
    }
    class Var{
        public String showScore(String str,int...scores){
            int sum = 0;
            for(int i=0;i<scores.length;i++){
                sum += scores[i];
            }
            return str+"的"+scores.length+"科成绩总分为"+sum;
        }
    }
    ```

##### 0025 Java作用域

- 基本使用
  - 面向对象中，变量作用城是非常重要知识点，相对来说不是特别好理解，请大家注意听，认真思考，要求深刻掌握变量作用域。 [Scope. java](https://gitee.com/song-zhangyao/study/blob/master/Java%20Learning/JavaCode/src/Day_06/Scope.java)
    1. 在java编程中，主要的变量就是**属性(成员变量)**和局部变量。
    2. 我们说的局部变量一般是指在成员方法中定义的变量。【举例cat类:cry】
    3. java中作用域的分类
       - 全局变量：也就是属性，作用域为整个类体Dog类: speak、run等方法使用属性
       - 局部变量：也就是除了属性之外的其他变量，作用城为定义它的代码块中!
    4. 全局变量可以不赋值，直接使用，因为有默认值，**局部变量必须赋值后,**才能使用，因为没有默认值。

- 细节

  - **属性和局部变量可以重名**，使用时遵循就近原则

  - ```java
    String name = "Tom";
    public void run(){
    	String name = "jack";
    	System.out.println(name);//将会输出离他最近的name。即jack
    }
    ```

  - 属性生命周期较长，伴随着对象的创建而创建，伴随着对象的死亡而死亡。

  - 局部变量，生命周期较短，伴随着它的代码块的执行而创建，伴随着代码块的结束而死亡。即在一次方法调用过程中。

  - 作用城范围不同

    - 全局变量/属性:可以被本类使用,或其他类使用(通过对象调用)
    - 局部变量:只能在本类中对应的方法中使用

  - 修饰符不同

    - 全局变量/属性可以加修饰符
    - 局部变量不可以加修饰符

##### 0026 构造方法/构造器

- constructor:构造器
- 基本语法
  - [修饰符] 方法名 形参列表
    方法体
    
  - ```java
    String name;
    int age;
    public Dog( String pName, int pAge){//构造器
    	name = pName;
        age = pAge;
    }
    ```
  
  - 说明
    1. 构造器的修饰符可以默认,也可以是 public protected private
    2. **构造器没有返回值**
    3. **方法名**和**类名**必须一样
    4. 参数列表和成员方法一样的规则
    5. 构造器的调用系统自动完成
  
- 基本介绍

  - 构造方法又叫构造器( constructor)，是类的一种特殊的方法，它的主要作用是完成对**新对象的初始化**。
  - 它有几个特点[Constructor.java](https://gitee.com/song-zhangyao/study/blob/master/Java%20Learning/JavaCode/src/Day_06/Constructor.java)
    - 方法名和类名相同
    - 没有返回值
    - 在刨建对象时，系统会自动的调用该类的构造器完成对象的初始化
  - 构造器可以重载
  - 如果程序员没有定义构造器，系统会自动给类生成一个**默认无参构造器**(也叫默认构造器)，
    - 比如`Dog(){}`,使用avap指令反编译看看
    - 一旦定义了自己的构造器默认的构造器就被覆盖了，就不能再使用默认的无参构造器，除非显式的定义一下，即: `Dog(){}`
    - [ConstructorExer01.java](https://gitee.com/song-zhangyao/study/blob/master/Java%20Learning/JavaCode/src/Day_06/ConstructorExer01.java)

- **对象创建的流程分析【重点】**
    [image-20210922184852482](https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109221848965.png)


##### 0027 this关键字

- 基本介绍

  - 对构造器的简便化.

  - ```java
    String name;
    int age;
    public Dog(String name, int age){//构造器
        //this.name就是当前对象的属性name
        this.name = name;
        //this.age就是当前对象的属性age
        this.age = age;
    }
    ```

    等价于=>构造器

    ```java
    String name;
    int age;
    public Dog( String pName, int pAge){//构造器
    	name = pName;
        age = pAge;
    }
    ```

  - this引用内存图

    ![image-20210922210733511](https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109222107376.png)

  - 简单的说，哪个对象调用。this就代表哪个对象

- this细节ThisDetail.java

  1. this关键字可以用来访向本类的属性、方法、构造器
  2. this用于==区分当前类的属性和局部变量==
  3. 访问成员方法的语法：`this.方法名(参数列表)`
  4. 访问构造器语法：this(参数列表)；注意：==只能在构造器中访问另外一个构造器时使用==，成员方法不能访问构造器。
  5. this不能在类定义的外部使用，只能在类定义的方法中使用。
  6. **如果在成员方法中没有局部变量，不用写this。**

##### 本章作业

1. 编写类A01，定义方法max，实现求某个 double数组的最大值，并返回。
   HomeWork01.java
2. 编写类A02,定义方法find,实现查找某字符串数组中的元素查找,并返回索引。如果找不到,返回-1. HomeWork02.java
3. 编写类Book,定义方法 updatePrice,实现更改某本书的价格,HomeWork03.java
   - 具体:如果价格>150则更改为150,
   - 如果价格<100,更改为100,否则不变 
4. 编写类A04,实现数组的复制功能 copyArr，输入旧数组,返回一个新数组,元素和旧数组一样 HomeWork04java
5. 定义一个圆类 Circle,定义属性:半径。提供显示圆**周长**功能的方法，提供显示圆面积的方法 HomeWork05java
6. 编程创建一个Cale计算类，在其中定义2个变量表示两个操作数，定义四个方法实现求和、差、乘、商(要求除数为0的话,要提示)并创建两个对象，分别测试   。HomeWork06. java
7. 设计一个Dog类,  有名字、颜色和年龄属性，定义输出方法show()显示其信息。并创建对象,进行测试、【提示this.属性】 HomeWork07.java
8. 定义 Music类，里面有音乐名name、音乐时长 time属性，并有播放play功能和返回本身属性信息的功能方法 getInfo.      HomeWork8.java
9. 在测试方法中，调用 method方法,代码如下,编译正确，试写出 method方法的定义形式,
   - 调用语句为: System. out.println( method( method(10.0,20.0),100)……HomeWork9.java
10. 创建一个 Employee类，属性有(名字,性别,年龄,职位,薪水)，提供3个构造方法，
    - 可以初始化
      1. (名字,性别,年龄,职位,薪水)
      2. (名字,性别,年龄)
      3. (职位,薪水)要求充分复用构造器 ……HomeWork10.java
11. HomeWork11.java
12. 有个人Tom设计他的成员变量，成员方法可以电脑猜拳，电脑每次都会随机生成0,1,2
    1. 0表示石头1表示剪刀2表示布
    2. 并要可以显示Tom的输赢次数(清单)……HomeWork12.java

#### Day-07 面向对象(中级)

##### 0028 idea的使用

- IDEA常用快捷键
  1. 剪切当前行。自己配置`ctrl+x`
  2. 复制当前行,自已配置`ctrl+d`
  3. 补全代码`alt+/`
  4. 添加注释和取消注释`ctr+/`【第一次是添加注释,第二次是取消注释】
  5. 格式化当前文件。可以自动对齐排版`ctrl+Alt+L`
  6. 生成**构造器**等`Alt+ insert`[提高开发效率]
  7. 查看一个类的层级关系`ctrl+H`[学习继承后,非常有用]
  8. 将光标放在一个方法上,输入`ctrl+B`,可以选择定位到哪个类的方法[学继承后非常有用]
  9. 自动的分配变量名,通过在后面`.var`
  10. 还有很多其它的快捷键
- 自定义模板（默认展开方式`Tab`）
  1. sout模板：System.out.println();
  2. fori模板：for (int i = 0; i < ; i++) {}
  3. itar模板：遍历数组
  4. 很多很多
- 包
  - 同一个包下面不能有两个名字相同的类；
  - 调用其它包中的类，创建对象的时候。要加包名：
    - 在package02中的类调用package01中的类时：package01.Dog dog = new package01.Dog ();
    - 或者通过import引入：import package02.Dog;
  - 命名规范
    - 命名规则:
      只能包含数字、字母、下划线、小圆点但不能用数字开头,不能是关键字或保留字
    - 一般是：小写字母+小圆点。一般是
      - com.公司名.项目名.业务模块名
      - 举例
        com. sina.crm.user/用户模块
        com. sina.crm.order//订单模块
        com. sina.crm.utils//工具类
  - 常用的包
    一个包下包含很多的类ava中常用的包有:
    - java.lang.*//lang包是基本包，默认引入，**不需要再引入**
    - java.uti.*//util，系统提供的工具包，工具类，使用 Scanner
    - java.net.*//网络包，网络开发
    - java.awt.*//是做java的界面开发，GUl
  - java.uti.Arrays这个包中有自动冒泡排序的方法sort();

##### 0029 访问修饰符

- 基本介绍[modifier](https://gitee.com/song-zhangyao/study/tree/master/Java%20Learning/JavaCode/src/Day_07/modifier)
  - Java提供四种访问控制修饰符号控制方法和属性(成员变量)的==访问权限==(范围)
    1. 公开级别：用 public修饰符**对外公开**
    2. 受保护级别：用 protected修饰对**子类和同一个包中的类**公开
    3. 默认级别：没有修饰符号向**同一个包的类**公开
    4. 私有级别：用 private修饰只有**类本身**可以访问不对外公开
  - ![image-20210923142942637](https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109231429600.png)
- 使用的注意事项
  1. 修饰符可以用来修饰类中的属性，成员方法以及类
  2. 只有默认的和 public才能修饰类！并且遵循上述访问权限的特点。
  3. 因为没有学习继承，因此关于在子类中的访问权限，我们讲完子类后，在回头讲解。
  4. 成员方法的访问规则和属性完全一样

##### 0030 封装👌

- encapsulatio：[封装](https://gitee.com/song-zhangyao/study/tree/master/Java%20Learning/JavaCode/src/Day_07/encap)

- 面向对象三大特征：封装，继承，多态

- 基本介绍

  - 封装( encapsulation)就是把抽象岀的数据[属性]和对数据的操作[方法]封装在一起，
  - 数据被保护在内部，程序的其它部分只有通过被**授权**的操作【方法】，才能对数据进行操作。

- 封装的理解和好处

  - 隐藏实现细节
  - 可以对数据进行验证,保证安全合理

- 封装的实现步理

  1. 将属性进行私有化【不能直接修改属性】

  2. 提供一个公共的(public)set方法，用对属性判断并赋值

     ```java
     public void setXxx(类型 参数名){
     	//加入数据验证的业务逻辑
     	属性=参数名;
     }
     ```

     

  3. 提供一个公共的(public)get方法，用于获取属性的值

     ```java
     public XX getXxx{//权限判断
          return xx.
     }
     ```

     

##### 0031 继承😘

- 关键字：extends
- 解决代码复用性。两个类的属性和方法有很多是相同的


- 继承基本介绍和示意图

  - 继承可以解决**代码复用**让我们的编程更加靠近人类思维，
  - 当多个类存在相同的属性(变量)和方法时，可以从这些类中抽象出父类，在父类中定义这些**相同的属性和方法**，
  - 所有的子类不需要重新定义，这些属性和方法，只需要通过 `extends`声明**继承父类**即可。
  - 画出继承的示意图
  - 继承的基本语法
    - cass子类 extends父类
      1. ==子类就会自动拥有父类定义的属性和方法==
      2. 父类又叫超类，基类。
      3. 子类又叫派生类。
      4. 子类也可以有它的子类

- 继承的细节[ExtendsDetail.java](https://gitee.com/song-zhangyao/study/blob/master/Java%20Learning/JavaCode/src/Day_07/extendsLearn/ExtendsDetail.java)

  1. 子类继承了父类所有的属性和方法，但是**私有(private)属性**和**私有方法**不能在子类直接访问，要通过==父类中公共(public)的方法==去访问。
  2. ==**子类必须调用父类的构造器完成父类的初始化**==
     - 当刨建子类对象时，不管使用子类的哪个构造器，默认情况下总会去**自动**调用父类的无参构造器,
     - 如果父类没有提供无参构造器，则必须在子类的构造器中用 super去指定使用父类的哪个构造器完成对父类的初始化工作，否则，编译不会通过[举例说明]
     - 如果希望指定去调用父类的某个构造器，则显式的调用一下。super();
     - super在使用时，需要放在构造器第一行
     - super();只能在构造器中使用，super();和this();都是构造器间的相互访问的语法。
     - super()和this()都只能放在构造器第一行，因此这两个方法不能共存在一个构造器
  3. Java中所有类都是Object的子类
  4. 父类构造器的调用不限于直接父类！将一直往上追溯，直到 Object类项级父类
  5. 子类最多只能继承一个父类(指直接继承)，即java中是单继承机制。
      思考:如何让A类继承B类和C类?
  6. 不能滥用继承，子类和父类之间必须满足is-a的逻辑关系。
    - 例如，小学生、高中生和初中生都是学生。但是老师不能继承学生。

- 继承的本质

  - 0291 java继承本质详解： [【零基础 快速学Java】韩顺平 零基础30天学会Java_哔哩哔哩_bilibili](https://www.bilibili.com/video/BV1fh411y7R8?p=294&spm_id_from=pageDriver)
  - 如果子类和父类中都有name属性;
    - 通过子类调用name属性时，遵循以下情况【就近原则】
      - //2->这时请大家注意，要按照查找关系来返回信息
      - //(1)首先看子类是否有该属性
      - //(2)如果子类有这个属性，并且可以访问，则返回信息。如果该属性在里面**被private锁定**，如果没有公共方法调用，就不会返回，也不能去找上级父类中的name。
      - //(3)如果子类没有这个属性，就看父类有没有这个属性，并且可以访问,则返回信息。
      - 如果没有，继续往上找。

- 练习

  - ```java
    class A {
        A(){ System.out.println("a");}
        A(String name){ System.out.println("a name"); }
    }
    
    class B extends A{
        B(){ this("abc");System.out.println("b"); }
        B(String name){ System.out.println("b name"); }
    }
    ```

    - 上述代码在main中B b = new B();，输出的值是：a    b name    b

  - 注意：

    - this();和super();不能在同一个构造器中存在。
    - 如果一个构造器中存在this();……隐性的super()【默认调用父类中的无参构造器】;也会随之销毁。

  

##### 0032 super关键字

- 基本介绍
  - super代表父类的引用,用于访问父类的属性、方法、构造器
  - super();只能在构造器中使用，但是`super.`可以在其他地方使用
  
- 基本语法
  com. hspedu super包下 Super01java
  1. 访问父类的属性，但不能访问父类的 private属性[案例]
     supe.属性名
  2. 访问父类的方法，不能访问父类的 private方法
     supe方法名(参数列表);
  3. 访问父类的构造器(这点前面用过):
     super(参数列表)只能放在构造器的第一句，只能出现一句!

- 细节

  1. 调用父类的构造器的好处(分工明确，父类属性由父类初始化，子类的属性由子类初始化)

  2. 当子类中有和父类中的成员(属性和方法)重名时，为了访问父类的成员，必须通过 super。如果没有重名,使用 super、this、直接访问是一样的效果![举例

     - 父类中有一个**非私有**的cal(){}方法，

       - 如果子类中没有和cal同名的方法，要调用父类中的cal(){}方法，可以用以下的办法

         - ```java
           cal();//第一种：
           this.cal();//第二种
           super.cal();//第三种，直接查找父类
           ```

         - 第一种和第二种的逻辑是，从子类一直向上级父类查找cal()方法，**就近原则**，调用最近的cal()方法

           - 🌹就近原则，如果就近的被**private**修饰，==则会报错==，不会向上寻找没有被private修饰的属性或者方法

         - 第三种`super.cal();`的逻辑：跳过本类的查找，直接去父类查找该方法。就算子类中有同名的cal()方法，也不会去调用子类中的该方法

         - ==对于属性的调用，逻辑也是如此==

       - 如果子类中有和cal同名的方法，

         - 要调用父类中的cal(){}方法，可以用以下的办法

           ```java
           super.cal();
           ```

         - 要调用子类的cal()方法

           ```java
           cal();//第一种
           this.cal()//第二种
           ```

           

- ![image-20210924164034458](https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109241640645.png)

- super和this的比较

  | No.  |    区别    | this                                           | super                                            |
  | :--: | :--------: | ---------------------------------------------- | ------------------------------------------------ |
  |  1   |  访问属性  | 访问本类中的属性，如果没有，则从父类中继续查找 | 直接从父类查找属性，如果没有，继续往上级父类查找 |
  |  2   |  调用方法  | 访问本类中的方法，如果没有，则从父类中继续查找 | 直接从父类查找属性，如果没有，继续往上级父类查找 |
  |  3   | 调用构造器 | 调用本类的构造器，必须放在第一行               | 调用父类构造器，必须放在子类构造器的第一行       |
  |  4   |    特殊    | 表示当前对象                                   | 子类中访问父类的对象                             |

  - 注意✨：被private修饰的属性或者成员方法遵循以上规则，只是会报错，
    - 即："爷类"、父类和子类都有，但是父类中的被private了。在子类中调用时，**会直接报错，**而不会跳过父类被private修饰的xx，跑去"爷类"找xx

- 类的定义

  - ![image-20210925205540330](https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109252056309.png)

##### 0033 方法重写

- 基本介绍overrides
  - 简单的说：方法覆盖(重写)就是子类有一个方法和父类的某个**方法的名称**、**返回类型**[特殊讲解]、**参数**一样，
  
  - 那么我们就说子类的这个**方法覆盖**了父类的那个方法。
  
  - ```java
    class Animal {
        //父类属性
        String name;
        //写一个动物会叫的方法
        public void speak(){
            System.out.println("动物都会叫");
        }
    }
    public class Dog extends Animal{
    //    因为Dog是 AnimaL子类
    //    Dog的speak方法和 AnimaL的speak定义形式一样(名称、返回类型、参数)
        //所以称Dog子类中的方法speak是对父类Animal中speak方法重写
    
        public void speak(){
            System.out.println("狗会汪汪叫");
        }
    }
    ```
  
- 细节

  1. 子类的方法的**参数方法名**称要和父类方法的参数方法名称完全一样。

  2. 子类方法的**返回类型**和父类方法返回类型一样，或者是父类返回类型的子类

     - 比如父类返回类型是 Object，子类方法返回类型是 String

     - ```java
       public Object getInfo(){
           public String getInfo(){}
           ==String是Object的子类，构成方法重写==
       ```

  3. 子类方法不能**缩小**父类方法的**访问权限**【演示】

     - 【public > protected > 默认 > private】

     - ```java
       public void sayok(){}//父类中
       private void sayok(){}//子类中
       ==public->privte,权限缩小，不构成方法重写
       ```

  4. 案例

     - 父类

       ```java
       public class Animal {
           //父类属性
           String name;
           //写一个动物会叫的方法
           public void speak(){
               System.out.println("动物都会叫");
           }
           void run(){
               System.out.println("动物会跑");
           }
           public Object eat(){
               System.out.println("动物要吃事物");
               return null;
           }
       }
       ```

     - 子类

       ```java
       public class Dog extends Animal{
       //    因为Dog是 AnimaL子类
       //    Dog的speak方法和 AnimaL的speak定义形式一样(名称、返回类型、参数)
           //所以称Dog子类中的方法speak是对父类Animal中speak方法重写
           //1.访问权限不变，返回类型一样，方法名一样，形参一样--方法重写
           public void speak(){
               System.out.println("狗会汪汪叫");
           }
           //2.访问权限提升，返回类型一样，方法名一样，形参一样--方法重写
           protected void run(){
               System.out.println("狗会跑");
           }
           //3.访问权限不变，返回类型(Object->String,String是Object的子类)，方法名一样，形参一样--方法重写
           public String eat(){
               System.out.println("狗咬吃屎");
               return null;
           }
           //4.只要在上述集中条件内，各种组合，也同样是方法重写
       }
       ```

- 方法重载和重写的比较

  - ![image-20210925215042607](https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109252150784.png)

##### 0034 多态

- polymorphic

###### 对象的多态

- 功能：提高代码的复用性，利于代码的维护

- 基本介绍
  - 方法或对象具有多种形态。是面向对象的第三大特征，多态是建立在封装和继承基础之上的
  
- 多态的具体体现
  - 对象的多态(核心,)
  - 重要的几句话:
    1. 一个对象的编译类型和运行类型可以不一致
    2. 编译类型在定义对象时，就确定了，不能改变
    3. 运行类型是可以变化的
    4. 编译类型看定义时=号的左边，运行类型看=号的右边
  - `Animal animal= new Dog();【` animal编译类型是 Animal，运行类型Dog】
    `animal = new Cat();`【 animal的运行类型变成了cat，编译类型仍然是 Animal】
  
- 注意事项和细节 Poly Detail, java
  - 多态的前提是:两个对象类存在继承关系
  - 多态的向上转型
  1. 本质:父类的引用指向了子类的对象
  2. 语法：父类类型  引用名 =  new 子类类型();
       - `Animal animal= new Dog();`
  3. 特点：编译类型看左边，运行类型看右边。
       - 可以调用父类中的所有成员(需遵守访问权限)
       - 不能调用子类中特有成员
            - 因为在编译阶段，能调用哪些的成员。是由编译类型决定的
       - 最终运行效果看子类的具体实现，即调用方法时,按照从子类(运行类型)开始查找方法后调用，规则我前面我们讲的方法调用规则一致。
  
  - 多态的向下转型
  
    - 语法：子类类型 引用名 =  (子类类型) 父类引用
  
      - `Animal animal= new Dog();`给animal向下转型：
      - `Dog dog = (Dog) animal;`
  
    - 只能强转父类的引用，不能强转父类的对象
  
    - 要求父类的引用必须指向的是当前目标类型的对象
  
    - 当向下转型后，可以调用子类类型中所有的成员
  
      - ```java
        Animal animal = new Cat();//向下转型
        animal.eat();
        animal.run();
        animal.sleep();
        // animal.catchMoused();//不能访问的原因：编译编译类型Animal中没catchMoused()
        
        //如果想要访问catchMoused()方法，就需要对animal对象进行向下转型
        Cat cat = (Cat) animal;
        cat.catchMoused();
        ```
  
  - 属性没有重写之说，属性的值只和编译类型有关
  
  - instanceof比较操作符，用于判断**对象的运行类型**是否为Xx类型或Xx类型的子类型
  
    - ```java
      public class InstanceOf_ {
          public static void main(String[] args) {
              BB b = new BB();
              System.out.println(b instanceof AA);
              System.out.println(b instanceof BB);
      
              AA ab = new BB();
              System.out.println(ab instanceof AA);
              System.out.println(ab instanceof BB);
          }
      }
      class AA{
      }
      class BB extends AA{
      }
      ```
  
      

###### Java的动态绑定机制✨✨

- dynamic binding
  1. 当调用**对象方法**的时候，该方法会和该对象的内存地址/运行类型绑定
  2. 当调用**对象属性**时，没有动态绑定机制，哪里声明，那里使用
- 多态数组的学习 [PloyArray.java](https://gitee.com/song-zhangyao/study/tree/master/Java%20Learning/JavaCode/src/Day_07/polymorphisc_/Exercise02)
- 多态参数的学习 [PloyParameter.java](https://gitee.com/song-zhangyao/study/tree/master/Java%20Learning/JavaCode/src/Day_07/polymorphisc_/Exercise03)

##### 0035 Object的详解

###### equals方法

-  **==和equals的对比**

  1. ==: 既可以判断基本类型，又可以判断引用类型
  2. ==: 如果判断基本类型，判断的是值是否相等。示例:inti=10;doub|ed=10.0;
  3. ==: 如果判断引用类型，判断的是地址是否相等，即判定是不是同一个对象【案例说明

- equals方法

  - equals:  是 Object类中的方法，只能判断类型，**如何看Jdk源码**，看老师演示:
  - 默认判断的**地址**是否相等，子类中往往重写该方法，用于判断内容是否相等。
    - 比如Integer， String【看看 String和 Integer的 equals源代码】

- ldea如何查看Jdk源码

  1. 一般来说IDEA配置好JDK以后，jdk的源码也就自动配置好了；
  2. 如果没有的话点击菜单File-> Project Structure->SDKs-> Sourcepath然后点击右侧绿色的加号。
  3. 在需要查看某个方法源码时,将光标放在該方法，输入Ctrl+b即可；或者在方法点击右键->goto-> Declaration or。

- 子类重写equals方法

  - 在Object类中的equals

    ```java
    public booLean equals(Object obj){
    	return (This = obj)    
    }
    ```

  - 在String类中，对equals方法重写

    ```java
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject instanceof String) {
            String aString = (String)anObject;
            if (!COMPACT_STRINGS || this.coder == aString.coder) {
                return StringLatin1.equals(value, aString.value);
            }
        }
        return false;
    }
    ```

- ```java
  Person p1 = new Person();
  p1.name ="hspedu";
  Person p2 = new Person();
  p2.name ="hspedu";
  
  System.out.println(p1==p2);//false
  System.out.println(p1.name.equals( p2.name));//true
  System.out.println(p1.equals(p2));//false
  String s1 = new String("asdf");
  String s2 = new String("asdf" );
  System.out.println(s1.equals(s2));//true
  System.out.println(s1==s2);//false
  ```

  

###### hashCode方法

1. 返回对象的哈希码值

2. 提高具有哈希结构的容器的效率!

3. 两个引用,  如果指向的是同一个对象,  则哈希值肯定是一样的!

4. 两个引用,  如果指向的是不同对象,  则哈希值是不一样的

5. 哈希值主要根据地址号来的!  不能完全将哈希值等价于地址。

6. 案例演示[ Hash Codejava]: obj. hash Code0[测试:Aobj1= new A(;Aobj=newA0;Aobj3=obj1

7. 后面在集合,  中 hash Code如果需要的话,  也会重写

   ```java
   A a1 = new A();
   A a2 = new A();
   System.out.println("a1.hashCode="+a1.hashCode());//2003749087
   System.out.println("a2.hashCode="+a2.hashCode());//1480010240
   A a3 = a1;
   System.out.println("a3.hashCode="+a3.hashCode());//2003749087,同一个对象的hashCode一样
   ```

###### toString方法

- 基本介绍

  - 默认返回：全类名+@+哈希值的十六进制,【查看 Object的 toString方法】
    子类往往重写 toString方法，用于返回对象的属性信息

  - Object中toString方法源码

    ```java
    public String toString() {
          return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    ```

    - Integer.toHexString(hashCode()):将对象hashCode值转为16进制字符串

    - 示例

      ```java
      System.out.println("a3.hashCode="+a3.hashCode());
      //2003749087,同一个对象的hashCode一样
      System.out.println("a3.hashCode="+a3.toString());
      //a3.hashCode=Day_07.hashcode_.A@776ec8df,  a3.hashCode()的16进制
      ```

  - 全类名：包名+类名

  - 重写 toString方法，打印对象或拼按对象时，都会自动调用该对象的 toString形式
    案例演示: Monster[name,job,Sal]案例: ToString java

  - 当直接输出一个对象时, toString方法会被默认的调用

- toString方法的重写

  - IDEA中的快捷键：ALT+insert

  - 重写后，一般是把属性输出，当然程序员也可以自己定制

    - ```java
      public class ToString_ {
          String name;
          int age;
      
          @Override
          public String toString() {
              return "ToString_{" +
                      "name='" + name + '\'' +
                      ", age=" + age +
                      '}';
          }
      }
      ```

###### finalize 方法

- 垃圾回收器

- 当对象被回收时，系统自动调用该对象的 finalize方法。子类可以重写该方法
  - 做一些释放资源的操作【演示】    
- 什么时候被回收:当某个对象没有任何引用时，则jvm就认为这个对象是一个垃圾对象，就会使用垃圾回收机制来销毁该对象，在销毁该对象前，会先调用finalize方法。
- 垃圾回收机制的调用，是由系统来决定，也可以通过 System. gc()主动触发垃圾回收机制，
  - 测试:Car[name]

##### 0036 断点调试

- DeBug
- 一个实际需求
  - 在开发中，新手程序员在查找错误时，这时老程序员就会温馨提示，可以用断点调试，一步一步的看源码执行的过程，从而发现错误所在。
  2. 重要提示: 在断点调试过程中，==是运行状态==，是以对象的**运行类型**来执行的
  A extends B; B b= new A(); b.xx();

- 断点调试介绍
  1. 断点调试是指在程序的某一行设置一个断点，调试时，程序运行到这一行就会停住，然后你可以一步一步往下调试，调试过程中可以看各个变量当前的值，出错的话，调试到出错的代码行即显示错误，停下。进行分析从而找到这个Bug。
  2. ==断点调试是程序员必须掌握的技能==。
  3. 断点调试也能帮助我们查看java底层源代码的执行过程，提高程序员的Java水平。

- 断点调试快捷键
  - F7(跳入)、F8(过) 、shift+F8(跳出)、F9(resume，执行到下一个断点)
  - F7：跳入方法内
  - F8：逐行执行代码
  - shift+F8：跳出方法
- 演示如何追源代码
  - 小技巧：将光标放在某个变量上，可以看到最新的数据
- 断点可以动态的加入

##### 0037 零钱通

- 项目：零钱通

- 项目开发流程

  - 项目需求：使用Java开发零钱通项目，可以完成收益入账，消费，查看明细，退出系统等功能

  - 项目界面：

    <img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109270013441.png" alt="image-20210927001346187" style="zoom:50%;" />

  - 具体步骤

    1. 完成显示菜单，给出对应提示信息
    2. 完成零钱通明细
    3. 完成收益入账
    
  - 面向过程代码：[SmallChangeSys.java](https://gitee.com/song-zhangyao/study/blob/master/Java%20Learning/JavaCode/src/Day_07/changepass/SmallChangeSys.java)
  
  - 面向对象代码：[SmallChangeSysOOP.java](https://gitee.com/song-zhangyao/study/blob/master/Java%20Learning/JavaCode/src/Day_07/changepass/SmallChangeSysOOP.java)

##### Day07-Homewrk

1. 定义一个 Person类{name,age,job}，初始化 Person对象数组，有3个 person对象，并按照age从大到小进行排序提示，使用冒泡排序 Homework01.java

2. 写出四种访问修饰符和各自的访问权限 Homework02.java

3. 编写老师类 Homework03.java

   (1)要求有属性“姓名name”，“年龄age”，“职称post”，“基本工资 salary”

   (2)编写业务方法， introduce()，实现输出一个教师的信息。

   (3)编写教师类的三个子类:  教授类、副教授类、讲师类。工资级别分别为:教授为1.3、副教授为1.2、讲师1.1。在三个子类里面都重写父类的 introduce()方法。

   (4)定义并初始化一个老师对象，调用业务方法，实现对象基本信息的后台打印

4. 通过继承实现员工工资核算打印功能Homework04.java
   父类：员工类
   子类：部门经理类、普通员工类

   (1)部经理工资=1000+单日工资*天数*等级(1.2)。

   (2)普通员工工资=单日工资*天数*等级(1.0)

   (3)员工属性：姓名，单日工资，工作天数

   (4)员工方法(打印工资)

   (5)普遍员工及部门经理都是员工子类，需要重写打印工资方法。

   (6)定义并初始化普通员工对象，调用打印工资方法输入工资，定义并初始化部门经理对象调用打印工资方法输入工资。

5. 设计父类一员工类。子类:工人类、农民类、教师类、科学家类、服务生类。

   (1)其中工人、农民、服务生只有基本工资

   (2)教师除基本工资外还有课酬(元/天)

   (3)科学家除基本工资外还有年终奖

   (4)编写一个测试类将各种类型的员工的全年工资打印出来

9. 设计一个 Point类，其x和y坐标可以通过构造器提供。提供一个子类 LabeledPoint，其构造器接受一个标签值和x、y坐标，比如 new LabeledPoint((" BlackThursday"，1929，230.07)，写出对应的构造器即可

10. 编写 Doctor类{name，age，job， gender，sal}，相应的 getter()和 setter()方法，5个参数的构造器，重写父类的 equals(),

    方法: public boolean equals( Object obj)，并判断测试类中创建的两个对象是否相等。相等就是判断属性是否相同

11. Homework11.java

    <img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109272220519.png" alt="image-20210927222001370" style="zoom: 50%;" />

    - p不能调用子类中的study方法，因为编译类型是父类

      ```java
      Father f = new Son();
      //f.study();//f的编译类型是Father，不能调用子类中特有的方法，
      f.run();//运行类型是Son，调用时，先从子类中查找run方法
      Son s = (Son)f;//向下转型后，编译类型编程了Son，可以调用子类中的特有方法
      s.study();
      ```

12. ==和equals的区别

    |  名称  | 概念                                   | 用于基本数据类型 | 用于引用类型                                                 |
    | :----: | -------------------------------------- | ---------------- | ------------------------------------------------------------ |
    |   ==   | 比较运算符                             | 判断值是否相等   | 判断两个对象是否相等                                         |
    | equals | Object的一个方法，Java中的类都可以使用 | 不可以           | 默认判断两个对象是否相等，子类往往重写该方法，比较对象的属性是否相等 |

13. Homework13.java

    ![image-20210927104512638](https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109271045774.png)

11. Homework14.java

- Don't let inertia destroy yourself！

#### Day-08 房屋出租系统

- 项目需求说明House rental system

  - 实现基于文本界面的《房屋出租软件》。
  - 能够实现对房屋信息的添加、修改和删除(用数组实现)，并能够打印房屋明细表。
  - CRUD:增删改查

- 项目界面--

  1. 主菜单

   <img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109272347110.png" alt="image-20210927234711030" style="zoom:50%;" />

  2. 新增房源<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109280009203.png" alt="image-20210928000949118" style="zoom: 33%;" />
  3. 查找房源<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109280010455.png" alt="image-20210928001051343" style="zoom: 33%;" />
  4. 删除房源<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109280012895.png" alt="image-20210928001204743" style="zoom: 33%;" />
  5. 修改房源<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109280013687.png" alt="image-20210928001334531" style="zoom: 33%;" />
  6. 房屋列表<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109280015884.png" alt="image-20210928001503783" style="zoom: 33%;" />
  7. 退出系统<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202109280015051.png" alt="image-20210928001537979" style="zoom:33%;" />

-----

- 项目设计
  - 程序框架图（分层设计，模式管理）
  - 相关的类
    - HouseView.java【页面】
      1. 显示界面
      2. 接收用户的输入
      3. 调用其他类完成一定的功能
    - HouseService.java【业务层】
      1. 响应HouseView.java的调用
      2. 完成对房屋信息的各种操作(增删改查[CRUD])
    - House.java【domain实体层】
      1. 一个house对象就表示一个房屋->及其信息
    - HouseRentalApp.java
      - main方法创建，程序入口
    - Utility.java工具类
      - 获取用户各种输入。
      - 静态方法可以通过类名直接调用：Array.sort();
