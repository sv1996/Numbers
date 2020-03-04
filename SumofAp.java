/*
  A series with same common difference is known as arithmetic series. The first term of series is 'a' and common difference is d. The series looks like a, a + d, a + 2d, a + 3d, . . . Find the sum of series.

Input : a = 1
        d = 2
        n = 4
Output : 16
1 + 3 + 5 + 7 = 16

Input : a = 2.5
        d = 1.5
        n = 20
Output : 335
Input:
The first line consists of an integer T i.e number of test cases. The first line and only line of each test case consists of three values a,d,n.

Output:
Print the sum of the series. With two decimal places.

Constraints: 
1 <= T <= 100
1 <= a,d,n <= 104

Example:
Input:
2
1 2 4
2.5 1.5 20

Output:
16.00
335.00
 */




import java.util.Scanner;

public class SumofAp {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		    int test=s.nextInt();
		    
		    while(test-->0)
		    {
		        double a=s.nextDouble();
		         double d=s.nextDouble();
		         int n=s.nextInt();
		       
		       double sum=0.0;
		         for(int i=0;i<n;i++)
		         {
		             
		             
		             sum+=a+i*d;
		         }
		         
		           System.out.print(String.format("%.2f", sum));
		        
		    System.out.println();
	}

}
}