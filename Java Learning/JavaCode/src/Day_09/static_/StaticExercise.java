package Day_09.static_;

/**
 * @Author: Song-zy
 * @Date: 2021/9/30 9:34
 * @Description:
 */
public class StaticExercise {
    public static void main(String[] args) {
        System.out.println("Number of total is="+ Person.getTotalPerson()); //0
        Person p1 = new Person();
        System.out.println("Number of total is="+ Person.getTotalPerson()); //1
    }
}
class Person{
    private int id;
    private static int total =0;
    public static int getTotalPerson(){
        return total;
    }

    public Person(){
        total++; //tota
        id =total;
    }
}

