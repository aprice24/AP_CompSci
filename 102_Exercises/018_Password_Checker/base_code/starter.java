import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
        
        int strength1 = 0;
        int strength2 = 0;
        int strength3 = 0;
        String special = "!@#$%^&*";

        for (String password : passwords) {
            boolean hasSpecial = false;
            for (int j = 0; j < password.length(); j++) {
                if (special.indexOf(password.charAt(j)) != -1) {
                    hasSpecial = true;
                    break;
                }
            }

            boolean length = password.length() >= 8;
            if (length && hasSpecial) {
                strength3++;
            } 
            else if (length) {
                strength1++;
            }
            else if (hasSpecial) {
                strength2++;
            }
        }

        System.out.println("Passwords with strength 1: " + strength1);
        System.out.println("Passwords with strength 2: " + strength2);
        System.out.println("Passwords with strength 3: " + strength3);
		
	}
}
