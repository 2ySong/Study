# 房屋出租系统

### 项目需求说明House rental system
 
- 面向对象编程
  - 把每一个小的功能封装起来，用的时候再调用
- 实现基于文本界面的《房屋出租软件》。
- 能够实现对房屋信息的添加、修改和删除(用数组实现)，并能够打印房屋明细表。
- CRUD:增删改查

### 项目设计

- 程序框架图（分层设计，模式管理）
  - 分成模式
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