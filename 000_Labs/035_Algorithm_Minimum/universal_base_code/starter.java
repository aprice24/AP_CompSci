/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int [] arr = new int[(int)((Math.random()*150)+51)];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 1; i < arr.length; i++){
			arr[i] = (int) ((Math.random() * 100) + 1);
		}
		
		 for (int i = 0; i < arr.length; i++) {	
			if(arr[i] < min){
				min = arr [i];
			}
			if(arr[i] > max){
				max = arr [i];
			}
			sum += arr[i];
		}
		
		double average = (double) sum / arr.length;
		System.out.println("Array size: " + arr.length);
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        System.out.println("Average value: " + average);
	}
}
