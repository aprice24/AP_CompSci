/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a whole number: ");
		int number1 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Please enter another whole number: ");
		int number2 = sc.nextInt();
		sc.nextLine();
		
		if(number1 > number2){
			System.out.println(number1 + " is greater than " + number2 + "!");
			}
		else if(number1 < number2){
			System.out.println(number1 + " is less than " + number2 + "!");
			}
		else if(number1 == number2){
			System.out.println(number1 + " is equal to " + number2 + "!");
			}
		
		else{
			}
		 
	}
}
