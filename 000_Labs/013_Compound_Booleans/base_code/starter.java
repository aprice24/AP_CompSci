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
		
		System.out.println("Please enter another whole number: ");
		int number3 = sc.nextInt();
		sc.nextLine();
		
		if(number1 < number2 && number1 < number3){
			System.out.println("The smallest integer is: " + number1);
			}
		if(number2 < number1 && number2 < number3){
			System.out.println("The smallest integer is: " + number2);
			}
		if(number3 < number2 && number3 < number1){
			System.out.println("The smallest integer is: " + number3);
			}
		
		if(number1 > number2 && number1 > number3){
			System.out.println("The biggest integer is: " + number1);
			}
		if(number2 > number1 && number2 > number3){
			System.out.println("The biggest integer is: " + number2);
			}
		if(number3 > number2 && number3 > number1){
			System.out.println("The biggest integer is: " + number3);
			}
	
		else{
		}
		 
	}
}
