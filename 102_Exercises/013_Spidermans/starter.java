/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman tobey = new Spiderman("Tobey Maguire", 48, "Green Goblin");
		tobey.spiderToString();
		
		Spiderman andrew = new Spiderman("Andrew Garfield", 40, "Electro");
		andrew.spiderToString();
		
		Spiderman tom = new Spiderman("Tom Holland", 27, "The Vulture");
		tom.spiderToString();
		
	}
}
