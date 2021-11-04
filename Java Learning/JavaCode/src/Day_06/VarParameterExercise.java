package Day_06;

public class VarParameterExercise {
    public static void main(String[] args) {
        Var var = new Var();
        String xx = var.showScore("小明",45,78,45,35,90);
        System.out.println(xx);
    }
}
class Var{
    public String showScore(String str,int...scores){
        int sum = 0;
        for(int i=0;i<scores.length;i++){
            sum += scores[i];
        }
        return str+"的"+scores.length+"科成绩总分为"+sum;
    }
}