package swu.lwh;

import java.sql.*;

public class DBUtils {
    private static String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String DB_URL = "jdbc:mysql://localhost:3306/javadata";
    private static String DB_USER = "root";
    private static String DB_PASS = "qwe12345";

    public static void checkUsers(String sql) throws SQLException {
        excute(sql);
    }

    private static void excute(String sql) throws SQLException {
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
            try (Statement statement = connection.createStatement()) {
                statement.execute(sql);
            }
        }
    }

    public static String getPwd(String sql) {
        try {
            Class.forName(DB_DRIVER);
            System.out.println("�������ݿ��С���");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS)) {
            try (Statement statement = connection.createStatement()) {
                System.out.println("ִ�в�ѯ�С���");
                System.out.println("sql1:"+sql);
                ResultSet rs = statement.executeQuery(sql);
                System.out.println("sql2:"+sql);
                while (rs.next()) {
                    String pwd_return = rs.getString("password");
                    System.out.println(pwd_return);
                    return pwd_return;
                }
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
}
