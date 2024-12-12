/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		michael.raiseSalary(40);
		double a = michael.getAnnualSalary();
		System.out.println("Michael's Annual Salary: " + a);
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.employeeToString();
		dwight.raiseSalary(20);
		double b = dwight.getAnnualSalary();
		System.out.println("Dwight's Annual Salary: " + b);

		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString();
		jim.raiseSalary(30);
		double c = jim.getAnnualSalary();
		System.out.println("Jim's Annual Salary: " + c);
		
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250.0);
		pam.employeeToString();
		pam.raiseSalary(70);
		double d = pam.getAnnualSalary();
		System.out.println("Pam's Annual Salary: " + d);
		
		Employee molly = new Employee(2012, "Molly", "Price", 10500.0);
		molly.employeeToString();
		molly.raiseSalary(10);
		double e = molly.getAnnualSalary();
		System.out.println("Molly's Annual Salary: " + e);
	}
}
