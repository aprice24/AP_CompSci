/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;

public class myCharacter {
    private String role;

    public myCharacter() {
        this.role = "No role";
    }

    public myCharacter(String r) {
        setRole(r);
    }

    public void setRole(String r) {
        if (r.equalsIgnoreCase("Wizard")) {
            role = r;
            System.out.println("You chose Wizard! How magical!");
        } else if (r.equalsIgnoreCase("Warrior")) {
            role = r;
            System.out.println("You chose Warrior! How brave!");
        } else if (r.equalsIgnoreCase("Rogue")) {
            role = r;
            System.out.println("You chose Rogue! How cunning!");
        } else {
            System.out.println("Invalid role chosen. Setting role to 'No role'.");
            role = "No role";
        }
    }

    public String getRole() {
        return role;
    }

    public void printStats() {
        System.out.println("Role: " + role);
    }
    
}
