/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc  = new Scanner (System.in);
		
		System.out.println("What is your name? ");
		String name = sc.nextLine();
		System.out.println("Your name is " + name + ".");
		
		System.out.println("What is your age? ");
		String age = sc.nextLine();
		System.out.println("Your are " + age + " years old.");
		
		System.out.println("What is your birthday month? ");
		String month = sc.nextLine();
		System.out.println("Your birthday month is " + month + ".");
		
		System.out.println("What is your birthday day? ");
		String day = sc.nextLine();
		System.out.println("Your birthday day is " + day + ".");
		
		System.out.println("What is your birthday year? ");
		String year = sc.nextLine();
		System.out.println("Your birthday year is " + year + ".");
		
		System.out.println("How much is a buck fifty? ");
		String money = sc.nextLine();
		System.out.println("A buck fifty is " + money + ".");
		
	}
}
