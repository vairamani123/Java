package com.dedalus.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.dedalus.model.Employee;
import com.dedalus.util.MyDbConnection;

public class EmployeeDao {

	Connection con;
	Statement stmt;
	PreparedStatement ps;
	ResultSet rs;

	public void insertEmployee(Employee emp) {

		con = MyDbConnection.getMyConnection();
		try {
			ps = con.prepareStatement("insert into dalemp values(?,?)");
			ps.setString(2, emp.getEname());
			ps.setInt(1, emp.getEmpno());

			int noofrows = ps.executeUpdate();
			System.out.println(noofrows + " got inserted into DB successfully!");
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void showEmployee() {
		con = MyDbConnection.getMyConnection();
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from dalemp");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " -- " + rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void updateEmployee(Employee emp) {
		con = MyDbConnection.getMyConnection();
		try {

			ps = con.prepareStatement("update dalemp set empname = ? where empno = ?");
			ps.setString(2, emp.getEname());
			ps.setInt(1, emp.getEmpno());

			int noofrows = ps.executeUpdate();
			System.out.println(noofrows + " employee(s) updated successfully!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteEmployee(int empno) {
		con = MyDbConnection.getMyConnection();
		try {
			ps = con.prepareStatement("delete from dalemp where EMPNO = ?");
			ps.setInt(1, empno);
			
			int noofrows = ps.executeUpdate();
			System.out.println(noofrows + " employee(s) deleted successfully!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
