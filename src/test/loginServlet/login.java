package test.loginServlet;

import test.loginDao.user;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String verifyc  = request.getParameter("verifycode");
        String svc =(String) request.getSession().getAttribute("sessionverify");
        String psw =new user().findUsername(username);
        if(!svc.equalsIgnoreCase(verifyc)){
            request.setAttribute("username", username);
            request.setAttribute("msg1", "* 验证码错误");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
            return;
        }
        if(psw ==null){
            request.setAttribute("username", username);
            request.setAttribute("msg2", "* 用户不存在");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
            return;
        }
        if(psw!=null&&!psw.equals(password)){
            request.setAttribute("username", username);
            request.setAttribute("msg3", "* 密码错误");
            request.getRequestDispatcher("/index.jsp").forward(request, response);
            return;
        }
        if(psw.equals(password)){
            if(username.equals("admin")){
                //teachers and admin login page
                request.getRequestDispatcher("/Center.jsp").forward(request, response);
            }else{
                request.setAttribute("username",username);
                request.getRequestDispatcher("/FormulaEdit.jsp").forward(request, response);
            }
        }

    }
}
