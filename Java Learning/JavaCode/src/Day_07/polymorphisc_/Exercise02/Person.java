package Day_07.polymorphisc_.Exercise02;

/**
 * @Author: Song-zy
 * @Date: 2021/9/26 15:16
 * @Description:
 */
public class Person {
    private String name;
    private  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String say(){
        return "| name="+name+" | age="+age+" | ";
    }
}
