package Day_07.polymorphisc_.Exercise03;

/**
 * @Author: Song-zy
 * @Date: 2021/9/26 16:01
 * @Description: 多态参数
 */
public class PloyParameter {
    public static void main(String[] args) {
        Staff staff = new Staff("jack员工",2000);
        Manager manage = new Manager("Tom经理",30000,2000);
        PloyParameter p = new PloyParameter();
        p.showEmpAnnual(staff);
        p.showEmpAnnual(manage);
        p.testWork(staff);
        p.testWork(manage);
    }
    // * 测试类中添加一个方法 showEmpAnnual( Employee e),
    // 实现获取任何员工对象的工资并在main方法中调用该方法[ e.getAnnual()]
    public void showEmpAnnual( Employee e){
        System.out.println(e.getName()+"的年薪是"+e.getAnnual()+"元");
    }

    // * 测试类中添加一个方法, testWork如果是普通员工,则调用work方法,如果是经理,则调用 manage方法
    public void testWork(Employee e){
        if(e instanceof Staff){
            ((Staff)e).work();
        }else if(e instanceof Manager){
            ((Manager) e).manage();
        }
    }
}
