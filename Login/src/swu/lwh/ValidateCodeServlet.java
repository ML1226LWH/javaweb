package swu.lwh;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.OutputStream;

public class ValidateCodeServlet extends HttpServlet {
    private static final long serialVersionUID= -7492822205471471700L;
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        doPost(request,response);
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession(true);

        ValidateCode coder = new ValidateCode();
        session.setAttribute(AuthFilter.LOGIN_VALIDATE_CODE, coder.getCodeString());
        response.setContentType("image/png");
        //if(coder.getCodeString().equals(request.getParameter()))
        try (OutputStream output = response.getOutputStream()) {
            coder.outputCodeImage(output);

        }
    }
}
