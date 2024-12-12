/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter an integer:");
		int number1 = sc.nextInt();
		
		System.out.println("Please enter another integer:");
		int number2 = sc.nextInt();
		
		if(number1%2 == 0){
			System.out.println("Your first number is even.");
			}
		else{
			System.out.println("Your first number is odd.");
			}
		
		if(number2%2 == 0){
			System.out.println("Your second number is even.");
			}
		else{
			System.out.println("Your second number is odd.");
			}
		
		if(number1%3 == 0 && number1%4 == 0 && number1%5 == 0){
			System.out.println("Your first number is divisible by 3, 4, and 5.");	
		}
		else{
			System.out.println("Your first number is not divisible by 3, 4, and 5.");	
		}
		
		if(number2%3 == 0 && number2%4 == 0 && number2%5 == 0){
			System.out.println("Your first number is divisible by 3, 4, and 5.");	
		}
		else{
			System.out.println("Your second number is not divisible by 3, 4, and 5.");	
		}
		
		
	}
}
