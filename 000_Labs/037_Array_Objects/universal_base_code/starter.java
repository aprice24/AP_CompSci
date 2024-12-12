/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
        Warrior[] warriors = new Warrior[100];
        Wizard[] wizards = new Wizard[100];
            
        for (int i = 0; i < 100; i++) {
            warriors[i] = new Warrior("Warrior");
            wizards[i] = new Wizard("Wizard");
        }
            
        int warriorNum = 0;
        int wizardNum = 0;
        
        while (warriorNum < warriors.length && wizardNum < wizards.length) {
            Wizard wizard = wizards[wizardNum];
            Warrior warrior = warriors[warriorNum];

            if (!wizard.isDead()) {
                wizard.attack(warrior);
                if (warrior.isDead()) {
                    warriorNum++;
                }
            }

            if (!warrior.isDead()) {
                warrior.attack(wizard);
                if (wizard.isDead()) {
                    wizardNum++;
                }
            }
        }
        
        if (warriorNum < 100) {
            System.out.println(warriorNum + " warriors win!");
        } 
        else {
            System.out.println(wizardNum + " wizards win!");
        }
	}
}
