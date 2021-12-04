package swu.lwh;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.Filter;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "AuthFilter")
public class AuthFilter implements Filter{
    public static final long servialVersionUID=;
    public final static String LOGIN_STATUS = "LOGIN_STATUS";
    public final static String LOGIN_VALIDATE_CODE = "LOGIN_VALIDATE_CODE";

    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        chain.doFilter(request, response);
        HttpSession session = request.getSession(true);
        Boolean status = (Boolean) session.getAttribute(LOGIN_STATUS);

        if (status == null || status.equals(Boolean.FALSE)) {
            response.sendRedirect("/myapp/login.html");
        } else {
            chain.doFilter(request, response);
        }

    }
}
