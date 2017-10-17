
import java.util.Scanner;

public class Sum_of_multiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		int i;
		int sum=0;
		for (i=3; i<n; i++) //0 does not affect the sum, 1 and 2  
		{
			if ((i%3==0) || (i%5==0))
			{
				sum+=i;
			}
		}
		System.out.print(sum);
		in.close();
	}
}