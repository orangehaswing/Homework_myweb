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
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        doPost(req, resp);
//    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String homework = req.getParameter("homework");

        homework = new String(homework.getBytes("iso8859-1"), "UTF-8");

        Connect2mySQL connect2mySQL = new Connect2mySQL();
        HashMap<String, String> userinform = connect2mySQL.readFromMySQL(username);
        userinform.remove("admin");

        if (homework != null){
            connect2mySQL.add2MySQL("admin",homework);
        }

        req.setAttribute("userinform", userinform);
        req.getRequestDispatcher("/listfile.jsp").forward(req, resp);

    }
}
