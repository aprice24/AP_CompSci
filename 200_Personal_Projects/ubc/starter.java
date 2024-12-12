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
		Random randomEffect = new Random();
		System.out.println("Welcome to Virtual Pet Simulator!");
		System.out.println("Here are the rules:");
		System.out.println("	- Your pet starts with 10 hearts, try to get it to 30.");
    	System.out.println("	- There are four options to interact: Feed, Play, Rest, or Gamble.");
    	System.out.println("	- All options can get hearts, but also can deplete them.");
    	System.out.println("	- Gambling chooses a random event that may seriously affects your hearts.");
    	System.out.println("	- You lose if your pet falls to 0 hearts.");
    	System.out.println(" ");
    	
    	System.out.println("Would you like to name your pet? (Yes / No)");
    	String yn = sc.nextLine();
    	String name = "Pet";
    	
    	if(yn.equalsIgnoreCase("yes")){
    		System.out.println("What would you like to name it?");
    		name = sc.nextLine();
    		System.out.println(" ");
    	}
    	
    	if(yn.equalsIgnoreCase("no")){
    		System.out.println("Your pet will be named Pet by default.");
    		System.out.println(" ");
    	}
    
    	int hearts = 10;
    	
    	while(true){
    		System.out.println("Your pet has " + hearts + " hearts.");
    		System.out.println("What would you like to do? (Feed / Play / Rest / Gamble / Exit)");
    		String answer = sc.nextLine();
    		System.out.println(" ");
    		
    		/////
    		
    		if (answer.equalsIgnoreCase("exit")) {
                System.out.println("You exited with a score of " + hearts + " hearts.");
                break;
            }
            
            if (answer.equalsIgnoreCase("feed")) {
                int heartsGained = randomEffect.nextInt(6) + 1;
                int heartsLost = randomEffect.nextInt(3);
                hearts += heartsGained - heartsLost;
                System.out.println("You decided to feed your pet. " + name + " gained " + heartsGained + " hearts and lost " + heartsLost + " hearts.");
            }
            
            else if (answer.equalsIgnoreCase("play")) {
                int heartsGained = randomEffect.nextInt(4) + 1;
                int heartsLost = randomEffect.nextInt(4);
                hearts += heartsGained - heartsLost;
                System.out.println("You decided to play with your pet. " + name + " gained " + heartsGained + " hearts and lost " + heartsLost + " hearts.");
            }
            
            else if (answer.equalsIgnoreCase("rest")) {
                int heartsGained = randomEffect.nextInt(3) + 1;
                int heartsLost = randomEffect.nextInt(2);
                hearts += heartsGained - heartsLost;
                System.out.println("You decided to let your pet rest. " + name + " gained " + heartsGained + " hearts and lost " + heartsLost + " hearts.");
            }
            
            else if (answer.equalsIgnoreCase("gamble")) {
                int gambleNum = (int)(Math.random()*11);
                	if(gambleNum >= 0 && gambleNum <= 4){
                		System.out.println("Your pet found a winning lottery ticket in a trashcan! You gain 10 hearts.");
                		hearts = hearts + 10;
                	}
                	else if(gambleNum >= 5 && gambleNum <= 6){
                		System.out.println("You and your pet did nothing today. You gained/lost 0 hearts.");
                		hearts = hearts + 0;
                	}
                	else if(gambleNum >= 7 && gambleNum <= 10){
                		System.out.println("Your pet trashed your house while you were away! You lost 10 hearts.");
                		hearts = hearts - 10;
                	}
            } 	
            
            else {
                System.out.println("Invalid option. Please choose Feed, Play, Gamble, or Rest.");
                continue;
            }
            
            /////
            
            if (hearts <= 0) {
                System.out.println("Your pet has no hearts left! Game over!");
                break;
            } 
            
            else if (hearts >= 30) {
                System.out.println("You win! Your pet reached 30 hearts!");
                break;
            }
    	}
	}
}
