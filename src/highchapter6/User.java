package highchapter6;

import java.util.Date;

/**
 * 实体类User
 * @author xianxian
 *
 */
public class User {

	private String name;
	private String pwd;
	private String email;
	private Date birthday;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", pwd=" + pwd + ", email=" + email + ", birthday=" + birthday + "]";
	}
	public User(String name, String pwd, String email, Date birthday) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.email = email;
		this.birthday = birthday;
	}
	public User() {
		super();
	}
	
	
}
