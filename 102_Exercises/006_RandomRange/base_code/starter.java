/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random number");
		
		System.out.println("Please enter an integer:");
		int number1 = sc.nextInt();
		
		System.out.println("Please enter another integer (bigger than the first):");
		int number2 = sc.nextInt();
		
		System.out.println("Your range is" + " " + number1 + " " + "to" + " " + number2);
		
		System.out.println("Here are 5 numbers generated in that range.");
		int ran1 = ((int)(Math.random()*(number2-number1))+number1);
		int ran2 = ((int)(Math.random()*(number2-number1))+number1);
		int ran3 = ((int)(Math.random()*(number2-number1))+number1);
		int ran4 = ((int)(Math.random()*(number2-number1))+number1);
		int ran5 = ((int)(Math.random()*(number2-number1))+number1);
		
		System.out.println(ran1 + " " + ran2 + " " + ran3 +  " " + ran4 + " " + ran5);
		
	}
}
