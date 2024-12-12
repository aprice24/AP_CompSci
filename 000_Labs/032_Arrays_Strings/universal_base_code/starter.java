/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		String [] arr1 = new String[10];
		int i = 0;
		String count = "Hello";
		while(i < 10){
			arr1[i] = count;
			System.out.println(arr1[i]);
			count = count + " Hello";
			i++;
		}
	}
}
