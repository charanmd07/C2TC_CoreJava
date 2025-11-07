//Program to demonstrate scrollable and updatable resultset
package com.Charan.tnsif.day22.v1.employeedb;

import java.sql.SQLException;

public class EmployeeDemo {

	public static void main(String[] args) {
		try {
			EmployeeService.showFirst();
			EmployeeService.showLast();
			EmployeeService.showPrevious();
			EmployeeService.showPrevious();
			EmployeeService.showNext();
			EmployeeService.updateSalary(65000);
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
