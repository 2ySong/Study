package Day_07.extendsLearn;

public class ExtendsExercise02 {
    public static void main(String[] args) {
        PC pc = new PC("AMD",512,"三星硬盘","联想笔记本");
        pc.show();
        for (int i = 0; i < 20; i++) {
            System.out.print("===");
        }
        System.out.println();
        NotePad notePad = new NotePad("英特尔",128,"华为硬盘","灰色");
//        System.out.println(notePad.getDetails());
        notePad.show();
    }
}

//父类，Computer
class Computer{
    //公共属性
    private String cpu;//CPU
    private double memory;//内存
    private String hardDisk;//硬盘

    public Computer(String cpu, double memory, String hardDisk) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardDisk = hardDisk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }
    //编写一个返回信息的方法
    public String getDetails() {
        return "cpu="+cpu+"  memory="+memory+"  hardDisk="+hardDisk;
    }
}

//子类，PC
class PC extends Computer {
    //特有属性，品牌
    private String brand;

    public PC(String cpu, double memory, String hardDisk, String brand) {
        super(cpu, memory, hardDisk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void show(){
        System.out.println("====PC信息======");
//        System.out.println("cpu="+getCpu()+"  memory="+getMemory()+"  hardDisk="+getHardDisk()+"  brand="+getBrand());
        System.out.println(getDetails()+"  brand="+getBrand());//可以接着父类中的getDetails()方法加元素输出
    }
}
//子类 NotePad
class NotePad extends Computer {
    private String color;

    public NotePad(String cpu, double memory, String hardDisk, String color) {
        super(cpu, memory, hardDisk);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void show(){
        System.out.println("====notePad信息======");
//        System.out.println("cpu="+getCpu()+"  memory="+getMemory()+"  hardDisk="+getHardDisk()+"  color="+getColor());//这种方法太过繁琐
        System.out.println(getDetails()+"color="+getColor());
    }

}