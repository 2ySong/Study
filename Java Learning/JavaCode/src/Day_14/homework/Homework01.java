package Day_14.homework;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * @Author: Song-zy
 * @Date: 2021/10/27 21:23
 * @Description:
 */
public class Homework01 {
    public static void main(String[] args) {
    }
    @Test
    public void test(){
        DAO<User> dao = new DAO<User>();
        dao.save("001",new User(10,17,"hhhh"));
        dao.save("002",new User(11,18,"xxxx"));
        dao.save("003",new User(12,19,"yyyy"));

        List<User> users = new ArrayList<User>();
        System.out.println(dao.list());
    }
}

@SuppressWarnings("all")
class DAO<T> {
    Map<String, T> map = new HashMap();

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public List<T> list() {
        ArrayList<T> list = new ArrayList<T>();
        Set<String> keyset = map.keySet();
        for (String key : keyset) {
            list.add(get(key));
        }
        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }
}

class User {
    private int id;
    private int age;
    private String name;

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}