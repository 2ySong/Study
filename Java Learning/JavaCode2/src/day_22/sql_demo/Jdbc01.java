package day_22.sql_demo;


import com.mysql.jdbc.Driver;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @Author: Song-zy
 * @Date: 2021/11/28 22:31
 * @Description:
 */
public class Jdbc01 {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/db01?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        1.注册驱动
        Class.forName(JDBC_DRIVER);
        //得到连接
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "8784szy2810");
        Connection connect = DriverManager.getConnection(DB_URL, properties);//获取连接
        String sql = "INSERT INTO stu VALUES (3,'tom')";
        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql);//执行sql受影响的行数，如果>0，成功
        System.out.println(rows > 0 ? "Database connection succeeded" : "Database connection failure");
        sql = "UPDATE db01.stu set sname='SMITH'\n" +
                "WHERE id = 2;";
        statement.executeUpdate(sql);
        //关闭资源
        statement.close();
        connect.close();

    }
}
