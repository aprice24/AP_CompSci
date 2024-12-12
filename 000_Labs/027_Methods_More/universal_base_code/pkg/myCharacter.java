/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter{
	String role;
    int strength;
    int dexterity;
    int intelligence;
    int charisma;
    
	public myCharacter(){
		role = "None";
		strength = 0;
		dexterity = 0;
		intelligence = 0;
		charisma = 0;
    }
		
	public myCharacter(String r, int s, int d, int i, int c){
	    role = r;
	    strength = s;
	    dexterity = d;
	    intelligence = i;
	    charisma = c;
	}
	
	public String getRole(){
	    return role;
	}
	
	public int getStrength(){
	    return strength;
	}
	
	public int getDexterity(){
	    return dexterity;
	}
	
	public int getIntelligence(){
	    return intelligence;
	}
	
	public int getCharisma(){
	    return charisma;
	}
	
	///
	
	public String setRole(String r){
	    return role;
	}
	
	public int setStrength(int s){
		strength = Math.max(s, 0);
	    return strength;
	}
	
	public int setDexterity(int d){
		dexterity = Math.max(d, 0);
	    return dexterity;
	}
	
	public int setIntelligence(int i){
		intelligence = Math.max(i, 0);
	    return intelligence;
	}
	
	public int setCharisma(int c){
		charisma = Math.max(c, 0);
	    return charisma;
	}
	
	public boolean setAll(String r, int s, int d, int i, int c) {
        setRole(r);
        setStrength(s);
        setDexterity(d);
        setIntelligence(i);
        setCharisma(c);
        return true;
	}

	public void myToString(){
		System.out.println("");
		System.out.println("Your role is " + role);
		System.out.println("Your strength trait is " + strength);
		System.out.println("Your dexterity trait is " + dexterity);
		System.out.println("Your intelligence trait is " + intelligence);
		System.out.println("Your charisma trait is " + charisma);
		System.out.println("");
	}
}

