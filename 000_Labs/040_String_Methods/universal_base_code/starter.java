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
		System.out.println("Please input a full name: ");
		String name = sc.nextLine();
		
		String lastName = getLastName(name);
        System.out.println("Last Name: " + lastName);
	}
	
	public static String getLastName(String name) {
        int i = name.lastIndexOf(" ");
        if (i == -1) {
            return name;
        }
        return name.substring(i + 1);
    }
}
