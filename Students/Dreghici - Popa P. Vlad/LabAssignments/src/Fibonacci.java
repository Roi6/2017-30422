import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f1=1,f2=1,f3=0,sum=0,i;
		//System.out.println("Insert the nth number you want to reach");
		//int n=new Scanner(System.in).nextInt();
		while(f3<4000000)
		{
			f3=f2+f1;
			f1=f2;
			f2=f3;
			if(f3%2==0) sum+=f3;
		}
		System.out.println("Sum of even numbers is " + sum);
		
	}
}
