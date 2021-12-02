package day_22.sql_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * @Author: Song-zy
 * @Date: 2021/12/2 20:26
 * @Description:
 */
public class ResultSet_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        //加載配置文件
        properties.load(new FileInputStream("src/day_22/sql_demo/mysql.properties"));
        String url = properties.getProperty("url");
        String password = properties.getProperty("password");
        String user = properties.getProperty("user");
        String driver = properties.getProperty("driver");
        //注冊驱动
        Class.forName(driver);
        //获取连接
        Connection conn = DriverManager.getConnection(url, user, password);
        //
        Statement statement = conn.createStatement();
        //sql语句
        String sql = "SELECT*FROM actor";
        //返回单个的ResultSet对象
        ResultSet resultSet = statement.executeQuery(sql);
        //循环取出每一行;resultSet.next(),当没有下一行时，会返回false
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            System.out.println(id + "\t" + name);
        }
        //关闭连接
        resultSet.close();
        statement.close();
        conn.close();
    }
}
