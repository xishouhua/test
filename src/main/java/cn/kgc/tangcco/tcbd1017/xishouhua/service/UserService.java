package cn.kgc.tangcco.tcbd1017.xishouhua.service;
/**
*@author   席首华
*@version  1.0   </br>
   创建时间   2019年11月9日     下午5:11:44
  类描述：
*
*/

import java.util.Map;

import cn.kgc.tangcco.tcbd1017.xishouhua.pojo.User;

public interface UserService {

	public abstract Map<String, Object> login(User user);
	
}
