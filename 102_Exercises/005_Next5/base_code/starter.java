/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a number: ");
	
	int number1 = sc.nextInt();
	sc.nextLine();

	System.out.println("The next five numbers of" + " " + number1 + " " + "are: " + (number1 + 1) + " " + (number1 + 2) + " " + (number1 + 3) + " " + (number1 + 4) + " " + (number1 + 5));
	
	System.out.println("The next five multiples of" + " " + number1 + " " + "are: " + (number1 * 2) + " " + (number1 * 3) + " " + (number1 * 4) + " " + (number1 * 5) + " " + (number1 * 6));
	
	System.out.println("Here is" + " " + number1 + " " + "divided by a hundred: " + (number1 / 100));
	
	System.out.println("Here is" + " " + number1 + " " + "divided by ten: " + (number1 / 10));
	
	}
}
