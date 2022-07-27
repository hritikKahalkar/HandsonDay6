/*5) Write a Program with a division method which receives two integer numbers and performs the division operation.

The method should declare that it throws ArithmeticException. This exception should be handled in the main method.
*/

import java.util.Scanner;
class Question5
{
 public static void main(String[] args)
 {
		Scanner sc = new Scanner(System.in);
 try
 {
		System.out.println("Enter two integers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c= a/b;
  System.out.println("The value is "+c);
 }
 catch(ArithmeticException ae)
 {
  System.out.println(ae.toString());
 }
 }
}