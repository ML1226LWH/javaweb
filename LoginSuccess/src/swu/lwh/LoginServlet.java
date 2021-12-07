package swu.lwh;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Writer;
import java.sql.SQLException;

import static swu.lwh.Examine.check;

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID= 1743051812167088094L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
        response.setCharacterEncoding("UTF-8");
        String users=request.getParameter("users");
        String password=request.getParameter("pwd");
        String code=request.getParameter("code");
        Logs logs=new Logs();
        logs.setUsers(users);
        logs.setPwd(password);
        System.out.println("�û����������£�"+users);
        System.out.println("�û����洢���£�"+logs.getUsers());
        StringBuilder sb = new StringBuilder();
        sb.append("<html>" +
                        "<head>" +
                        "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8' />" +
                        "<style>" +
                        ".menu {font-weight:bold; font-size:1em; padding:2em}" +
                        "tr {line-height:2.5em}" +
                        "</style>" +
                        "</head>" +
                        "<body>" +
                        "<div style='text-align:center'><h1> ");
        HttpSession session = request.getSession(true);
        String validateCode = (String) session.getAttribute(AuthFilter.LOGIN_VALIDATE_CODE);
        if (validateCode == null || !validateCode.equalsIgnoreCase(code)) {
            response.sendRedirect("index.jsp");
            return;
        }
        try {


            if(check(logs.getUsers(),logs.getPwd()).equals("��¼ʧ�ܣ�"))
            {
                response.sendRedirect("index.jsp");
            }
            else{sb.append(check(logs.getUsers(),logs.getPwd()));}
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
        sb.append("</h1></div>"+ "</body></html>");//��ӡ�����¼��Ϣ
        try(Writer writer=response.getWriter()){
            writer.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
