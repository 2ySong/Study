package Day_06;

/**
 * 猴子吃桃子问题:有一堆桃子,猴子第一天吃了其中的一半,并再多吃了一个!
 * 以后每天猴子都吃其中的一半,然后再多吃一个。当到第10天时,想再吃时(即还没吃)
 * 发现只有1个桃子了。问题:最初共多少个桃子?
 */
class M{
    public int eat(int x){
        if(x==0){
            return 1;
        }else{
            return 2*(eat(x-1)+1);
        }
    }
}
public class MonkeyPeach {

    public static void main(String[] args) {
        M m = new M();
        System.out.println(m.eat(9));
    }
}
