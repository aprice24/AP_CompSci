/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        // Your Code Goes here!
        Scanner sc = new Scanner(System.in);
        System.out.println("You've joined an ALien Exchange Program!");
        System.out.println();
        System.out.println("Pick an alien to take in!");
        System.out.println("1. Joe, a fat bellied alien who loves eating pizza.");
        System.out.println("2. Bob, a blue alien who loves trees.");
        System.out.println("3. Barney, a purple tailed alien who eats butterflies.");
        
        int answer1 = sc.nextInt();
        if(answer1 == 1){
            System.out.println("You picked Joe!");
        }
        else if(answer1 == 2){
            System.out.println("You picked Bob!");
        }
        else if(answer1 == 3){
            System.out.println("You picked Barney!");
        }
        else{
            System.out.println("You got Jerry.");
        }
        
        System.out.println();
        System.out.println("Now that you've met, what do you do first?");
        System.out.println("1. Get ice cream.");
        System.out.println("2. Fight to the death.");
        System.out.println("3. Go to the park.");
        
        int answer2 = sc.nextInt();
        if(answer2 == 1){
            System.out.println("You got ice cream! You are both happy.");
        }
        else if(answer2 == 2){
            System.out.println("You died RIP :[");
        }
        else if(answer2 == 3){
            System.out.println("You both had a lot of fun at the park!");
        }
        else{
            System.out.println("You did nothing.");
        }
	}
}