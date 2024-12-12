/*
	Author:
	Date:
	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("First Number:");
		int num1 = sc.nextInt();
		
		System.out.println("Second number (decimal): ");
		double num2 = sc.nextDouble();
		
		double answer;
		answer = Math.pow(num2, num1);
		
		System.out.print(num2 + "to the" + num1 + "power, is");
		System.out.println(answer);
	}
}
