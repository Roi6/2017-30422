
import java.util.Scanner;

public class Fibonacci_even_sum {

	private static void Fibonacci_linear_time(int n) 
	{
		// TODO Auto-generated method stub
		
		int x=1; // first term in Fibonacci sequence
		int y=2; // second term in Fibonacci sequence
		int z,sum;
		sum=2; //the sum of the even-valued terms from the first two elements is 2
		z=x+y;
		while (z<=n)
		{
			if (z%2==0)
			{
				sum+=z;
			}
			x=y;
			y=z;
			z=x+y;
		}
		System.out.print(sum);
		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=in.nextInt(); // Fibonacci terms are not allowed to exceed the value of n
		Fibonacci_linear_time(n);
		in.close();
	}
}
