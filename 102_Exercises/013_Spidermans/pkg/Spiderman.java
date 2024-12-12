package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?

	public Spiderman() {
		actor = "Unknown";
		age = 0;
		villain = "Unknown";
	}
	
	public Spiderman(String ac) {
		actor = ac;
		age = 0;
		villain = "Unknown";
	}
	
	public Spiderman(int ag) {
		actor = "Unknown";
		age = ag;
		villain = "Unknown";
	}
	
	public Spiderman(String ac, int ag) {
		actor = ac;
		age = ag;
		villain = "Unknown";
	}
	
	public Spiderman(String ac, int ag, String v) {
		actor = ac;
		age = ag;
		villain = v;
	}
	
	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	// String Actor constructor! 			Age - 0, Villain Unknown 
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	// String Actor, int Age constructor! 	Villain Unknown
	// String Actor, int Age, String Villain constructor!		
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	
	public String getActor(){
		return actor;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getVillain(){
		return villain;
	}
	
	public void setActor(String spidermanActor){
		actor = spidermanActor;
		return;
	}
	
	public void setAge(int spidermanAge){
		age = spidermanAge;
		return;
	}
	
	public void setVillain(String spidermanVillain){
		villain = spidermanVillain;
		return;
	}

	public void spiderToString(){
		System.out.println("---------");
		System.out.println("Actor: " + actor);
		System.out.println("Age: " + age);
		System.out.println("Villain: " + villain);
		System.out.println("---------");
		System.out.println("");
	}
	
	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
