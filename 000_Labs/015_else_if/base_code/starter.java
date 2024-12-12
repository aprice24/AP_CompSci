/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		 
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Guess a number between 1 and 1000.");
		int number1 = sc.nextInt();
		
		if(number1 == 24){
			System.out.println("Correct!");
			}
		else if(number1 > 24){
			System.out.println("You guessed higher than the number.");
			}
		else if(number1 < 24){
			System.out.println("You guessed lower than the number.");
			}
		else{
			}
	}
}
