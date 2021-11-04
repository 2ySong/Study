package Day_08.house_rental_system.service;

import Day_08.house_rental_system.domain.House;
import Day_08.house_rental_system.utils.Utility;

/**
 * @Author: Song-zy
 * @Date: 2021/9/28 15:47
 * @Description:
 */
public class HouseService {
    //创建Houses数组,保存房屋对象
    private House[] houses ;
    private int count = 1;//存在房屋的个数
    private int idCounter = 1;//记录id自增长，即下一个id分配的数

    public HouseService(int houseNums) {
        //houseNums，通过构造器传入一个房屋数量
        houses = new House[houseNums];//指定数组大小

        houses[0] = new House(1,"jack","1665","海定区",3000,"未出租");
    }

    //add方法，添加房屋
    public boolean add(House newHouse){
        //判断是否可以继续添加
        if(count ==houses.length){
            System.out.println("温馨提示：数组空间不足，不能添加！");
            return false;
        }
        //把添加的对象放到数组非空对象的最后,存在房屋的个数自增
        houses[count++] = newHouse;
        //应该有一个id分配的机制，即id自增
        newHouse.setId(++idCounter);//更新新房子的id
        return true;
    }

    //find方法，查询房屋信息
    public boolean find(int findId){
        //遍历房屋数组
        int index =-1;
        for (int i = 0; i < count; i++) {
            if(houses[i].getId() == findId){
                index = i;//这样就得到了对应id在数组中的下标
            }
        }
        if(index==-1){
            return false;
        }else {
            System.out.println(houses[index].toString());
            return true;
        }
    }

    //del方法，删除房屋
    public boolean del(int DelId){
        //找到目标房屋的信息，找出其在房屋数组中的下标
        //房屋数组的下标和id没有必然的关系
        int index = -1;
        for (int i = 0; i <count;i++){
            if(DelId==houses[i].getId()){
                index = i;//这样就得到了对应id在数组中的下标
            }
        }
        if(index==-1){//找不到要i删除id的信息
            return false;//无法删除
        }
        //如果找到
        for (int i = index; i < count; i++) {
            houses[i] = houses[i+1];//将要删除的信息后面的所有元素下标向前移动一位，再将最后那位置空
        }
//        houses[--count] = null;//置空,且数组元素减一。前减减【先自减，再赋值】
        count--;
        return true;//成功删除
    }

    //update方法，找到该房屋，并作出修改
    public boolean update(int updateId) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if(updateId==houses[i].getId()) {
                index = i;
            }
        }
        if(index == -1) {
            return false;
        }
        //如果找到。
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
//        House newHouse = new House(updateId,name,phone,address,rental,state);
//        houses[updateId]=newHouse;
//        newHouse=null;
        houses[index].setName(name);
        houses[index].setPhone(phone);
        houses[index].setAddress(address);
        houses[index].setRent(rental);
        houses[index].setState(state);
        return true;
    }
    //list方法，返回Houses
    public House[] list(){
        return houses;
    }
}
