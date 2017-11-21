package test.JDBC;

import java.sql.*;

public class Connect2mySQL {

    public boolean add2MySQL(String FileName, String FileLocation) {
        int result = 0;
        Connection conn = null;
        PreparedStatement pstmt =null;
        String sql;
        String url = "jdbc:mysql://localhost:3306/mytest?"
                + "user=root&password=123456&useUnicode=true&characterEncoding=UTF8";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("成功加载MYSQL数据库");
            conn = DriverManager.getConnection(url);
            sql = "INSERT INTO fileinform VALUES(?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, FileName);
            pstmt.setString(2, FileLocation);
            pstmt.executeUpdate();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(pstmt!=null)pstmt.close();
                if(conn!=null)conn.close();
            }
            catch (SQLException e) {
            }
        }
        return result!=-1?true:false;
    }

    public String readFromMySQL() {
        String fileLocation = null;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql;
        String url = "jdbc:mysql://localhost:3306/mytest?"
                + "user=root&password=123456&useUnicode=true&characterEncoding=UTF8";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("成功加载MYSQL数据库");
            conn = DriverManager.getConnection(url);
            sql = "select * from fileinform";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                fileLocation = rs.getString("filelocation") ;
                System.out.println(fileLocation);
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
            return fileLocation;
        }
    }
}
