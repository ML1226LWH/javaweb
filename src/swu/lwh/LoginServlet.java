package swu.lwh;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.sql.SQLException;

import static swu.lwh.Examine.check;

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID= 1743051812167088094L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response){
        response.setCharacterEncoding("UTF-8");
        String users=request.getParameter("users");
        String password=request.getParameter("pwd");
        Logs logs=new Logs();
        logs.setUsers(users);
        logs.setPwd(password);

        StringBuilder sb = new StringBuilder();
        String str= null;
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
        try {
            sb.append(check(logs.getUsers(),logs.getPwd()));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(str);
        sb.append("</h1></div>"+ "</body></html>");//打印输出登录信息
        try(Writer writer=response.getWriter()){
            writer.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
