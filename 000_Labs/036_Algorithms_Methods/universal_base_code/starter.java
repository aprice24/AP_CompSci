/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]){
		int [] arr = new int[100];
		
		for(int i = 1; i < arr.length; i++){
            arr[i] = (int) ((Math.random() * 100) + 1);
            System.out.println(arr[i]);
        }		
        
        arrayMethod.toStringArray(arr);
        arrayMethod.getArrayAverage(arr);
        arrayMethod.getArrayMax(arr);
        arrayMethod.getArrayMin(arr);
	}
}
