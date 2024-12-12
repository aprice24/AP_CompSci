/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number and we'll print out every prime until that number:");
        int input = scanner.nextInt();
        printPrimes(input);
    }

    public static boolean checkPrime(int num) {
        if (num < 2) {
            return false; 
        }

        int divide = 2;
        while (divide <= Math.sqrt(num)) {
            if (num % divide == 0) {
                return false; 
            }
            divide++;
        }
        return true; 
    }

    public static void printPrimes(int max) {
        int currentNum = 2; 
        while (currentNum < max) {
            if (checkPrime(currentNum)) {
                System.out.println(currentNum);
            }
            currentNum++;
        }
    }
}