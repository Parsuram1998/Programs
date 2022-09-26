import java.util.Scanner;
public class Problem_3 {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int a;
	  System.out.println("Enter the value of a");
	  a=sc.nextInt();
	  int count=1;
	  if(a%2!=0)
	  {
		  for(int i=0;i<a;i++)
		  {
			  System.out.println(" "+count);
			  count=count+2;
		  }
	  }
	  else
	  {
		  for(int i=0;i<a-1;i++)
		  {
			  System.out.println(" "+count);
			  count=count+2;
		  }
	  }
   }
}
