package prima_problema;
import java.util.Scanner;
public class prima {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//suma multiplilor lui 3 sau 5 mai mici ca 1000
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the limit for our search:");
		int limit = keyboard.nextInt();
		
		int s=0,i;
		for (i=2;i<=limit;i++) if(i%5==0 || i%3==0) s+=i;
		System.out.println("The sum of all the numbers less than out limit which are divisible with 3 or 5 is:");
		System.out.println(s);
	}

}
