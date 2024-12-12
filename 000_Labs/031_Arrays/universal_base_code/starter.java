/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr1 = new int[10];
		int i = 0;
		int count = 9;
		while(i < 10){
			arr1[i] = count;
			System.out.println(arr1[i]);
			count--;
			i++;
		}
	}
}
