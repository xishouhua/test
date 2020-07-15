package cn.kgc.tangcco.tcbd1017.xishouhua.service.impl;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import cn.kgc.tangcco.commons.spring.ClassPathXmlApplicationContext;
import cn.kgc.tangcco.tcbd1017.xishouhua.dao.Userdao;
import cn.kgc.tangcco.tcbd1017.xishouhua.pojo.User;
import cn.kgc.tangcco.tcbd1017.xishouhua.service.UserService;

/**
*@author   席首华
*@version  1.0   </br>
   创建时间   2019年11月9日     下午5:12:30
  类描述：
*
*/
public class UserServiceImpl implements UserService{
	private static Userdao userdao;
	static {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring/ApplicationContext-dao.xml");
		try {
			userdao=(Userdao) classPathXmlApplicationContext.getBean(Userdao.class.getSimpleName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Map<String, Object> login(User user) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", "failed");
		try {
			User user2 = userdao.selectUserByAccountAndPassword(user);
			if (user2!=null) {
				map.put("status", "success");
				map.put("data", user2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return map;
	}

}
