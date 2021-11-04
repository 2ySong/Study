package Day_07.polymorphisc_.Exercise02;

/**
 * @Author: Song-zy
 * @Date: 2021/9/26 15:20
 * @Description: 多态数组
 */
public class PolyArray {
    public static void main(String[] args) {
//        应用实例:现有一个继承结构如下:要求创建1个 Person对象
//        2个 Student对象和2个 Teacher对象,统一放在头组中,并调用每个对象say方法
        Person persons[] = new Person[5];
        persons[0] = new Person("jack",15);
        persons[1] = new Student("学生11",17,89);
        persons[2] = new Student("学生22",18,99);
        persons[3] = new Teacher("老师11",23,2000);
        persons[4] = new Teacher("老师22",29,40000);

        //调用方法
        for (int i = 0; i < persons.length; i++) {
            //动态绑定机制
            System.out.println(persons[i].say());

            if(persons[i] instanceof Student){
                ((Student) persons[i]).study();//向下转型，调用子类特有方法
            }else if(persons[i] instanceof Teacher){
                ((Teacher) persons[i]).teach();//向下转型，调用子类特有方法
            }
        }
//        调用特有方法
        Student s1 = (Student)persons[1];
        Student s2 = (Student)persons[2];

        Teacher t1 = (Teacher)persons[3];
        Teacher t2 = (Teacher)persons[4];
    }
}
//输出结果
//| name=jack | age=15 |
//| name=学生11 | age=17 | score=89.0 |
//学生11在学习……
//| name=学生22 | age=18 | score=99.0 |
//学生22在学习……
//| name=老师11 | age=23 | salary=2000.0 |
//老师11在教学……
//| name=老师22 | age=29 | salary=40000.0 |
//老师22在教学……
