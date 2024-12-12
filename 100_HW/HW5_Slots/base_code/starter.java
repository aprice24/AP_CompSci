/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to the Casino!");
	System.out.println("Here are the rules:");
	System.out.println("	If two numbers are the same, it doubles your money wagered.");
    System.out.println("	If three numbers are the same, it’s a jackpot! Triple the money wagered.");
    System.out.println("	If none are the same, you lose the money.");
	
	int total = 100;
	int wager = 0;
	while(true){
		System.out.println("You have " + total + " dollars.");
		System.out.println("Would you like to bet your money? y,Y,yes,Yes / n,N,no,No");
		String yn = sc.nextLine();
		
		if(yn.equalsIgnoreCase("y") || yn.equalsIgnoreCase("yes")){
			System.out.println("Please enter your wager:");
		}
		if(yn.equalsIgnoreCase("n") || yn.equalsIgnoreCase("no")){
			System.out.println("Goodbye! You left with " + total + " dollars.");
			break;
		}

		if(total > 0) {
			wager = sc.nextInt();
		}	
		if(wager > total){
			System.out.println("Invalid amount try again!");
			continue;
		}
		if(wager <= 0){
			System.out.println("Invalid amount try again!");
			continue;
		}
	
		int num1 = (int)(Math.random()*11);
		int num2 = (int)(Math.random()*11);
		int num3 = (int)(Math.random()*11);

		System.out.println(" ");
		System.out.println("The slot machine rolls:");
		System.out.println(num1 + " | " + num2 + " | " + num3 + " | ");
		System.out.println(" ");
	
		if(num1 == num2 && num2 == num3){
			System.out.println("Your money wagered was tripled!");
			total += wager * 3;
			}
		else if(num1 == num2 || num2 == num3 || num3 == num1){
			System.out.println("Your money wagered was doubled!");
			total += wager * 2;
			}
		else{
			System.out.println("Your money wagered was lost!");
			total -= wager; 
			}
		
		if (total <= 0) {
            System.out.println("You have no more money left! Goodbye!");
            break;
			
	}
}
}
}