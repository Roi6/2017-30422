package sum;
import java.util.Scanner;


public class SumCalculator {

	public static void main(String[] args) {
		
		int counter ;
		int sum = 0;
		int number;
		
		System.out.print("Introduce Cap Number: ");
		Scanner read = new Scanner(System.in);
		number = read.nextInt();
		
		for(counter = 0; counter < number; counter++) {
			
			if( (counter % 5 == 0) || (counter % 3 == 0 )) {
				sum = sum + counter;
			}
		}
	
		System.out.print("The sum is: ");
		System.out.println(sum);

	}

}
