package Day_07.homework.homework13;

/**
 * @Author: Song-zy
 * @Date: 2021/9/27 18:51
 * @Description:
 */
public class Homework13 {
    public static void main(String[] args) {
        Person[] persons = new Person[4];
        persons[0] = new Student("学生1-jack",'男',16,20210001);
        persons[1] = new Student("学生2-marry",'女',17,20210002);
        persons[2] = new Teacher("教师1-张三",'男',45,12);
        persons[3] = new Teacher("教师2-李四",'男',37,5);

        //冒泡排序，按照年龄:高-》低
        Person pp;
        for (int i = 0; i < persons.length-1; i++) {
            for (int j = 0; j < persons.length-1-i; j++) {
                if(persons[j].getAge()<persons[j+1].getAge()){
                    pp = persons[j+1];
                    persons[j+1] = persons[j];
                    persons[j] = pp;
                }
            }
        }
        Homework13 homework13 = new Homework13();

        System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+人员信息+-+-+-+-+-+-+-+-+-+-+-+-+");
        for (int i = 0; i < persons.length;i++){
            System.out.println(persons[i].toString());
            homework13.testMethod(persons[i]);
            System.out.println(persons[i].play());
            System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-++-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        }
    }

    public void testMethod(Person person){
        if(person instanceof Teacher){//运行类型比较
            ((Teacher)person).teach();
        }else if(person instanceof Student){
            ((Student)person).study();
        }
    }
}
