/*
 Swap given two numbers and print them. (Try to do it without a temporary variable.)

Input:
First line contains an integer, the number of test cases 'T'. Each test case should contain two positive numbers a and b.


Output:
Print the 2 numbers after swapping.


Constraints: 
1 <= T <= 100
1 <= a <= 106
1 <= b <= 106


Example:
Input:
2
20 30
12 32

Output:
30 20
32 12 
 */
import java.util.*;
import java.lang.*;
import java.io.*;
public class SwapNumberWithoutExtraVariable {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 
		 int test=s.nextInt();
		 
		 while(test-->0)
		 {
		     int a=s.nextInt();
		     int b=s.nextInt();
		     a=a+b;
		     b=a-b;
		     a=a-b;
		     
		     
		     System.out.println(a+" "+b);
		     
		     
		     

	}

}
}