/*4) Write a class MathOperation which accepts 5 integers through command line. Create an array using these parameters. Loop through the array and obtain the sum and average of all the elements and display the result.

Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled*/

import java.util.*;
public class MathOperation4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[5];
		try {
			int sum =0;
			for(int i=0;i<5;i++) {
				int m = Integer.parseInt(args[i]);
				arr[i] = m;
				sum+=arr[i];
			}
			System.out.println("Sum : "+sum);
			System.out.println("Avg : "+sum/5);
		}
		 catch(NumberFormatException nfe)
		 {
		  System.out.println(nfe.toString());
		 }

		 catch(ArrayIndexOutOfBoundsException aioe)
		 {
		  System.out.println(aioe.toString());
		 }

	}

}
