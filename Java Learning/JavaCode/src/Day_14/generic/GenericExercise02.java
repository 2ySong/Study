package Day_14.generic;


import java.util.ArrayList;
import java.util.Comparator;

/**
 * @Author: Song-zy
 * @Date: 2021/10/27 17:11
 * @Description:
 */
public class GenericExercise02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("王二", 3000, new MyDate(1998, 3, 23)));
        employees.add(new Employee("张三", 5000, new MyDate(2000, 11, 5)));
        employees.add(new Employee("李四", 3500, new MyDate(2000, 11, 27)));
        //定制排序：名字长度（短->长）->生日（大->小）
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                int x = e1.getName().compareTo(e2.getName());
                if (x != 0) {
                    return x;
                }
                return e1.getBirthday().compareTo(e2.getBirthday());
            }
        });
        System.out.println("姓名\t\t工资[元]\t\t出生日期");
        for (Employee e : employees) {
            System.out.println(e);
        }

    }
}

