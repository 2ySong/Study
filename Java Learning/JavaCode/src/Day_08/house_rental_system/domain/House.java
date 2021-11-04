package Day_08.house_rental_system.domain;

/**
 * @Author: Song-zy
 * @Date: 2021/9/28 14:45
 * @Description: 房屋实体类
 */
public class House {
    //属性：- 编号[id]+房主[name]+电话[phone]+地址[address]+月租[rent]+状态(未出租/已出租)[state]
    private int id;
    private String name;
    private String phone;
    private String address;
    private double rent;
    private String state;

    public House(int id, String name,   String phone, String address, double rent, String state) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.rent = rent;
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


    @Override
    public String toString() {
        return id +
                "\t\t" + name +
                " \t"+ phone +
                "\t" + address +
                "\t" + rent +
                " \t" + state;
    }

//    public static void main(String[] args) {
//        House s= new House(123,"tom","13398562345","河南省郑州市",2099,"未出租");
//        System.out.println(s);
//    }
}
