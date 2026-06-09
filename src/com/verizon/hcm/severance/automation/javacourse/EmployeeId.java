package com.verizon.hcm.severance.automation.javacourse;

public class EmployeeId {

	private void raguEmployeeId() {
	System.out.println("Ragu EMployee ID 54321");
	System.out.println("inside class access only");
	}
	
	public void raguEmployee() {
		System.out.println("Ragu EMployee Name");
		System.out.println("global access");
		}
	
	public static void main(String[] args) {
		
		CompanyId company = new CompanyId();
		company.raguCompanyId();
		EmployeeId employeeId = new EmployeeId();
		employeeId.raguEmployeeId();
		}
	
}


