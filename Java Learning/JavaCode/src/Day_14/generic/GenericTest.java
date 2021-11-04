package Day_14.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Song-zy
 * @Date: 2021/10/27 20:31
 * @Description: 类型通配符
 */

public class GenericTest {

    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("icon");
        age.add(18);
        number.add(314);

        getData(name);
        getData(age);
        getData(number);

    }

    public static void getData(List<?> data) {
        System.out.println("data :" + data.get(0));
    }
}