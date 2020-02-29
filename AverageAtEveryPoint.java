import java.util.Scanner;
/*
  Given a stream of numbers, print average or mean of the stream at every point.

Input: The first line of input contains an integer T denoting the number of test cases.
For each test case there will be two lines. The first line contains an integer N denoting the size of array C[], and second line contains N space seperated integers C[i].

Output:
Print the average of the stream at every point (in integer).

Constraints:
1 ≤ T ≤ 20
1 ≤ N ≤ 50
1 ≤ C[i] ≤ 100

Example:
Input
2
5
10 20 30 40 50
2
12 2

Output
10 15 20 25 30
12 7
 */
public class AverageAtEveryPoint {

	public static void main(String[] args) {

	      Scanner s = new Scanner(System.in);
			 
			 int test=s.nextInt();
			 
			 while(test-->0)
			 {
			   int size=s.nextInt();
			   
			   
			   int arr[] = new int[size];
			   
			   for(int i=0;i<size;i++)
			   {
			       arr[i] =s.nextInt();
			       
			 }
			 int sum=0;
			 int count=1;
			 
			  for(int i=0;i<size;i++)
			   {
			       sum+=arr[i];
			     int avg= (int)sum / count;
			      System.out.print(avg +" ");
			      count++;
			       
			       
			       
			   }
			 
	System.out.println();
		
		 }

	}

}
