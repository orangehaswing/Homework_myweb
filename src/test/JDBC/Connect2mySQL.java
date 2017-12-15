package test.JDBC;

import java.io.UnsupportedEncodingException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Connect2mySQL {

    public void add2MySQL(String username, String inform) {
        int result = 0;
        Connection conn = null;
        PreparedStatement pstmt = null;
        String sql;
        String url = "jdbc:mysql://localhost:3306/mytest?"
                + "user=root&password=123456&useUnicode=true&&;characterEncoding=UTF8";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("成功加载MYSQL数据库");
            conn = DriverManager.getConnection(url);
            sql = "UPDATE user SET inform = ? where username = ? ";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, inform);
            pstmt.setString(2, username);
            pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
            }
        }
    }

    public HashMap<String,String> readFromMySQL(String username) {
        String name = null;
        String context = null;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        HashMap<String,String> listName = new HashMap<String,String>();
        String sql;
        String url = "jdbc:mysql://localhost:3306/mytest?"
                + "user=root&password=123456&useUnicode=true&characterEncoding=UTF8";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("成功加载MYSQL数据库");
            conn = DriverManager.getConnection(url);
            sql = "select * from user";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                name = rs.getString("username");
                context = rs.getString("inform");
                listName.put(name,context);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
            }
            return listName;
        }
    }
}
