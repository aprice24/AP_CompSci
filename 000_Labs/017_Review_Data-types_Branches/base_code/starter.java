/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the character's name: ");
		String name = sc.nextLine();
		
		System.out.println("Please enter the character's title: ");
		String title = sc.nextLine();
		
		String wiz = "Wizard";
		String war = "Warrior";
		String rog = "Rogue";
		
		System.out.println("Would you like to be a Wizard, Warrior, or a Rouge?");
		String answer = sc.nextLine();
		
       if (answer.equalsIgnoreCase(wiz)) {
            System.out.println("You chose Wizard!");
        } else if (answer.equalsIgnoreCase(war)) {
            System.out.println("You chose Warrior!");
        } else if (answer.equalsIgnoreCase(rog)) {
            System.out.println("You chose Rogue!");
        } else {
            System.out.println("Invalid choice. Please choose Wizard, Warrior, or Rogue.");
        }
        
        System.out.println(" ");
        
        ///////
        
        int Strength = 0;
        int Dexterity = 0;
        int Intelligence = 0;
        int Charisma = 0;
        int totalpoints = 20;
        
        System.out.println("Choose the traits you wish to have (10 POINTS MAXIMUM PER TRAIT):");
        System.out.println("Strength - Buff and able to carry larger items");
        System.out.println("Dexterity - Agile and moves quick");
        System.out.println("Intelligence - Better at magic spells!");
        System.out.println("Charisma - How personable");
       
        System.out.println(" ");
        System.out.println("You have " + totalpoints + " points left:");
        
        /////
        
        System.out.println(" ");
        System.out.println("How many points would you like to use on Strength?");
        int pointsUsed = sc.nextInt();
        
        if(pointsUsed <= 10 && pointsUsed <= totalpoints){
			Strength += pointsUsed;
            totalpoints -= pointsUsed;
			System.out.println("You used " + pointsUsed + " points.");
            System.out.println("You have " + totalpoints + " points left.");
		} else{
			System.out.println("Invalid choice. Please select another number.");
			}
			
		System.out.println(" ");
        System.out.println("How many points would you like to use on Dexterity?");
        pointsUsed = sc.nextInt();
        
        if(pointsUsed <= 10 && pointsUsed <= totalpoints){
			Dexterity += pointsUsed;
            totalpoints -= pointsUsed;
			System.out.println("You used " + pointsUsed + " points.");
            System.out.println("You have " + totalpoints + " points left.");
		} else{
			System.out.println("Invalid choice. Please select another number.");
			}
			
		System.out.println(" ");
        System.out.println("How many points would you like to use on Intelligence?");
        pointsUsed = sc.nextInt();
        
		if(pointsUsed <= 10 && pointsUsed <= totalpoints){
			Intelligence += pointsUsed;
            totalpoints -= pointsUsed;
			System.out.println("You used " + pointsUsed + " points.");
            System.out.println("You have " + totalpoints + " points left.");
		} else{
			System.out.println("Invalid choice. Please select another number.");
			}
			
			System.out.println(" ");
			System.out.println("How many points would you like to use on Charisma?");
			pointsUsed = sc.nextInt();
        
		if(pointsUsed <= 10 && pointsUsed <= totalpoints){
			Charisma += pointsUsed;
            totalpoints -= pointsUsed;
			System.out.println("You used " + pointsUsed + " points.");
            System.out.println("You have " + totalpoints + " points left.");
		} else{
			System.out.println("Invalid choice. Please select another number");
			}
		
		System.out.println(" ");
		System.out.println("Final Stats:");
        System.out.println("Strength: " + Strength);
        System.out.println("Dexterity: " + Dexterity);
        System.out.println("Intelligence: " + Intelligence);
        System.out.println("Charisma: " + Charisma);
        System.out.println("Points left: " + totalpoints);
        
	}
}
