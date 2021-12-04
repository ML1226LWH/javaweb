package swu.lwh;

import java.sql.SQLException;

public class Examine {
    public static String check(String users,String pwd) throws SQLException {
        String sql="SELECT * FROM users_examine WHERE users='"+users+"'";
        String pwd_return = DBUtils.getPwd(sql);
        System.out.println("return:"+pwd_return);
        System.out.println("输入的密码："+pwd);
        String examine ="登陆失败！";
        if(pwd==pwd_return)
        {
            examine="登陆成功! 你好"+users+"!";
        }
        return examine;

    }
}
