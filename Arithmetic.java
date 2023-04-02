package Lab;
import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		AdvancedArithmetic a1=new AdvancedArithmetic();
		a1.divisorSum(n);
		sc.close();
		
	}

}
