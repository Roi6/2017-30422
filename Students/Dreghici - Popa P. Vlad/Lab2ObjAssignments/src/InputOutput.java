import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//citire 
/*
 * Scanner scanner = new Scanner(new File("tall.txt"));
 *  int [] tall = new int [100];
 *   int i = 0;
 *    while(scanner.hasNextInt())
 *    {
 *     tall[i++] = scanner.nextInt(); 
 *    }
 */

public class InputOutput {

	public static void main(String[] args) {
		
		Polynomial p1 = new Polynomial();
		Polynomial p2 = new Polynomial();
		Scanner scnr = new Scanner(System.in);
		Scanner value = new Scanner(System.in);
		int i=0,arrayValue;
		while(true)
		{
			if(scnr.hasNextInt() == false) break;
			arrayValue = scnr.nextInt();
			p1.setCoef(i,arrayValue);
		}
		int l = p1.getLength();
		for(i=0;i<l;i++) p1.getCoef(i);
		
		
	}
	
}
