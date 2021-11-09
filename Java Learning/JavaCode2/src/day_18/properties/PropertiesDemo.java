package day_18.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author: Song-zy
 * @Date: 2021/11/9 16:00
 * @Description: 读取
 */
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        //加载指定配置文件
        String filePath = "src/day_18/properties/mysql.properties";
        properties.load(new FileReader(filePath));
        //把k-v显示在控制台
        properties.list(System.out);
        //更具key获取值
        String user = properties.getProperty("user");
        String ip = properties.getProperty("ip");
        String pwd = properties.getProperty("pwd");
        System.out.println("用户名："+user);
        System.out.println("密码："+pwd);
    }
}
