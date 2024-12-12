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
		System.out.println("Please input a phrase: ");
		String sentence = sc.nextLine();
		
		String reversedSentence = reverseWords(sentence);
		System.out.println(reversedSentence);
	}
	
	public static String reverseWords(String sentence) {
        String result = "";
        while (true) {
            if (sentence.indexOf(" ") == -1) {
                result = sentence + result;
                break;
            }
            int space = sentence.indexOf(" ");
            String word = sentence.substring(0, space);
            result = " " + word + result;
            sentence = sentence.substring(space + 1);
        }
        return result;
	}

}
