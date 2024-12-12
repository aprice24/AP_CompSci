/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dog spot = new Dog("Spot", 6);
		spot.dogToString();
		spot.bark();

		Dog max = new Dog("Max", "Husky");
		max.dogToString();
		max.isSleeping();
	}
}
