package swu.lwh;

import java.sql.SQLException;

public class Examine {
    public static String check(String users,String pwd) throws SQLException {
        String sql="SELECT * FROM users_examine WHERE users='"+users+"'";
        String pwd_return = DBUtils.getPwd(sql);
        System.out.println("return:"+pwd_return);
        System.out.println("��������룺"+pwd);
        String examine ="��½ʧ�ܣ�";
        if(pwd==pwd_return)
        {
            examine="��½�ɹ�! ���"+users+"!";
        }
        return examine;

    }
}
