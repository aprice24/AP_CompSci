/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        
        greeting("Spike");
        greeting("Mortis");
        
        double num = raise(200000.42, 5); //Stored inside num instead, good for later
        System.out.println(num);
        num = raise(num, 5); //Give another 5 percent raise
        System.out.println(num);
        num = raise(num, 5); //Give another 5 percent raise
        System.out.println(num);
        
        num = raise(num+100000, 5); //Help calculate money
        System.out.println(num);
	}
	
	public static double raise(double salary, int percent){
	    double amount = salary + (salary * (percent/100.0));
	    return amount;
	}
	
	
	public static void greeting(String name){
	    System.out.println("Howdy " + name);
	}
	
	public static void printAnimal(){
	    System.out.println("  ^~^  ");
	    System.out.println(" ('Y') )");
        System.out.println(" /   \\/ ");
        System.out.println("(\\|||/)");
        // Addd "\" in front of quotes and backlash
	}
	
}