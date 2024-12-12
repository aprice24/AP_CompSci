/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter what day it is:");
		System.out.println("0. Sunday");
		System.out.println("1. Monday");
		System.out.println("2. Tuesday");
		System.out.println("3. Wednesday");
		System.out.println("4. Thursday");
		System.out.println("5. Friday");
		System.out.println("6. Saturday");
		int number1 = sc.nextInt();
		sc.nextLine();
		
		if(number1 == 0){
			System.out.println("Wake up at 10:00 AM!");
		}
		else if(number1 == 1){
			System.out.println("Wake up at 7:00 AM!");
		}
		else if(number1 == 2){
			System.out.println("Wake up at 7:00 AM!");
		}
		else if(number1 == 3){
			System.out.println("Wake up at 7:00 AM!");
		}
		else if(number1 == 4){
			System.out.println("Wake up at 7:00 AM!");
		}
		else if(number1 == 5){
			System.out.println("Wake up at 7:00 AM!");
		}
		else if(number1 == 6){
			System.out.println("Wake up at 10:00 AM!");
		}
		
		else{
			}
	}
}
