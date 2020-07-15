package cn.kgc.tangcco.tcbd1017.xishouhua.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import cn.kgc.tangcco.commons.jdbc.BaseDBUtils;
import cn.kgc.tangcco.tcbd1017.xishouhua.dao.Userdao;
import cn.kgc.tangcco.tcbd1017.xishouhua.pojo.User;

/**
*@author   席首华
*@version  1.0   </br>
   创建时间   2019年11月9日     下午5:07:05
  类描述：
*
*/
public class UserDaoImpl implements Userdao{
	QueryRunner qr = new QueryRunner();

	@Override
	public User selectUserByAccountAndPassword(User user) throws SQLException {
		User user2=null;
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT id , name , account , password , createtime from loginTable where 1=1 and account=? and password=? ");
		Object[] params = {user.getAccount(),user.getPassword()};
		user2=qr.query(BaseDBUtils.getConnection(), sql.toString(), params, new BeanHandler<User>(User.class));
		return user2;
	}

	
	
}
