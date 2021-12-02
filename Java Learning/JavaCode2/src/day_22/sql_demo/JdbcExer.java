package day_22.sql_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @Author: Song-zy
 * @Date: 2021/12/2 17:25
 * @Description:
 */
public class JdbcExer {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/day_22/sql_demo/mysql.properties"));
        String url = properties.getProperty("url");
        String password = properties.getProperty("password");
        String user = properties.getProperty("user");
        String driver = properties.getProperty("driver");
        //
        Class.forName(driver);
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException throwables) {
            System.out.println("连接失败");
        }
        //创建表
        String sql = """
                CREATE TABLE IF NOT EXISTS actor(
                    id INT PRIMARY KEY,
                    name VARCHAR(255) NOT NULL DEFAULT '我的宝'
                )""";
        Statement statement = null;
        try {
            statement = conn.createStatement();

            int rows = 0;//执行sql受影响的行数，如果>0，成功
            rows = statement.executeUpdate(sql);

            if (rows > 0)
                System.out.println("成功创建actor表");
            //添加数据
//            sql = """
//                    INSERT INTO actor
//                    VALUES (1, '小明'),
//                           (2,'张三'),
//                           (3,'李四'),
//                           (4,'王五'),
//                           (5,'麻子')
//                    """;
            sql = """
                    DELETE
                    FROM actor
                    WHERE id = 3
                    """;
            statement = conn.createStatement();
            rows = statement.executeUpdate(sql);//执行sql受影响的行数，如果>0，成功
            if (rows > 0)
                System.out.println("成功添加数据");
            else
                System.out.println("添加失败");
        } catch (SQLException throwables) {
            System.out.println(throwables.getMessage());
        }

        //关闭资源
        statement.close();
        conn.close();
    }
}
