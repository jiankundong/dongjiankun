package com.jdbc;
import java.sql.*;
public class Test_conn {
	public static void main(String[] args) throws Exception {
		// TODO 自动生成的方法存根
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc","root","djk123");
		//
		Statement yuju=conn.createStatement();
		//定义sql
		String sql="UPDATE tb_user SET email='jack@163.com' WHERE id=1";
		//执行语句
		yuju.execute(sql);
	}

}
