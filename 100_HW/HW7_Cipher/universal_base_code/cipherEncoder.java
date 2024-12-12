/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

public class cipherEncoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message to encode: ");
        String input = scanner.nextLine();
        
        System.out.print("Enter a key (integer): ");
        int key = scanner.nextInt();
        
        String encodedMessage = Cipher.keyedEncode(input, key);
        System.out.println("Encoded Message: " + encodedMessage);

	 }
}

