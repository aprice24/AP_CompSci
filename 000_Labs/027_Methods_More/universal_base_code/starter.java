/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		myCharacter rogue = new myCharacter("Rogue", 5, 10, 9, 3);
		rogue.myToString();
		
		myCharacter wizard = new myCharacter("Wizard", 2, 6, 7, 10);
		wizard.myToString();
		
		myCharacter warrior = new myCharacter("Warrior", 10, 8, 4, 2);
		warrior.myToString();
		
	}
}

