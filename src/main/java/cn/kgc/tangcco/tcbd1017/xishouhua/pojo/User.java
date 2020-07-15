package cn.kgc.tangcco.tcbd1017.xishouhua.pojo;
/**
*@author   席首华
*@version  1.0   </br>
   创建时间   2019年11月9日     下午2:04:15
  类描述：
*
*/

import java.time.LocalDateTime;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

	/**
	 * id
	 */
	private int id;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 账号
	 */
	private String account;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 创建时间
	 */
	private Date createtime;
	public User(String account, String password) {
		super();
		this.account = account;
		this.password = password;
	}
	public User(String name, String account, String password) {
		super();
		this.name = name;
		this.account = account;
		this.password = password;
	}
	
	
}
