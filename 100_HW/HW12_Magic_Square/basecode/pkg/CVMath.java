package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	public static void specialSquare(int n) {
    	int count = 0;
        int num = 1;
        while (count < n) {
        	int sum = num * (num + 1) / 2;
        	int square = (int)(Math.sqrt(sum));
            if (square * square == sum) {
                System.out.println(sum + " is a special square: " + square + "*" + square);
                count++;
            	}
            num++;
        }
    }
}
