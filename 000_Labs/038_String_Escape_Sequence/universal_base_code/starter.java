/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Tell me something sassy or your pet peeve: ");
        String input = sc.nextLine();	
		
		System.out.println("\nWow! Let me quote you:");
        System.out.println("\n\""+ input + "\"");
	}
}
