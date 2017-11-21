package test.loginDao;

import java.sql.*;

public class user {


    public String findUsername(String username){
        String psw = null;
        Connection con =null;
        PreparedStatement pstmt =null;
        ResultSet rs = null;
        try {
            String driver ="com.mysql.jdbc.Driver";
            String url ="jdbc:mysql://localhost:3306/mytest";
            String user ="root";
            String password ="123456";
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            String sql = "select * from user where username=?";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, username);
            rs = pstmt.executeQuery();
            if(rs==null){
                return null;
            }
            if(rs.next()){
                psw=rs.getString("password");
            }else{
                psw=null;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(pstmt!=null)pstmt.close();
                if(con!=null)con.close();
            }
            catch (SQLException e) {
            }
        }
        return psw;
    }
    public void addUser(String username,String psw,String stdID,String email){
        Connection con =null;
        PreparedStatement pstmt =null;
        try {
            String driver ="com.mysql.jdbc.Driver";
            String url ="jdbc:mysql://localhost:3306/mytest";
            String user ="root";
            String password ="123456";
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            String sql = "INSERT INTO user VALUES(?,?,?,?)";
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, psw);
            pstmt.setString(3, stdID);
            pstmt.setString(4, email);
            pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(pstmt!=null)pstmt.close();
                if(con!=null)con.close();
            }
            catch (SQLException e) {
            }
        }
    }
    //单独测试使用
   // public static void main(String[] args) {
//    String psw =new user().findUsername("123");
//    //String psw =new user().findUsername("123");
//    System.out.println("这是main 函数");
//    user u = new user();
//    u.addUser("345", "345");
   // }



}
