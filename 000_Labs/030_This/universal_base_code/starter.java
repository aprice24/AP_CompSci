/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		Random rand = new Random();
		
		PooleDwarf firstDwarf = new PooleDwarf(randName(), rand.nextInt(100));
        System.out.println("First Dwarf: " + firstDwarf.getName());
        
        int duplicates = 0;
        for (int i = 0; i < 6; i++) {
            PooleDwarf dwarf = new PooleDwarf(randName(), rand.nextInt(100));
            System.out.println("Dwarf " + (i + 1) + ": " + dwarf.getName());
            
         if (dwarf.isSameName(firstDwarf.getName())) {
                duplicates++;
            }
        }
		
		System.out.println("First Dwarf's name: " + firstDwarf.getName());
        System.out.println("Number of duplicates: " + duplicates);
	}
}
