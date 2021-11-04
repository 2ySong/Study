package Day_11.exception_;

/**
 * @Author: Song-zy
 * @Date: 2021/10/5 14:43
 * @Description: 类型转换异常
 */
public class ClassCastException04 {
    public static void main(String[] args) {
        A b = new B();
        B b2 = (B)b;
        C c = (C)b;//抛出类型转换异常
    }
}
class A {}
class B extends A {}
class C extends A {}
/*
Exception in thread "main" java.lang.ClassCastException: class Day_11.exception_.B cannot be cast to class Day_11.exception_.C (Day_11.exception_.B and Day_11.exception_.C are in unnamed module of loader 'app')
	at Day_11.exception_.ClassCastException04.main(ClassCastException04.java:12)
 */