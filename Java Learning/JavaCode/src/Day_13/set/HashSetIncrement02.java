package Day_13.set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @Author: Song-zy
 * @Date: 2021/10/24 21:02
 * @Description:
 */
public class HashSetIncrement02 {
    @SuppressWarnings("all")
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        for (int i = 1; i < 12; i++) {
            hashSet.add(new A(i));
        }
        for (int i = 1; i < 12; i++) {
            hashSet.add(new B(i));
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Object next =  it.next();
            System.out.println(next);
        }
//        System.out.println(hashSet);
    }
}

class A {
    int n;

    public A(int n) {
        this.n = n;
    }

    @Override
    public int hashCode() {
        return 100;
    }
}
class B {
    int n;

    public B(int n) {
        this.n = n;
    }

    @Override
    public int hashCode() {
        return 200;
    }
}