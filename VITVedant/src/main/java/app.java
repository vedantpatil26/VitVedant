package myproject;
import java.util.ResourceBundle;
public class app{
	public int userlogin(String in_user,String in_pwd) {
		ResourceBundle rb=ResourceBundle.getBundle("config");
		String uname=rb.getString("in_user");
		String pwd=rb.getString("in_pwd");
		if(in_user.equals(uname)&& in_pwd.equals(pwd))
			return 1;
		else
			return 0;
	}
}