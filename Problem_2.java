import java.util.Scanner;

public class Problem_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter the value of a");
		a=sc.nextInt();
		int count=1;
		for(int i=0;i<a;i++)
		{
			System.out.print(" "+count);
			count=count+2;
		}
	}
}
