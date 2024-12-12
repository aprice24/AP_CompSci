/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


public class starter {
    public static void main(String[] args) {
        myCharacter emptyCharacter = new myCharacter();
        emptyCharacter.printStats();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a role (Wizard, Warrior, Rogue): ");
        String userInput = scanner.nextLine();
        
        myCharacter definedCharacter = new myCharacter(userInput);
        definedCharacter.printStats();

    }
}