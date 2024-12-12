/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please input a name: ");
		String name = sc.nextLine();
		
		System.out.println("How many times should it be outputed?");
		int number = sc.nextInt();
		
		int c = 0;
		
		while(true)
		{
			if(number == c)
			{
				break;
			}
			System.out.println(name);
			c = c + 1;
		}
	}
}
