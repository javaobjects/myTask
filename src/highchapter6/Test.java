package highchapter6;

import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
	public static void test_conn() {
		Connection conn = DBUtil.getConnection();
		System.out.println(conn);
	}
	public static void test_addUser() {
		UserDao dao = new UserDao();
		try {
			User user1 = new User("张三","888888","zhangsan@126.com",
					new SimpleDateFormat("YYYY-MM-DD").parse("1986-10-11"));
			User user2 = new User("李四","999999","lisi@126.com",
                    new SimpleDateFormat("YYYY-MM-DD").parse("1988-10-23"));
			User user3 = new User("王五","777777","wangwu@126.com",
                    new SimpleDateFormat("YYYY-MM-DD").parse("1988-10-23"));
			dao.addUser(user1);
			dao.addUser(user2);
			dao.addUser(user3);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public static void test_updateUser() {
		UserDao dao = new UserDao();
		User user = new User("张三","888888","zhangsan@126.com",new Date());
		dao.updateUser(user);
	}
	public static void test_deleteUserByName() {
		UserDao dao = new UserDao();
		dao.deleteUserByName("李四");
	}
	public static void main(String[] args) {
//		test_conn();//连接测试
//		test_addUser();//添加测试
//		test_updateUser();//更新测试
//		test_deleteUserByName();//删除测试
	}
}
