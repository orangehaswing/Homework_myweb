package test.JDBC;

import java.sql.*;

public class Connect2mySQL {
//    public static void main(String[] args) {
//        Connection conn = null;
//        String sql;
//        String url = "jdbc:mysql://localhost:3306/examination_system?"
//                + "user=root&password=123456&useUnicode=true&characterEncoding=UTF8";
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("成功加载MYSQL数据库");
//
//
//            conn = DriverManager.getConnection(url);
//            Statement stmt = conn.createStatement();
//
//
//            sql = "create table aacc(NO char(20),name varchar(20),primary key(NO))";
//            int result = stmt.executeUpdate(sql);
//
//            if (result != -1) {
//                System.out.println("创建数据表成功");
//                sql = "insert into aacc(NO,name) values('2012001','key')";
//                result = stmt.executeUpdate(sql);
//                sql = "insert into aacc(NO,name) values('2012002','out')";
//                result = stmt.executeUpdate(sql);
//                sql = "select * from aacc";
//                ResultSet rs = stmt.executeQuery(sql);
//                System.out.println("学号\t姓名");
//                while (rs.next()) {
//                    System.out.println(rs.getString(1) + "\t" + rs.getString(2));
//                }
//            }
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
}
