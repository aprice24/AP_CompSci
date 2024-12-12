/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

public class Character {
    String role;
    int strength;
    int dexterity;
    int intelligence;
    int charisma;

    public Character() {
        strength = 0;
        dexterity = 0;
        intelligence = 0;
        charisma = 0;
        role = "Unknown";
    }

    public Character(String r, int s, int d, int i, int c) {
        if (r.equals("Wizard") || r.equals("Warrior") || r.equals("Rogue")) {
            role = r;
        } else {
            role = "Unknown";
        }
        strength = s;
        dexterity = d;
        intelligence = i;
        charisma = c;
    }

    public void printStats() {
        System.out.println("Role: " + role);
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Charisma: " + charisma);
    }

    public static void main(String[] args) {
        Character myCharacter = new Character("Wizard", 10, 5, 15, 8);
        myCharacter.printStats();
    }
}