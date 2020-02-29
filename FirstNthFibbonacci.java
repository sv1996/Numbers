/*
  Given a number N, print the first N fibonacci numbers.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. The first line of each test case contains the integer N.

Output:
Print the first n fibonacci numbers with a space between each number. Print the answer for each test case in a new line.

Constraints:
1<= T <=100
1<= N <=84

Example:
Input:
2
7
5

Output:
1 1 2 3 5 8 13
1 1 2 3 5
 */










import java.util.Scanner;

public class FirstNthFibbonacci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 
		 int test=s.nextInt();
		 
		 while(test-->0)
		 {
		  int n=s.nextInt();
		  int arr[] = new int[n+1];
		  
		  arr[0]=1;
		  arr[1]=1;
		  
		  
		  for(int i=2;i<=n;i++)
		  {
		arr[i] =arr[i-1] +arr[i-2];	  
			  
		 }
		  
		  for(int i=0;i<n;i++)
		  {
		System.out.print(arr[i]+" ");
			  
		 }
		      
	System.out.println();
	
	
	
	}

}
}