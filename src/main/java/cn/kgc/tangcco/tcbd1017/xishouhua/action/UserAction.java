package cn.kgc.tangcco.tcbd1017.xishouhua.action;
/**
*@author   席首华
*@version  1.0   </br>
   创建时间   2019年11月9日     下午5:22:35
  类描述：
*
*/

import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.kgc.tangcco.commons.servlet.BaseServlet;
import cn.kgc.tangcco.tcbd1017.xishouhua.pojo.User;
import cn.kgc.tangcco.tcbd1017.xishouhua.service.UserService;
import cn.kgc.tangcco.tcbd1017.xishouhua.service.impl.UserServiceImpl;
@WebServlet(urlPatterns = "/login.action")
public class UserAction extends BaseServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5535667435604544074L;
	UserService userService = new UserServiceImpl();
	
	
	
	public void login(HttpServletRequest request , HttpServletResponse response) {
		String account = request.getParameter("account");
		String password = request.getParameter("password");
		System.out.println(account+">>>>>"+password);
		Map<String, Object> login = userService.login(new User(account, password));
		printJson(response, login);
		String string = login.get("status").toString();
		if (string.equals("success")) {
			User user = (User) login.get("data");
			System.out.println(user);
		}else {
			System.out.println("登录失败！");
			System.out.println("shia");
		}
	}
}
