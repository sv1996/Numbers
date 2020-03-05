import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindNthFibonacciNumber {
	 public static long Nthfib(int n)  
     {
         if(n==0 ||  n==1)
         {
             return n;
         }
        return Nthfib(n-1) + Nthfib(n-2) ;
     }

	public static void main(String[] args) throws IOException {
		 
	   BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
	   int test= Integer.parseInt(inp.readLine());
	 
	   while(test-->0)
	   {
	     
	   int  num= Integer.parseInt(inp.readLine());
	    
	    
	     
	      System.out.print( Nthfib(num) % 1000000007); 
	     System.out.println(); 
	   }

	}

}
