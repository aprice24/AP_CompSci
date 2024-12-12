/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.Random;

class starter {
    public static void main(String args[]) {
        int[] arr = new int[20];

        for(int i = 1; i < arr.length; i++){
            arr[i] = (int) ((Math.random() * 10) + 1);
            System.out.print(arr[i] + " " + arr[i+1]);
        }
        
        int x = 20;
        for(int i = 1; i < arr.length; i++){
            if(x == arr[i]){
            System.out.print(i);
            }
        }
        
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] == arr[i+1]){
                System.out.println("Consecutive at " + i + " and " + (i+1));
            }
        }
    }
}