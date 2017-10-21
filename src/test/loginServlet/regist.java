package test.loginServlet;

import test.loginDao.user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class regist extends HttpServlet{
    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String rpsw = request.getParameter("rpsw");
        if(username==null||username.trim().isEmpty()){
            request.setAttribute("msg", "* 用户不存在");
            request.getRequestDispatcher("/Regist.jsp").forward(request, response);
            return;
        }
        if(password==null||password.trim().isEmpty()){
            request.setAttribute("msg", "* 密码不存在");
            request.getRequestDispatcher("/Regist.jsp").forward(request, response);
            return;
        }
        if(!password.equals(rpsw)){
            request.setAttribute("msg", "* 密码错误");
            request.getRequestDispatcher("/Regist.jsp").forward(request, response);
            return;
        }
        user u = new user();
        u.addUser(username,password);
        request.setAttribute("msg", "用户："+username+"注册成功");
        request.getRequestDispatcher("/index.jsp").forward(request, response);

    }
}
