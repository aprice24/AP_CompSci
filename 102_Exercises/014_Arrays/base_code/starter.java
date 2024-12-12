/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int [] arr1 = new int[1001];
		int i = 0;
		int count = 3;
		while(i < 1001){
			arr1[i] = count;
			System.out.println(arr1[i]);
			count += 3;
			i++;
			//alt: arr1[x] = (x+1)*3;
			//alt: for(int i = 0; c < arr.length; c++)
		}
		
		int [] arr2 = new int[1001];
		int x = 0;
		int count1 = 1000;
		while(x < 1001){ //could also put while(x < arr.length)
			arr2[x] = count1;
			System.out.println(arr2[x]);
			count1 += 3;
			x--;
			//alt: arr[x] = arr2.length-1-x;
	}
}
