package test.Webfunc;

import test.JDBC.Connect2mySQL;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;

public class Download extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String homework = null;
        int clas = Integer.parseInt(req.getParameter("clas"));

        Connect2mySQL connect2mySQL = new Connect2mySQL();
        HashMap<String, String> userinform = connect2mySQL.readFromMySQL(username);
        userinform.remove("admin");

        //将题目写入数据库
        switch (clas){
            case 1:
                homework = "第一单元测试：请写出泰勒公式?";
                break;
            case 2:
                homework = "第二单元测试：计算sin(x)在x曲线与0的极限?";
                break;
            case 3:
                homework = "第三单元测试：sin(x)原函数是?";
                break;
            case 4:
                homework = "第四单元测试：导数的基本概念?";
                break;
        }
        if (homework != null){
            connect2mySQL.add2MySQL("admin",homework);
        }
        req.setAttribute("userinform", userinform);
        req.getRequestDispatcher("/listfile.jsp").forward(req, resp);
    }
}
