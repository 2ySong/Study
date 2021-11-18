# Python基础

## day-01 介绍Python

### 1.1 语言介绍

解释性语言。

## day-02 变量和数据类型

### 2.1 变量

格式：变量名 = 值

**命名规则**：

- 见名之意
- 字母、数字、_。
- 不能以数字开头
- 严格区分大小写
- ==小驼峰==：minNum
- 不能用关键字和保留字

### 2.2 基本语法

#### 行与缩进

- python最具特色的就是使用缩进来表示代码块，不需要使用大括号 **{}** 。
- 缩进的空格数是可变的，但是同一个代码块的语句必须包含相同的缩进空格数。实例如下：

```python
if True:    print ("True") else:    print ("False")
```

以下代码最后一行语句缩进数的空格数不一致，会导致运行错误：

```python
if True:
  print ("Answer")
  print ("True")
else:
  print ("Answer")
 print ("False")   # 缩进不一致，会导致运行错误**
```

以上程序由于缩进不一致，执行后会出现类似以下错误：

```python
 File "test.py", line 6
    print ("False")    # 缩进不一致，会导致运行错误
                                      ^
IndentationError: unindent does not match any outer indentation level
```

------

#### 多行语句

Python 通常是一行写完一条语句，但如果语句很长，我们可以使用反斜杠 **\** 来实现多行语句，例如：

```python
total = item_one + \
        item_two + \
        item_three
```

在 [], {}, 或 () 中的多行语句，不需要使用反斜杠 \，例如：

```python
total = ['item_one', 'item_two', 'item_three',
        'item_four', 'item_five']
```

---

#### 转义字符

|  转义字符   |  描述  |
| :---------: | :----: |
| \(在行尾时) | 续行符 |
|    `\\`     | 反斜杠 |
|    `\'`     | 单引号 |
|    `\"`     | 双引号 |
|    `\b`     |  退格  |
|    `\n`     |  换行  |
|    `\t`     | 制表符 |
|    `\r`     |  回车  |



### 2.2 数据类型

<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111171923776.png" alt="image-20211115172348926" style="zoom:33%;" />

#### 数字(Number)类型

python中数字有四种类型：整数、布尔型、浮点数和复数。

- **int** (整数), 如 1, 只有一种整数类型 int，表示为长整型，没有 python2 中的 Long。
- **bool** (布尔), 如 True。False
- **float** (浮点数), 如 1.23、3E-2
- **complex** (复数), 如 1 + 2j、 1.1 + 2.2j

------

#### 字符串(String)

- python中单引号和双引号使用完全相同。
- 使用三引号(**'''** 或 **"""**)可以指定一个多行字符串。
- 转义符 \
- 反斜杠可以用来转义，使用r可以让反斜杠不发生转义。。 如 r"this is a line with \n" 则\n会显示，并不是换行。
- 按字面意义级联字符串，如"this " "is " "string"会被自动转换为this is string。
- 字符串可以用 + 运算符连接在一起，用 * 运算符重复。
- Python 中的字符串有两种索引方式，从左往右以 0 开始，从右往左以 -1 开始。
- Python中的字符串不能改变。
- Python 没有单独的字符类型，一个字符就是长度为 1 的字符串。
- 字符串的截取的语法格式如下：**变量[头下标:尾下标:步长]**

```python
word = '字符串'
sentence = "这是一个句子。"
paragraph = """这是一个段落，
可以由多行组成"""
poem = '''
	hhh
	jjj kk
	我的格式不会变
'''
```

- 实例

  ```python
  str = '123456789'
  
  print(str)  # 输出字符串
  print(str[0:-1])  # 输出第一个到倒数第二个的所有字符
  print(str[0])  # 输出字符串第一个字符
  print(str[2:5])  # 输出从第三个开始到第五个的字符
  print(str[2:])  # 输出从第三个开始后的所有字符
  print(str[1:5:2])  # 输出从第二个开始到第五个且每隔一个的字符（步长为2）
  print(str * 2)  # 输出字符串两次
  print(str + '你好')  # 连接字符串
  
  print('------------------------------')
  
  print('hello\nrunoob')  # 使用反斜杠(\)+n转义特殊字符
  print(r'hello\nrunoob')  # 在字符串前面添加一个 r，表示原始字符串，不会发生转义
  ```

**用户输入**

执行下面的程序在按回车键后就会等待用户输入：

```python
input("\n\n按下 enter 键后退出。")
```

以上代码中 ，"\n\n"在结果输出前会输出两个新的空行。一旦用户按下 enter 键时，程序将退出。

- 同一行显示多条语句
  - Python 可以在同一行中使用多条语句，语句之间使用分号 **;** 分割，以下是一个简单的实例：

	```python
  import sys; x = 'runoob'; sys.stdout.write(x + '\n')
  ```
  
  

- 以下代码可以得出一个变量的数据类型--type函数

  ```python
  loop = 1
  print(type(loop))
  loop = 8.977
  print(type(loop))
  loop = 'hello'
  print(type(loop))
  ```

  - 变量的类型可以改变。

#### boolean类型

```python
loop = True
loop = False
```

---

### 2.3 输出语句--print

**print** 默认输出是换行的，如果要实现不换行需要在变量末尾加上 **end=""**：

**实例**

```python
x = "a"
y = "b"
# 换行输出
print(x)
print(y)
print('---------')
# 不换行输出
print(x, end=" ")
print(y, end=" ")
print()
```

```python
print(1,2,3,'szy')#1 2 3 szy
print(1,2,3,'szy',sep='$')#1$2$3$szy,sep可以指定隔断符
```

### 2.4 输入语句--input

```python
name = input('请输入你的名字: ')
print(name)
```



### 2.5 import 与 from...import

在 python 用 **import** 或者 **from...import** 来导入相应的模块。

- 将整个模块(somemodule)导入，格式为： **import somemodule**
- 从某个模块中导入某个函数,格式为： **from somemodule import somefunction**
- 从某个模块中导入多个函数,格式为： **from somemodule import firstfunc, secondfunc, thirdfunc**
- 将某个模块中的全部函数导入，格式为： **from somemodule import \***

导入 sys 模块

```python
import sys print('==Python import mode=========') 
print ('命令行参数为:') 
for i in sys.argv:   
    print (i) 
    print ('\n python 路径为',sys.path)
```

导入 sys 模块的 argv,path 成员

```python
from sys import argv,path 
#  导入特定的成员 
print('=====python from import===')
print('path:',path)# 因为已经导入path成员，所以此处引用时不需要加sys.path
```

---

### 2.5 类型转换

```python
str2 = '1000'
num = int(str2)
sum = num * 2
print(sum)
str1 = "hhh" + str(sum)
print(str1)
f = 8.9
print(f)
print(int(f))
flag = True
print(flag)
print(int(flag))#1
print(bool(5))#True
print(bool(0))#False
```

- 注意，int与布尔类型的转换，0代表False，其他的整型代表True
- 空字符串也是False

---

## day-03 运算符

### 3.1 算术运算符

以下假设变量 **a=10**，变量 **b=21**：

| 运算符 | 描述                                            | 实例               |
| :----- | :---------------------------------------------- | :----------------- |
| +      | 加 - 两个对象相加                               | a + b 输出结果 31  |
| -      | 减 - 得到负数或是一个数减去另一个数             | a - b 输出结果 -11 |
| *      | 乘 - 两个数相乘或是返回一个被重复若干次的字符串 | a * b 输出结果 210 |
| /      | 除 - x 除以 y                                   | b / a 输出结果 2.1 |
| %      | 取模 - 返回除法的余数                           | b % a 输出结果 1   |
| **     | 幂 - 返回x的y次幂                               | a**b 为10的21次方  |
| //     | 取整除 - 向下取接近商的整数                     | 9//2=4   -9//2= -5 |

- //相当于java中的/

```python
number = int(input("请输入一个三位数，将输出它的三个数:"))
print('百位:',number // 100)
print('十位:',number % 100 // 10)
print('个位:',number % 10)
print(2**5)#2^5
print(5/2)#2.5
print(5//2)#2
```



### 3.2 关系运算符

```python
'''
    关系运算符:
        结果：True，False
    > < >= <= == != is
'''
a = 10
b = 23
print(a == b)#False
print(a >= b)#Fasle
print(a <= b)#True
print(a > b)#False
print(a < b)#True
print(a != b)#True
print(a is b)#False
```

字符串比较：

- 比较的是每个字符的ASCII值。相同长度，一个一个比较。如果第一个字符就能比较，后面的就不会比较了。

- 不同长度：短的那个字符串差的ASCII就是0

在python可以用这种形式比较：`2 < a < 4`

### 3.3 逻辑运算符

Python语言支持逻辑运算符，以下假设变量 a 为 10, b为 20:

| 运算符 | 逻辑表达式 | 描述                                                         | 实例                    |
| :----- | :--------- | :----------------------------------------------------------- | :---------------------- |
| and    | x and y    | 布尔"与" - 如果 x 为 False，x and y 返回 x 的值，否则返回 y 的计算值。 | (a and b) 返回 20。     |
| or     | x or y     | 布尔"或" - 如果 x 是 True，它返回 x 的值，否则它返回 y 的计算值。 | (a or b) 返回 10。      |
| not    | not x      | 布尔"非" - 如果 x 为 True，返回 False 。如果 x 为 False，它返回 True。 | not(a and b) 返回 False |

```python
print(5 or 1)#5
print(1 or 5)#1
print(True or False)#True
print(0 or 9)#9
```



### 3.5 进制转换

<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111171923779.png" alt="image-20211116214555566" style="zoom:50%;" />

```python
a = 10
print(bin(a))  # 0b1010
b = 0b1010
print(int(b))  # 10
print(oct(a))  # 0o12
print(hex(a))  # 0xa
c = 0xa
print(bin(c))  #0b1010
print(bin(-2)) #-0b10
```

---

### 3.6 位运算符

按位运算符是把数字看作二进制来进行计算的。Python中的按位运算法则如下：

下表中变量 a 为 60，b 为 13二进制格式如下：

```python
a = 0011 1100

b = 0000 1101

-----------------

a&b = 0000 1100

a|b = 0011 1101

a^b = 0011 0001

~a  = 1100 0011
```

| 运算符 |                             描述                             |                             实例                             |
| :----- | :----------------------------------------------------------: | :----------------------------------------------------------: |
| &      | 按位与运算符：参与运算的两个值,如果两个相应位都为1,则该位的结果为1,否则为0 |         (a & b) 输出结果 12 ，二进制解释： 0000 1100         |
| \|     | 按位或运算符：只要对应的二个二进位有一个为1时，结果位就为1。 |        (a \| b) 输出结果 61 ，二进制解释： 0011 1101         |
| ^      |       按位异或运算符：当两对应的二进位相异时，结果为1        |         (a ^ b) 输出结果 49 ，二进制解释： 0011 0001         |
| ~      | 按位取反运算符：对数据的每个二进制位取反,即把1变为0,把0变为1。**~x** 类似于 **-x-1** | (~a ) 输出结果 -61 ，二进制解释： 1100 0011， 在一个有符号二进制数的补码形式。 |
| <<     | 左移动运算符：运算数的各二进位全部左移若干位，由"<<"右边的数指定移动的位数，高位丢弃，低位补0。 |         a << 2 输出结果 240 ，二进制解释： 1111 0000         |
| >>     | 右移动运算符：把">>"左边的运算数的各二进位全部右移若干位，">>"右边的数指定移动的位数 |         a >> 2 输出结果 15 ，二进制解释： 0000 1111          |

- print('#'*20),表示输出20个#，字符串同理

### 3.7 身份运算符

身份运算符用于比较两个对象的存储单元

| 运算符 | 描述                                        | 实例                                                         |
| :----- | :------------------------------------------ | :----------------------------------------------------------- |
| is     | is 是判断两个标识符是不是引用自一个对象     | **x is y**, 类似 **id(x) == id(y)** , 如果引用的是同一个对象则返回 True，否则返回 False |
| is not | is not 是判断两个标识符是不是引用自不同对象 | **x is not y** ， 类似 **id(a) != id(b)**。如果引用的不是同一个对象则返回结果 True，否则返回 False。 |

**注：** [id()](https://www.runoob.com/python/python-func-id.html) 函数用于获取对象内存地址。

以下实例演示了Python所有身份运算符的操作：

```python
a = 20
b = 20
if (a is b):
    print("1 - a 和 b 有相同的标识")
else:
    print("1 - a 和 b 没有相同的标识")
    if (id(a) == id(b)):
        print("2 - a 和 b 有相同的标识")
    else:
        print("2 - a 和 b 没有相同的标识")
        # 修改变量 b 的值
        b = 30
        if (a is b):
            print("3 - a 和 b 有相同的标识")
        else:
            print("3 - a 和 b 没有相同的标识")
            if (a is not b):
                print("4 - a 和 b 没有相同的标识")
            else:
                print("4 - a 和 b 有相同的标识")
```

以上实例输出结果：

```
1 - a 和 b 有相同的标识
2 - a 和 b 有相同的标识
3 - a 和 b 没有相同的标识
4 - a 和 b 没有相同的标识
```

> is 与 == 区别：
>
> is 用于判断两个变量引用对象是否为同一个， == 用于判断引用变量的值是否相等。
>
> \>>>a = [1, 2, 3] >>> b = a >>> b is a  True >>> b == a True >>> b = a[:] >>> b is a False >>> b == a True

------

### 3.8 运算符优先级

以下表格列出了从最高到最低优先级的所有运算符：

| 运算符                   | 描述                                                   |
| :----------------------- | :----------------------------------------------------- |
| **                       | 指数 (最高优先级)                                      |
| ~ + -                    | 按位翻转, 一元加号和减号 (最后两个的方法名为 +@ 和 -@) |
| * / % //                 | 乘，除，求余数和取整除                                 |
| + -                      | 加法减法                                               |
| >> <<                    | 右移，左移运算符                                       |
| &                        | 位 'AND'                                               |
| ^ \|                     | 位运算符                                               |
| <= < > >=                | 比较运算符                                             |
| == !=                    | 等于运算符                                             |
| = %= /= //= -= += *= **= | 赋值运算符                                             |
| is is not                | 身份运算符                                             |
| in not in                | 成员运算符                                             |
| not and or               | 逻辑运算符                                             |



---

## day-04 流程控制

### 4.1 if~else语句

Python中if语句的一般形式如下所示：

```python
if condition_1:   
    statement_block_1 
elif condition_2: 
    statement_block_2 
else: 
    statement_block_3
```

- condition结果是一个bool类型。

- 如果 "condition_1" 为 True 将执行 "statement_block_1" 块语句
- 如果 "condition_1" 为False，将判断 "condition_2"
- 如果"condition_2" 为 True 将执行 "statement_block_2" 块语句
- 如果 "condition_2" 为False，将执行"statement_block_3"块语句

Python 中用 **elif** 代替了 **else if**，所以if语句的关键字为：**if – elif – else**。

**注意：**

- 1、每个条件后面要使用冒号 **:**，表示接下来是满足条件后要执行的语句块。
- 2、使用缩进来划分语句块，相同缩进数的语句在一起组成一个语句块。
- 3、在Python中没有switch – case语句。

实例：

```python
var1 = 100
if var1:
    print("if 表达式条件为 true")
    print(var1)

var2 = 0
if var2:
    print("if 表达式条件为 true")
    print(var2)
print("Good bye!")
```

- 随机数

  ```python
  ran = random.randint(1,10)
  ```

  返回[1,10]的随机整数

- 三元运算符：`变量 = 值1 if 条件 else 值2`

### 4.2 while循环

格式：

```python
while 判断条件(condition)：
    执行语句(statements)……
```

- 案例：

```python
a = 0
while a < 10:
    print(a+1,'---#')
    a += 1
```

**while 循环使用 else 语句**

- 如果 while 后面的条件语句为 false 时，则执行 else 的语句块。
- 语法格式如下：

```python
while <expr>:
    <statement(s)>
else:
    <additional_statement(s)>
```

- expr 条件语句为 true 则执行 statement(s) 语句块，如果为 false，则执行 additional_statement(s)。

- 案例：

  ```python
  count = 0
  while count < 5:
      print(count, " 小于 5")
      count = count + 1
  else:
      print(count, " 大于或等于 5")
  ```

- 简单语句组

  ```python
  while (flag): print ('欢迎访问菜鸟教程!')#代码很少时，可以写在同一行
  ```

- 打印1~50之间被3整除的数

  ```python
  print('1~50之间能被3整除的数字：')
  a = 1
  while a <= 50:
      if a % 3 == 0:
          print(' ',a)
      a += 1
  ```

- break：跳出整个循环

- continue：跳出本次循环

### 4.3 格式化format

**格式化**

- %d：十进制整型

- %.4f：保留4位小数的浮点型，其他位数同理

- %s：字符串

  ```python
  a = 9
  b = 9.89
  print("a=%d, b=%.5f"%(a,b))#a=9, b=9.89000
  print("%s"%a)#9
  ```

**format**

```python
'{参数序号: 格式化控制标记}'.format(填充内容)
```

案例：

```python
print('{0}说: {1}昨天来找{0}'.format('Jack','Tom'))#Jack说: Tom昨天来找Jack
```

格式化控制标记

| {序号 |  ：  |          填充          |            对齐            |        宽度        |         精度         |        类型}        |
| :---: | :--: | :--------------------: | :------------------------: | :----------------: | :------------------: | :-----------------: |
| 序号  | 冒号 | 用于填充补足的单个字符 | `<左对齐` `>右对齐``^居中` | 输出的字符串总长度 | 浮点数小数的保留位数 | 整数:d</br>浮点数:f |

### 4.4 for循环

格式

```python
for i in range(n):
    循环体
```

- range(n)：表示`i∈[0,n)`

- range(start,stop)：`i∈[strat,stop)`

- range(start,stop,step)：step表示跳数，

  - 类似于java中

    ```java
    for(int i=start,i<stop,i+=step){}
    ```

案例：

```python
for i in range(10):
    print((i + 1), ': hello ' + str(i))
for a in range(3, 10):
    print('*' * 5, str(a))
```

输出结果：<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111171923780.png" alt="image-20211116234239800" style="zoom:33%;" />

**for...else**:

```python
for c in range(1, 5):
    print('*' * c)
    if c == 3:
        break
else:
    print('#'*c)
```

- 注意：else里面的代码块也属于循环体，当break之后，也不会执行else里面的内容
- while...else同理

**掷色子游戏**：

```python
'''
    掷色子游戏
'''
import random

coins = 0
while True:
    win = ''
    if coins >= 5:
        yesGame = input('''
+-+-+-+-+-+-+-+-+-+-+-+-+
|                  😄x%d|
+   开始游戏: y          +
|   退出游戏: n          |
+-+-+-+-+-+-+-+-+-+-+-+-+       
    请输入你的选择: ''' % coins)
        if yesGame == 'n':
            print('游戏结束')
            break
        if yesGame == 'y':
            print('游戏开始: 一局游戏5个金币，获胜得7个金币，失败扣3个金币')
            coins -= 5
            ran1 = random.randint(1, 6)
            ran2 = random.randint(1, 6)
            guess = input('请猜大小(B/S): ')
            if (guess == 'B' and ran1 + ran2 > 6) or (guess == 'S' and ran1 + ran2 <= 6):
                win = '胜利'
                coins += 7
            else:
                win = '失败'
                coins -= 3
            print('''
+-+-+-+-+-+-+-+-+-+-+
|   游戏结果: %s    |
+       色子1: %d点   +
|       色子2: %d点   |
+-+-+-+-+-+-+-+-+-+-+
            ''' % (win, ran1, ran2))

    else:
        print('金币不够，需要充值')
        while True:
            addCoins = int(input('请输入你要充值的金币数(一元=一币, 充值金额只能是10的整数倍):'))
            if addCoins % 10 != 0:
                addCoins = 0
                print('失败：充值不符合规范！！')
            else:
                coins += addCoins
                yesNo = input('是否继续冲值?(y/n):')
                if yesNo == 'y':
                    print('请继续充值')
                    continue
                else:/
                    print('充值结束，你现在的金币余额为: %d' % coins)
                    break
```

- 乘法口诀表：

  ```python
  for i in range(1, 10):
      for j in range(1, i + 1):
          print('%d x %d = %d\t' % (j, i, i * j), end='')
      print()
  ```

  <img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111171923781.png" alt="image-20211117172105969" style="zoom:67%;" />

---

## day-05 字符串、列表、元组、字典、集合

### 5.1 字符串

![image-20211117210941218](https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111172109001.png)

注意：

- id函数：可以得出一个变量或值的地址。

- is比较的是地址

  ```python
  s1 = 'hello'
  s2 = s1
  s3 = 'hello'
  print(s1, s2, s3)
  print(id(s1))
  print(id(s2))
  print(id(s3))
  print(id(8))
  print(s1 is s2)  # True
  ```

  输出结果：<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111171923782.png" alt="image-20211117192300023" style="zoom:50%;" />

#### 1 字符串的索引

![image-20211117193327159](https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111172109002.png)

#### 2 字符串的切片

<img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111172109003.png" alt="image-20211117195808340" style="zoom:50%;" />

格式：

- `str[start,end]`

- `str[start:end:step]`

规则：左取右不取

返回从start到end-1以step为步长的字符串

- step:
  - 非负数：从左向右
  - 负数：从右到左

```python
'''
字符串的切片
'''
str = 'hello'
print(str[0:3:2])  # hl
print(str[1:3])  # el
print(str[:])  # hello
str1 = 'hello' + 'world'
print(str1)  # helloworld
print(str[-3:])  # ll0
print(str[::-2]) #olh
```

#### 3 字符串的连接

用+连接两个字符串

```python
str1 = 'hello' + 'world'
print(str1)  # helloworld
```

#### 4 字符串的分割

格式：`str.split(sep = None)`
返回由str根据sep被分割的部分组成的列表，默认以空格分隔

```python
words = 'Jack,Tom,Smith,Mary'
#根据','切割
names = words.split(',')
print(names[0])#Jack
print(names[2])#Smith
```

#### 5 字符串元素的替换

格式：`str.replace(old, new, count)`

count: 从左到右要替换的个数，默认全部替换

所有额old字符(串)被替换成new字符(串)

```python
oldWord = 'abcdeFab'
newWord = oldWord.replace('ab', 'SZY')
print(newWord)  # SZYcdeFSZY
```

#### 6 字符串元素的删除

格式：`str.strip(chars)`

不加参数，默认删除空格

从str中去除在其左右的chars字符

```python
word = 'aCDEFabHHHab'
print(word.strip('ab'))  # CDEFabHHH
```

#### 7 添加

格式：`str.join(iter)`

除最后，在iter的每个元素后面添加一个str

```python
word = 'hello'
print(','.join(word)) #h,e,l,l,o
```

#### 8 判断是否以chars结尾--endwith

```python
print(str.endswith('llo')) #True
```

#### 9 find函数

- find:  返回字符第一次出现的索引
- rfind:  返回字符最后一次出现的索引

```python
word = 'abcdbe'
print(word.find('b')) #1
print(word.rfind('b')) #4
```

#### 10 获取字符串的长度--len(str)

```python
print(len('hello'))
```

####  11 isalpha()、isdigit

- isalpha()：判断是否为纯字母

- isdigit()：判断是否为纯数字

- isalnum(): 是否只含字母或数字

- isspace()：是否是空格

- isupper()：所含字母是否全为大写

- islower()：所含字母是否全为小写

  ```python
  print('hello'.isalpha())  # True
  print('jj88'.isdigit())  # False
  ```

  

#### 12 format方法

![image-20211117213428878](https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111181714807.png)

---

### 5.2 列表

列表是最常用的 Python 数据类型，它可以作为一个方括号内的逗号分隔值出现。

创建一个列表，只要把逗号分隔的不同的数据项使用方括号括起来即可。如下所示：

```python
list1 = ['Google', 'Runoob', 1997, 2000] 
list2 = [1, 2, 3, 4, 5 ] 
list3 = ["a", "b", "c", "d"] 
list4 = ['red', 'green', 'blue', 'yellow', 'white', 'black']
```



------

#### 1 访问列表元素

> 注意：列表类似于C语言中的数组。但是一个列表的元素的数据类型可以不一样

与字符串的索引一样，列表索引从 **0** 开始，第二个索引是 **1**，依此类推。

通过索引列表可以进行截取、组合等操作。

列表也有反向索引，和字符串的索引一样，右→左，从-1开始。

```python
shop_list = ['白菜', '茄子', '猪肉', '土豆', '白菜', 2, True]
print(shop_list[0])
print(shop_list[-4])
print(shop_list[0:3:2])
print(shop_list.count('白菜'))  # 2
```

**遍历**：

两种遍历方式：

```python
for i in range(len(shop_list)):
    print(shop_list[i])
print('*'*10+'遍历2'+'*'*10)
for i in shop_list:
    print(i)
```

- 第二种类似于java中的增强for循环，字符串同理

#### 2 列表的添加--append

```python
'''
列表的添加
    1. append:追加
    2.
'''
list = [1, 2, 3, 4, 5, 6]
print(list)
list.append('白菜')
print(list)
list1 = ['黄瓜']
list2 = list1 + list  # 列表拼接
list1.extend(list)  # 列表拼接，和上面代码一样
print(list2)

```

#### 3 列表的嵌套

```python
list1 = [], list2 = [], list3 = []
list = [list1, list2, list3]
```

案例：

```python
good1 = ['白菜', 2.5, 5]
good2 = ['土豆', 5.5, 9]
good3 = ['西红柿', 7.8, 24]
goods = [good1, good2, good3]
print(goods)
for i in goods:
    print(i)
```

#### 4 列表的删除--pop\remove\clear

1. pop(index): 根据下标删除元素，返回的是该元素。不添加参数，表示默认从后依次删除
2. remove(value): 根据元素值删除(第一个)
3. del list[index]：删除元素
4. value in list: 判断元素是否在列表中
5. clear()：列表清空，只是列表元素没有了
6. del list：删除整个列表，执行该操作后，该列表会显示未定义

**重复元素的删除**：

```python
list1 = ['1土豆', '2白菜', '3萝卜', '1土豆', '4西红柿', '2白菜', '1土豆', 1, 1, 1]
print(list1)
for i in range(len(list1)):
    for j in list1[i + 1:len(list1)]:
        if list1[i] == j:
            list1.remove(j)
print(list1)
```

#### 5 列表的插队--insert

格式：`list.insert(index, value)`

- index: 插入后value的索引位置

- 插入后，其后面的元素全部向后退(索引+1)

  ```python
  list = [0, 1, 2, 3, 4]
  
  list.insert(1, 'hhhh')
  print(list)
  # [0, 'hhhh', 1, 2, 3, 4]
  ```

#### 6 查询列表元素的索引--index

格式：`list.index(value)`

将返回value在列表中的索引。若没有将报错。

类似于字符串中的find函数 

#### 7 列表的翻转--reverse

格式：`list.reverse()`

#### 8 返回列表元素的个数--count

格式：`list.count(value)`

#### 9 判断列表元素是否存在--in

```python
list = [0, 1, 2, 3, 4,1]

print(1 in list) #True
print(7 in list) #Fasle
```

- 字符串同样可以用该方法

#### 10 列表的排序--sort

格式：`list.sort()`：默认升序

- list.sort(reverse=True)：降序

- reverse=False或不写代表降序

  ```python
  '''
  列表的排序
  '''
  import random
  
  list = [1, 4, 6, 7, 2, 0, 8, -5]
  list.sort()
  print(list)
  #
  list_ran = []
  for i in range(8):
      list_ran.append(random.randint(-9, 10))
  list_ran.sort(reverse=True)
  print(list_ran)
  
  ```

  - 注意：python中两个变量交换值，可以用`a, b = b, a`

  - 和下面这种方式是一样的，底层调用也是这个

    ```python
    temp = a
    a = b
    b = temp
    ```

  - 其他的类似，如下交换

    <img src="https://gitee.com/song-zhangyao/mapdepot1/raw/master/typora/202111182200480.png" alt="image-20211118220017974" style="zoom:50%;" />

- 冒泡排序

  ```python
  list = [12, 3, 4, 5, -4, 0, 67, -3, 55]
  # 冒泡排序
  for i in range(len(list) - 1):
      for j in range(len(list) - 1 - i):
          if list[j] < list[j + 1]:  # <为降序，>为升序
              list[j], list[j + 1] = list[j + 1], list[j]
  ```

  

---

### 5.3 元组

#### 1 基本介绍--tuple

Python的元组和列表类似，不同之处在于元组的元素不能修改(增删改查)

元组使用小括号 **( )**，列表使用方括号 **[ ]**。

元组创建很简单，只需要在括号中添加元素，并使用逗号隔开即可。

```python
tup1 = ('Google', 'Runoob', 1997, 2000)
```

元组中只包含一个元素时，需要在元素后面添加逗号 **,** ，否则括号会被当作运算符使用：

```python
>>> tup1 = (50)
>>> type(tup1)   # 不加逗号，类型为整型
<class 'int'>

>>> tup1 = (50,)
>>> type(tup1)   # 加上逗号，类型为元组
<class 'tuple'>
```

元组的索引规则和列表一样

#### 2 修改元组

元组中的元素值是不允许修改的，但我们可以对元组进行**连接组合**，如下实例:

```python
tup1 = (12, 34.56)
tup2 = ('abc', 'xyz')  
# 以下修改元组元素操作是非法的。
# tup1[0] = 100 
# 创建一个新的元组
tup3 = tup1 + tup2 
print (tup3)
```

以上实例输出结果：

```
(12, 34.56, 'abc', 'xyz')
```

------

#### 3 删除元组--del

元组中的元素值是不允许删除的，但我们可以使用del语句来删除整个元组，如下实例:

```python
tup = ('Google', 'Runoob', 1997, 2000)  
print (tup) 
del tup 
print ("删除后的元组 tup : ") 
print (tup)
```

以上实例元组被删除后，输出变量会有异常信息，输出如下所示：

```
删除后的元组 tup : 
Traceback (most recent call last):
  File "test.py", line 8, in <module>
    print (tup)
NameError: name 'tup' is not defined
```

------

#### 4 元组运算符

与字符串一样，元组之间可以使用 + 号和 * 号进行运算。这就意味着他们可以组合和复制，运算后会生成一个新的元组。

| Python 表达式                  | 结果                         | 描述         |
| :----------------------------- | :--------------------------- | :----------- |
| len((1, 2, 3))                 | 3                            | 计算元素个数 |
| (1, 2, 3) + (4, 5, 6)          | (1, 2, 3, 4, 5, 6)           | 连接         |
| ('Hi!',) * 4                   | ('Hi!', 'Hi!', 'Hi!', 'Hi!') | 复制         |
| 3 in (1, 2, 3)                 | True                         | 元素是否存在 |
| for x in (1, 2, 3): print (x,) | 1 2 3                        | 迭代         |

------

#### 5 元组索引，截取

因为元组也是一个序列，所以我们可以访问元组中的指定位置的元素，也可以截取索引中的一段元素，如下所示：

元组：

```python
tup = ('Google', 'Runoob', 'Taobao', 'Wiki', 'Weibo','Weixin')
```

![img](https://www.runoob.com/wp-content/uploads/2016/04/py-tup-7.png)

| Python 表达式 | 结果                                            | 描述                                             |
| :------------ | :---------------------------------------------- | :----------------------------------------------- |
| tup[1]        | 'Runoob'                                        | 读取第二个元素                                   |
| tup[-2]       | 'Weibo'                                         | 反向读取，读取倒数第二个元素                     |
| tup[1:]       | ('Runoob', 'Taobao', 'Wiki', 'Weibo', 'Weixin') | 截取元素，从第二个开始后的所有元素。             |
| tup[1:4]      | ('Runoob', 'Taobao', 'Wiki')                    | 截取元素，从第二个开始到第四个元素（索引为 3）。 |

运行实例如下：

```python
>>> tup = ('Google', 'Runoob', 'Taobao', 'Wiki', 'Weibo','Weixin')
>>> tup[1]
'Runoob'
>>> tup[-2]
'Weibo'
>>> tup[1:]
('Runoob', 'Taobao', 'Wiki', 'Weibo', 'Weixin')
>>> tup[1:4]
('Runoob', 'Taobao', 'Wiki')
>>>
```



------

#### 6 元组内置函数

Python元组包含了以下内置函数

| 序号 | 方法及描述                               | 实例                                                         |
| :--- | :--------------------------------------- | :----------------------------------------------------------- |
| 1    | len(tuple) 计算元组元素个数。            | `>>> tuple1 = ('Google', 'Runoob', 'Taobao') >>> len(tuple1) 3 >>> ` |
| 2    | max(tuple) 返回元组中元素最大值。        | `>>> tuple2 = ('5', '4', '8') >>> max(tuple2) '8' >>> `      |
| 3    | min(tuple) 返回元组中元素最小值。        | `>>> tuple2 = ('5', '4', '8') >>> min(tuple2) '4' >>> `      |
| 4    | tuple(iterable) 将可迭代系列转换为元组。 | `>>> list1= ['Google', 'Taobao', 'Runoob', 'Baidu'] >>> tuple1=tuple(list1) >>> tuple1 ('Google', 'Taobao', 'Runoob', 'Baidu')` |

#### 7 关于元组是不可变的

所谓元组的不可变指的是==元组所指向的内存中的内容==不可变。

```python
>>> tup = ('r', 'u', 'n', 'o', 'o', 'b')
>>> tup[0] = 'g'   # 不支持修改元素
Traceback (most recent call last):
 File "<stdin>", line 1, in <module>
TypeError: 'tuple' object does not support item assignment
>>> id(tup)   # 查看内存地址
4440687904
>>> tup = (1,2,3)
>>> id(tup)
4441088800   # 内存地址不一样了
```

从以上实例可以看出，重新赋值的元组 tup，==绑定到新的对象了==，不是修改了原来的对象。

---

### 5.4 字典

#### 1 字典简介

字典是另一种==可变容器模型==，且可存储任意类型对象。

字典的每个键值 `key⇨value` 对用冒号 **:** 分割，每个对之间用逗号(**,**)分割，整个字典包括在花括号 `{}` 中 ,格式如下所示：

```python
d = {key1 : value1, key2 : value2, key3 : value3 }
```

 <img src="https://www.runoob.com/wp-content/uploads/2016/04/py-dict-3.png" alt="img" style="zoom: 75%;" />

==键必须是唯一的，但值则不必。==

值可以取任何数据类型，但==键必须是不可变的，如字符串，数字==。

一个简单的字典实例：

```python
dict = {'name': 'runoob', 'likes': 123, 'url': 'www.runoob.com'}
```

![img](https://www.runoob.com/wp-content/uploads/2016/04/py-dict-2.png)

也可如此创建字典：

```python
dict1 = { 'abc': 456 }
dict2 = { 'abc': 123, 98.6: 37 }
```

------

#### 2 创建空字典

使用大括号 **{ }** 创建空字典：

```python
# 使用大括号 {} 来创建空字典
emptyDict = {}
# 打印字典
print(emptyDict) #{}
 
# 查看字典的数量
print("Length:", len(emptyDict)) # 0
 # 查看类型
print(type(emptyDict)) # <class 'dict'>
```

使用内建函数 **dict()** 重建字典：

```python
emptyDict = dict()
# 打印字典
print(emptyDict)
# 查看字典的数量
print("Length:",len(emptyDict))
# 查看类型
print(type(emptyDict))
```

- 以上实例输出结果：

  ```
  {}
  Length: 0
  <class 'dict'>
  ```

#### 3 访问字典里的值

把相应的键放入到方括号中，如下实例:

```python
dict = {'Name': 'Runoob', 'Age': 7, 'Class': 'First'} 
print ("dict['Name']: ", dict['Name']) 
print ("dict['Age']: ", dict['Age'])
```

以上实例输出结果：

```
dict['Name']:  Runoob
dict['Age']:  7
```

如果用字典里没有的, 将会报错

---

#### 4 修改字典

向字典添加新内容的方法是增加新的键/值对，修改或删除已有键/值对；如下实例: 

```python
dict = {'Name': 'Runoob', 'Age': 7, 'Class': 'First'} 
dict['Age'] = 8           # 更新 Age 
dict['School'] = "菜鸟教程"  # 添加信息   
print ("dict['Age']: ", dict['Age']) 
print ("dict['School']: ", dict['School'])
```

以上实例输出结果：

```
dict['Age']:  8
dict['School']:  菜鸟教程
```

#### 5 删除字典元素

能删单一的元素也能清空字典，清空只需一项操作。

显示删除一个字典用del命令，如下实例：

```python
dict = {'Name': 'Runoob', 'Age': 7, 'Class': 'First'} 
del dict['Name'] # 删除键'Name' 
dict.clear()     # 清空字典 
del dict         # 删除字典 
print ("dict['Age']: ", dict['Age']) 
print ("dict['School']: ", dict['School'])
```

但这会引发一个异常，因为用执行 del 操作后字典不再存在：

```
Traceback (most recent call last):
  File "test.py", line 9, in <module>
    print ("dict['Age']: ", dict['Age'])
TypeError: 'type' object is not subscriptable
```

**注：**del() 方法后面也会讨论。

#### 6 字典键的特性

字典值可以是任何的 python 对象，既可以是标准的对象，也可以是用户定义的，但键不行。

两个重要的点需要记住：

1. 不允许同一个键出现两次。创建时如果同一个键被赋值两次，后一个值会被记住
2. ==键必须不可变==，所以可以用数字，字符串或元组充当，而用列表就不行

#### 7 字典内置函数&方法

Python字典包含了以下内置函数：

| 序号 | 函数及描述                                                   | 实例                                                         |
| :--- | :----------------------------------------------------------- | :----------------------------------------------------------- |
| 1    | len(dict) 计算字典元素个数，即键的总数。                     | `>>> dict = {'Name': 'Runoob', 'Age': 7, 'Class': 'First'} >>> len(dict) 3` |
| 2    | str(dict) 输出字典，可以打印的字符串表示。                   | `>>> dict = {'Name': 'Runoob', 'Age': 7, 'Class': 'First'} >>> str(dict) "{'Name': 'Runoob', 'Class': 'First', 'Age': 7}"` |
| 3    | type(variable) 返回输入的变量类型，如果变量是字典就返回字典类型。 | `>>> dict = {'Name': 'Runoob', 'Age': 7, 'Class': 'First'} >>> type(dict) <class 'dict'>` |

Python字典包含了以下内置方法：

| 序号 | 函数及描述                                                   |
| :--- | :----------------------------------------------------------- |
| 1    | [radiansdict.clear()](https://www.runoob.com/python3/python3-att-dictionary-clear.html) 删除字典内所有元素 |
| 2    | [radiansdict.copy()](https://www.runoob.com/python3/python3-att-dictionary-copy.html) 返回一个字典的浅复制 |
| 3    | [radiansdict.fromkeys()](https://www.runoob.com/python3/python3-att-dictionary-fromkeys.html) 创建一个新字典，以序列seq中元素做字典的键，val为字典所有键对应的初始值 |
| 4    | [radiansdict.get(key, default=None)](https://www.runoob.com/python3/python3-att-dictionary-get.html) 返回指定键的值，如果键不在字典中返回 default 设置的默认值 |
| 5    | [key in dict](https://www.runoob.com/python3/python3-att-dictionary-in.html) 如果键在字典dict里返回true，否则返回false |
| 6    | [radiansdict.items()](https://www.runoob.com/python3/python3-att-dictionary-items.html) 以列表返回一个视图对象 |
| 7    | [radiansdict.keys()](https://www.runoob.com/python3/python3-att-dictionary-keys.html) 返回一个视图对象 |
| 8    | [radiansdict.setdefault(key, default=None)](https://www.runoob.com/python3/python3-att-dictionary-setdefault.html) 和get()类似, 但如果键不存在于字典中，将会添加键并将值设为default |
| 9    | [radiansdict.update(dict2)](https://www.runoob.com/python3/python3-att-dictionary-update.html) 把字典dict2的键/值对更新到dict里 |
| 10   | [radiansdict.values()](https://www.runoob.com/python3/python3-att-dictionary-values.html) 返回一个视图对象 |
| 11   | [pop(key[,default\])](https://www.runoob.com/python3/python3-att-dictionary-pop.html) 删除字典给定键 key 所对应的值，返回值为被删除的值。key值必须给出。 否则，返回default值。 |
| 12   | [popitem()](https://www.runoob.com/python3/python3-att-dictionary-popitem.html) 随机返回并删除字典中的最后一对键和值。 |
