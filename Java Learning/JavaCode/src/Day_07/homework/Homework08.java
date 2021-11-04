package Day_07.homework;

/**
 * @Author: Song-zy
 * @Date: 2021/9/27 20:25
 * @Description:
 * 1)在上面类的基础上扩展新类 CheckingAccount,对每次存款和取款都收取1美元的手续费
 * 2)扩展前一个练习的 BankAccount类,新类SavingsAccount每个月都有利息产生
 *      (earnMonthlyInterest方法被调用),并且有每月三次免手续费的存款或取款。
 *      在 earnMonthlyInterest方法中重置交易计数
 * 3)体会重写的好处
 */
public class Homework08 {
}
class BankAccount{
    private double balance;//余额
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    //存款
    public void deposit(double amount) {
        balance += amount;
    }
    //取款
    public void withdraw(double amount) {
        balance -= amount;
    }
// /set和 getBalance方法
}
class CheckingAccount{

}