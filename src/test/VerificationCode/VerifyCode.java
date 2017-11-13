package test.VerificationCode;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class VerifyCode extends HttpServlet{
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Controller vc = new Controller();
        BufferedImage image = vc.getImage(90,30);
        request.getSession().setAttribute("sessionverify", vc.getText());
        Controller.output(image, response.getOutputStream());
    }
}
