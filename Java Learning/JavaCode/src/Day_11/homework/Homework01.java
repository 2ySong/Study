package Day_11.homework;

/**
 * @Author: Song-zy
 * @Date: 2021/10/5 21:51
 * @Description:
 */
public class Homework01 {
    public static void main(String[] args) {
        try{
            if(args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }

            //先把接收到的参数，转成整数
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            double res = cal(n1,n2);//可能会有算术异常--除数为0
            System.out.println("计算机结果是"+res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("参数个数不正确");
        } catch (ArithmeticException e){
            System.out.println("除数为0!");
        }
    }
    public static double cal(int n1,int n2){
        return n1/n2;
    }
}

