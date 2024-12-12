/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(Math.max(13-6*11, 30%7*(-2)));
		System.out.println(Math.sqrt(3*8+31%7));
		System.out.println(Math.pow(37/3,35%21));
		System.out.println(Math.max(Math.pow(2,14%3),Math.sqrt(2*6)));
		
		System.out.println("Please enter a double value: ");
		double number1 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Please enter another double value: ");
		double number2 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("The max of the two values is: " + Math.max(number1,number2));
		System.out.println("The square root of" + " " + number2 + " " +
		"is: " + Math.sqrt(number2));
		System.out.println(number1 + " " + "to the power of" + " " + number2 + 
		" " + "is: " + Math.pow(number1, number2));
	
	}
}
