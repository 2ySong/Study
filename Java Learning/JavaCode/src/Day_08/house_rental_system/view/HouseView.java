package Day_08.house_rental_system.view;

import Day_08.house_rental_system.domain.House;
import Day_08.house_rental_system.service.HouseService;
import Day_08.house_rental_system.utils.Utility;

import java.util.Scanner;

/**
 * @Author: Song-zy
 * @Date: 2021/9/28 15:15
 * @Description: 菜单界面
 */
public class HouseView {
    Scanner myScanner = new Scanner(System.in);
    private boolean loop = true;//控制显示菜单
    private char key = ' ';//接收用户选择
    private HouseService houseService = new HouseService(10);//存放10个房屋信息

    //显示房屋列表
    public void listHouses(){
        System.out.println("------------------------房 屋 列 表-----------------------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();//得到所有房屋信息
        for (int i = 0; i < houses.length; i++) {
            if(houses[i]==null){
                break;//不要输出null房屋信息
            }
            System.out.println(houses[i]);
        }
        System.out.println("+--------------------房 屋 列 表 结 束--------------------+\n");
    }
    //增加房屋信息，接收输入创建House对象，调用add方法
    public void addHouse(){
        System.out.println("------------------------新 增 房 屋-----------------------");
        System.out.print("房主姓名: ");
        String name = Utility.readString(8);
        System.out.print("电话: ");
        String phone = Utility.readString(11);
        System.out.print("地址: ");
        String address = Utility.readString(16);
        System.out.print("月租: ");
        double rental = Utility.readDouble(2000);
        System.out.print("状态(未出租/已出租): ");
        String state = Utility.readString(3);
        //创建一个House对象，房屋id是系统分配的
        House newHouse = new House(0,name,phone,address,rental,state);
        if (houseService.add(newHouse)) {
            System.out.println("+-----------------------添 加 成 功----------------------+\n");
        }else{
            System.out.println("+-----------------------添 加 失 败----------------------+\n");
        }
    }

    //根据id号查找房屋，调用find方法
    public void findHouse(){
        System.out.println("------------------------查 找 房 屋-----------------------");
        System.out.print("请输入你要查找房屋的id: ");
        int id = Utility.readInt();//读取输入，长度小于两位
        if(houseService.find(id)){
            System.out.println("+-----------------------查 找 成 功----------------------+");
        }else{
            System.out.println("+---------------------没 有 该 房 屋---------------------+");
        }
    }
    //编写delHouse,接收用户输入的id，调用del方法
    public void delHouse(){
        System.out.println("------------------------删 除 房 屋-----------------------");
        System.out.print("请选择待删除房屋编号: ");
        int delId = Utility.readInt();
        if(delId==-1){
            System.out.println("+--------------------放 弃 删 除 房 屋--------------------+\n");
            return;
        }
        char  choice = Utility.readConfirmSelection();//必须输入Y或者N
        if(choice=='Y'){
            if(houseService.del(delId)){
                System.out.println("+--------------------成 功 删 除 房 屋--------------------+\n");
            }else{
                System.out.println("+----------------房屋编号不存在，删除房屋失败----------------+\n");
            }
        }else{
            System.out.println("+--------------------放 弃 删 除 房 屋--------------------+\n");
        }
    }
    //updateHouse修改房屋信息，调用update方法
    public void updateHouse(){
        System.out.println("---------------------修 改 房 屋 信 息---------------------");
        System.out.println("请选择带修改房屋编号(-1退出): ");
        int updateId = Utility.readInt();
        if(updateId==-1){
            System.out.println("+--------------------放 弃 修 改 房 屋--------------------+\n");
            return;
        }
        if(!houseService.update(updateId)){
            System.out.println("+------------------没有找到该房屋编号信息-------------------+\n");
        }
        else{
            System.out.println("+--------------------修 改 房 屋 成 功--------------------+\n");
        }
    }
    //退出
    public void exit(){
        char  choice = Utility.readConfirmSelection();//必须输入Y或者N
        if(choice=='Y'){
            System.out.println("你已经成功退出程序！");
            loop = false;
            return;
        }
        System.out.println("你已经取消退出本系统！请继续根据选项完成你的操作……");
    }
    //显示一个主菜单
    public void mainMenu(){
        do{
            System.out.println("------------------------房屋出租系统-----------------------");
            System.out.println("\t\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t\t3 删 除 房 屋");
            System.out.println("\t\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t\t6 退      出");
            System.out.print("请输入你的选择(1~6): ");
            key = Utility.readChar();//读取键盘输入的一个字符

            //条件分支
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
                default:
                    break;
            }
        }while(loop);
    }


}
