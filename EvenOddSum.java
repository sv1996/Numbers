import java.util.Scanner;

public class EvenOddSum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 
		 int test=s.nextInt();
		 
		 while(test-->0)
		 {
		    
		    
		    
	int a= s.nextInt();
		 long evensum=0;
	long oddsum=0;
		    
		     for(int i=1;i<=a;i++)
		     {
		         
		       if(i%2!=0)
		       {
		           oddsum+=i;
		       }
		         else
		         {
		            evensum+=i; 
		         }
		         
		         
		     }
	 
		     System.out.println(oddsum+" "+ evensum);
		     
	}

}
}