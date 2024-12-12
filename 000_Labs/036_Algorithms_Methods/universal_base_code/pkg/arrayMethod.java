/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class arrayMethod {
	 public static void toStringArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
	 }
	 
	 public static int getArrayAverage(int[] arr){
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
            avg = sum / arr.length;
        }
        return avg;
	 }
	 
	 public static int getArrayMax(int[] arr){
	 	int max = Integer.MIN_VALUE;
	 	for (int i = 0; i < arr.length; i++){	
			if(arr[i] > max){
				max = arr [i];
			}
		}
		return max;
	 }
	 
	 public static int getArrayMin(int[] arr){
	 	int min = Integer.MAX_VALUE;
	 	for (int i = 0; i < arr.length; i++){	
			if(arr[i] < min){
				min = arr [i];
			}
		}
		return min;
	 }
}

