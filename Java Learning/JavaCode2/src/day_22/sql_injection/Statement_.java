package day_22.sql_injection;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

/**
 * @Author: Song-zy
 * @Date: 2021/12/2 21:31
 * @Description: 演示SQL注入问题
 */
public class Statement_ {
    @SuppressWarnings("all")
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        //加載配置文件
        properties.load(new FileInputStream("src/day_22/sql_demo/mysql.properties"));
        String url = properties.getProperty("url");
        String password = properties.getProperty("password");
        String user = properties.getProperty("user");
        String driver = properties.getProperty("driver");
        //
        String admin_user = "";//用户名
        String admin_pwd = "";//密码
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名:");
        admin_user = scanner.nextLine();
        System.out.print("请输入密码:");
        admin_pwd = scanner.nextLine();
        //注冊驱动
        Class.forName(driver);
        //获取连接
        Connection conn = DriverManager.getConnection(url, user, password);
        //
        Statement statement = conn.createStatement();
        //sql语句
        String sql = "SELECT* FROM admin WHERE user = '"+ admin_user + "' AND pwd = '" + admin_pwd + "'";

        //返回单个的ResultSet对象
        ResultSet resultSet = statement.executeQuery(sql);
        //循环取出每一行;resultSet.next(),当没有下一行时，会返回false
        if (resultSet.next())
            System.out.println("登录成功");
        else
            System.out.println("登录失败");
        //关闭连接
        resultSet.close();
        statement.close();
        conn.close();
    }
}
