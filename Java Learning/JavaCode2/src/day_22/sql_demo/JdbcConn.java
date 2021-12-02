package day_22.sql_demo;

import com.mysql.cj.jdbc.Driver;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @Author: Song-zy
 * @Date: 2021/11/29 0:38
 * @Description:
 */
public class JdbcConn {
    String url = "jdbc:mysql://localhost:3306/db01?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

    //连接方式1
    @Test
    public void connect01() throws SQLException {
        Driver driver = new Driver();
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "8784szy2810");
        Connection conn = driver.connect(url, properties);
        System.out.println("方式1：" + conn);
    }

    //连接方式2
    @Test
    public void connect02() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "8784szy2810");
        Connection conn = DriverManager.getConnection(url, properties);
        System.out.println("方式2：" + conn);
    }

    //连接方式3
    @Test
    public void connect03() throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/day_22/sql_demo/mysql.properties"));
        String url = properties.getProperty("url");
        String password = properties.getProperty("password");
        String user = properties.getProperty("user");
        String driver = properties.getProperty("driver");
        //
        Class.forName(driver);
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println(conn);
    }
}
