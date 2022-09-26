import java.util.Scanner;

public class Problem_1 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter value for a");
		  double a= scan.nextDouble();
		  System.out.println("enter value for b");
		  double b= scan.nextDouble();
		  System.out.println("enter the operators,+,-,*,/");
		  String c=scan.next();
		  switch(c)
		  {
		  case"-" :System.out.println(a-b);
		  break;
		  case"+" :System.out.println(a+b);
		  break;
		  case"/" :System.out.println(a/b);
		  break;
		  case"*" :System.out.println(a*b);
		  break;
		  default:System.out.println("invalid input");
		  }
		}
     }
