/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a whole number between 1-1000: ");
		int guess = sc.nextInt();
		
		int secret = 24;
		while(true){
			if(guess == 24){
			System.out.println("Correct!");
			break;
			}
			if(guess != 24){
			System.out.println("Incorrect, try again:");
			guess = sc.nextInt();
			}
		}
		System.out.println("You won!");
	}
}
