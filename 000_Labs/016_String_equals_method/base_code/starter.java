/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
	
		String wiz = "Wizard";
		String war = "Warrior";
		String rog = "Rogue";
		
		System.out.println("Would you like to be a Wizard, Warrior, or a Rouge?");
		String answer = sc.nextLine();
		
       if (answer.equalsIgnoreCase(wiz)) {
            System.out.println("You chose Wizard!");
        (answer.equalsIgnoreCase(war)) {
            System.out.println("You chose Warrior!");
        } else if (answer.equalsIgnoreCase(rog)) {
            System.out.println("You chose Rogue!");
        } else {
            System.out.println("Invalid choice. Please choose Wizard, Warrior, or Rogue.");
        }
	}
}
