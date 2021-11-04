package Day_07.homework.homework05;

/**
 * @Author: Song-zy
 * @Date: 2021/9/27 14:52
 * @Description: 员工的子类：子类:工人类、农民类、教师类、科学家类、服务生类。
 */
class Worker extends Employee{
    public Worker(String name, double basicSalary) {
        super(name, basicSalary);
    }

}
class Farmers extends Employee{
    public Farmers(String name, double basicSalary) {
        super(name, basicSalary);
    }

}
class Waiter extends Employee{
    public Waiter(String name, double basicSalary) {
        super(name, basicSalary);
    }
}
class Teacher extends Employee{
    private double classSalary;
    private int teachDays;

    public Teacher(String name, double basicSalary, double classSalary, int teachDays) {
        super(name, basicSalary);
        this.classSalary = classSalary;
        this.teachDays = teachDays;
    }

    public void showSalary(){
        System.out.println("| name="+ getName()+" | BasicSalary="+getBasicSalary()+" | classSalary="+classSalary+
                " | teachDays="+teachDays+" | yearSalary="+(getBasicSalary()*12+classSalary*teachDays)+" |");
    }
}

class Scientists extends Employee{
    private double annualBonus;

    public Scientists(String name, double basicSalary, double annualBonus) {
        super(name, basicSalary);
        this.annualBonus = annualBonus;
    }
    public void showSalary(){
        System.out.println("| name="+ getName()+" | BasicSalary="+getBasicSalary()+
                " | annualBonus="+annualBonus+" | yearSalary="+(getBasicSalary()*12+annualBonus)+" |");
    }
}