/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a phrase to make it Pig Latin: ");
		String sentence = sc.nextLine();
		
		while(true){
			if(sentence.indexOf(" ") == -1){
				System.out.print(pigLatin(sentence));
				break;
			}
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0, space);
			System.out.print(pigLatin(word) + " ");
			sentence = sentence.substring(space + 1);
		}
	}
	
	public static String pigLatin(String word){			
		String vowel = "AaEeIiOoUu";
		if(vowel.indexOf(word.substring(0,1)) != -1){
			return word + "-way";
		}
		else{
			int firstVowel = findFirstVowel(word, vowel);
            String doubleConsonant = word.substring(0, firstVowel);
            String restOfWord = word.substring(firstVowel);
            
            return restOfWord + doubleConsonant + "ay";
		}
	}
	
	public static int findFirstVowel(String word, String vowels) {
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.substring(i, i + 1)) != -1) {
                return i;
            }
        }
        return word.length();
    }
}
