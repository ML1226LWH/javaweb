package swu.lwh;

import java.sql.SQLException;

public class Examine {
    public static String check(String users,String pwd) throws SQLException {
        String sql="SELECT * FROM users_examine WHERE users='"+users+"';";
        String pwd_return = DBUtils.getPwd(sql);
        System.out.println("return:"+pwd_return);
        System.out.println("��������룺"+pwd);
        String examine ;
        System.out.println(pwd_return);
        System.out.println(pwd);
        if(pwd.equals(pwd_return))
        {
            System.out.println("��ѯ�ɹ���");
            examine="��¼�ɹ�! ���"+users+"!";
        }
        else{
            System.out.println("��ѯʧ�ܣ�");
            examine ="��¼ʧ�ܣ�";
        }
        return examine;

    }
}
