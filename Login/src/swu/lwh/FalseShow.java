package swu.lwh;

public class FalseShow {
    public String pwdError(){
        StringBuilder str=new StringBuilder();
        str.append("<%@ page contentType=\"text/html;charset=UTF-8\" language=\"java\" %>\n" +
                "<html>\n" +
                "  <head>\n" +
                "    <title>����������������룡</title>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <div margin=\"0 auto\">\n" +
                "      <h1>��½����</h1><br><br>\n" +
                "    <form method=\"post\" action=\"./login\" text-align=\"center\">\n" +
                "      �û�����<input type=\"text\" name=\"users\"/><br>\n" +
                "      ���룺&nbsp;&nbsp;&nbsp;<input type=\"password\" name=\"pwd\"/><br><br>\n" +
                "      <tr><td>�� ֤:</td><td><input type='text' name='code'  value=''></td></tr>\n" +
                "      <tr><td>&nbsp;</td><td><img src=\"./validateCode\" /></td></tr><br>\n" +
                "      <input type=\"submit\" text-align=\"center\" value=\"��¼\"/>\n" +
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
                "    <title>��֤��������������룡</title>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <div margin=\"0 auto\">\n" +
                "      <h1>��½����</h1><br><br>\n" +
                "    <form method=\"post\" action=\"./login\" text-align=\"center\">\n" +
                "      �û�����<input type=\"text\" name=\"users\"/><br>\n" +
                "      ���룺&nbsp;&nbsp;&nbsp;<input type=\"password\" name=\"pwd\"/><br><br>\n" +
                "      <tr><td>�� ֤:</td><td><input type='text' name='code'  value=''></td></tr>\n" +
                "      <tr><td>&nbsp;</td><td><img src=\"./validateCode\" /></td></tr><br>\n" +
                "      <input type=\"submit\" text-align=\"center\" value=\"��¼\"/>\n" +
                "    </form>\n" +
                "    </div>\n" +
                "  </body>\n" +
                "</html>\n");
        String html=str.toString();
        return html;
    }

}
