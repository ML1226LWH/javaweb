package swu.lwh;

public class FalseShow {
    public String pwdError(){
        StringBuilder str=new StringBuilder();
        str.append("<%@ page contentType=\"text/html;charset=UTF-8\" language=\"java\" %>\n" +
                "<html>\n" +
                "  <head>\n" +
                "    <title>密码错误！请重新输入！</title>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <div margin=\"0 auto\">\n" +
                "      <h1>登陆界面</h1><br><br>\n" +
                "    <form method=\"post\" action=\"./login\" text-align=\"center\">\n" +
                "      用户名：<input type=\"text\" name=\"users\"/><br>\n" +
                "      密码：&nbsp;&nbsp;&nbsp;<input type=\"password\" name=\"pwd\"/><br><br>\n" +
                "      <tr><td>验 证:</td><td><input type='text' name='code'  value=''></td></tr>\n" +
                "      <tr><td>&nbsp;</td><td><img src=\"./validateCode\" /></td></tr><br>\n" +
                "      <input type=\"submit\" text-align=\"center\" value=\"登录\"/>\n" +
                "    </form>\n" +
                "    </div>\n" +
                "  </body>\n" +
                "</html>\n");
        String html=str.toString();
        return html;
    }

    public String codeError(){
        StringBuilder str=new StringBuilder();
        str.append("<%@ page contentType=\"text/html;charset=UTF-8\" language=\"java\" %>\n" +
                "<html>\n" +
                "  <head>\n" +
                "    <title>验证码错误！请重新输入！</title>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <div margin=\"0 auto\">\n" +
                "      <h1>登陆界面</h1><br><br>\n" +
                "    <form method=\"post\" action=\"./login\" text-align=\"center\">\n" +
                "      用户名：<input type=\"text\" name=\"users\"/><br>\n" +
                "      密码：&nbsp;&nbsp;&nbsp;<input type=\"password\" name=\"pwd\"/><br><br>\n" +
                "      <tr><td>验 证:</td><td><input type='text' name='code'  value=''></td></tr>\n" +
                "      <tr><td>&nbsp;</td><td><img src=\"./validateCode\" /></td></tr><br>\n" +
                "      <input type=\"submit\" text-align=\"center\" value=\"登录\"/>\n" +
                "    </form>\n" +
                "    </div>\n" +
                "  </body>\n" +
                "</html>\n");
        String html=str.toString();
        return html;
    }

}
