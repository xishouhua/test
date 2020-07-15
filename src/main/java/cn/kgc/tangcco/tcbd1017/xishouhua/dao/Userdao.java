package cn.kgc.tangcco.tcbd1017.xishouhua.dao;

import java.sql.SQLException;

import cn.kgc.tangcco.tcbd1017.xishouhua.pojo.User;

/**
*@author   席首华
*@version  1.0   </br>
   创建时间   2019年11月9日     下午5:05:28
  类描述：
*
*/
public interface Userdao {
/**
 * 登录
 * @throws SQLException 
 */
	public abstract User selectUserByAccountAndPassword(User user) throws SQLException;
}
