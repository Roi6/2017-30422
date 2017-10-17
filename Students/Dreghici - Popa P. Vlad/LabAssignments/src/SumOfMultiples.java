import java.util.Scanner;

public class SumOfMultiples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Insert max number");
		int i,n,sum=0;
		Scanner m = new Scanner(System.in);
		n = m.nextInt();
		for(i=0;i<n;i++)
		{
			if(i%3==0 || i%5==0) sum+=i;
		}
		System.out.println("Sum of 3,5 multiples up to " + n +" is " + sum);
	}

}
