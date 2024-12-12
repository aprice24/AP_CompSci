/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr1 = new int[1000];
		int i = 0;
		while(i < 1000){
			int count = (int)(Math.random()*1000);
			arr1[i] = count;
			System.out.println(arr1[i]);
			i++;
		}
	}
}
