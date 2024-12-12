/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	int result = pow(4,5);
	System.out.println(result);
	}

	public static int pow(int num1, int num2){
			int result = 1;
		while(num2 > 0){
				result = result * num1;
				num2 = num2 - 1;
		}
			
		return result;
	}
}
