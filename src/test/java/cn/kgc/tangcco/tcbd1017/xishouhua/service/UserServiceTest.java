package cn.kgc.tangcco.tcbd1017.xishouhua.service;

import java.util.Map;

import org.junit.Test;

import cn.kgc.tangcco.tcbd1017.xishouhua.pojo.User;
import cn.kgc.tangcco.tcbd1017.xishouhua.service.impl.UserServiceImpl;

/**
*@author   席首华
*@version  1.0   </br>
   创建时间   2019年11月12日     上午10:56:42
  类描述：
*
*/
public class UserServiceTest {

	UserService userService = new UserServiceImpl();
	
	@Test
	public void login() {
		Map<String, Object> map = userService.login(new User("xsh", "123123"));
		String status=map.get("status").toString();
		if (status.equals("success")) {
			System.out.println("登录成功！");
			User user=(User) map.get("data");
			System.out.println(user);
		}
	}
}
