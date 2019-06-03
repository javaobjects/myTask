package highchapter6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 * 数据访问对象UserDao 
 * @author xianxian
 *
 */
public class UserDao {
	// 添加一个用户信息
	public int addUser(User user) {
		int rows = 0;

		Connection conn=null;
		PreparedStatement stmt=null;
		
		try {
			conn=DBUtil.getConnection();
			conn.setAutoCommit(false);
			stmt=conn.prepareStatement("insert into tab_user (col_name,col_pwd,col_email,col_birthday) values (?,?,?,?)");
			/*
			 * 注意：在执行更新的sql语句之前，需要先给占位符赋值
			 */
	        stmt.setString(1, user.getName());
			stmt.setString(2,user.getPwd());
			stmt.setString(3, user.getEmail());
			/*Date date=emp.getHiredate();
			long time=date.getTime();
			java.sql.Date date2=new java.sql.Date(time);*/
			stmt.setDate(4,new java.sql.Date(user.getBirthday().getTime()));
			
			/*
			 * 执行更新
			 */
			rows=stmt.executeUpdate();
			if(rows == 1) {
				conn.commit();
			}else {
				conn.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}finally
		{
			DBUtil.release(conn, stmt, null);
		}
		return rows;
	}

	//更新某个用户信息
	public int updateUser(User user) {
		int rows = 0;
		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = DBUtil.getConnection();
			conn.setAutoCommit(false);
			stmt = conn.prepareStatement("update tab_user set col_name=?,col_pwd=?,"
					+ "col_email=?,col_birthday=? where col_name=?");
			//注意：在执行更新操作之前必须 给点位符赋值
			stmt.setString(1,user.getName());//1表示第一个？号
			stmt.setString(2,user.getPwd());//2表示第二个？号
			stmt.setString(3,user.getEmail());//3表示第三个？号
			
//			Date date = emp.getHiredate();
//			long time = date.getTime();
//			java.sql.Date date2 = new java.sql.Date(time);
			
			stmt.setDate(4,new java.sql.Date(user.getBirthday().getTime()));
			stmt.setString(5,user.getName());
			
			//执行 更新
			rows = stmt.executeUpdate();
			if(rows == 1) {
				conn.commit();
			}else {
				conn.rollback();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}finally {
			DBUtil.release(conn, stmt, null);
		}
		return rows;
	}
	//删除某个用户信息
	public int deleteUserByName(String name) {
		int rows = 0;
		Connection conn=null;
		PreparedStatement stmt=null;
		try {
			conn=DBUtil.getConnection();
			conn.setAutoCommit(false);
			String delete_user_by_name="delete from tab_user where col_name=?";
			stmt = conn.prepareStatement(delete_user_by_name);//sql语句进行预编译
			stmt.setString(1,name);//对sql语句进行赋值
			
			rows=stmt.executeUpdate(delete_user_by_name);
			if(rows == 1) {
				conn.commit();
			}else {
				conn.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}finally
		{
			DBUtil.release(conn, stmt, null);
		}
		return rows;
	}
	
	
	public int deleteUserByNameA(String name) {
		int rows = 0;
		Connection conn=null;
		PreparedStatement stmt=null;
		try {
			conn=DBUtil.getConnection();
			conn.setAutoCommit(false);
			String delete_user_by_name="delete from tab_user where col_name=?";
			stmt=conn.prepareStatement(delete_user_by_name);
			stmt.setString(1,name);
			rows=stmt.executeUpdate();
			if(rows == 1) {
				conn.commit();
			}else {
				conn.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}finally
		{
			DBUtil.release(conn, stmt, null);
		}
		return rows;
	}
}
