package prima_problema;

public class fibonacci_even_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fib1=1, fib2=1,newFib, sum=0;
		while(fib1<4000000 || fib2<4000000)
		{
			newFib=fib1+fib2;
			if (newFib%2==0) sum+=newFib;
			fib2=fib1;
			fib1=newFib;
			
		
		}
		System.out.println(sum);
	}

}
