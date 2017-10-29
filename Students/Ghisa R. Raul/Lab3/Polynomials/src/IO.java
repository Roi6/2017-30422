import java.util.*;
import java.io.*;

public class IO {
	
	public Scanner x;
	Polynomial[] pol = new Polynomial[2];	
	Functions fct = new Functions();

	public void openFile(String file) {
		try {
			x = new Scanner(new File(file));
		}
		catch(Exception e) {
			System.out.println("File not existent!");
		}
	}
	
	public void readCoeff() {
		for (int j = 0; j < 2; j++) {
			String str = x.nextLine();
			String[] splited = str.split("\\s");
			pol[j] = new Polynomial();
			pol[j].n = splited.length - 1;
			for (int i = 0; i <= pol[j].n; i++) {
				pol[j].coeff[i] = Integer.parseInt(splited[i]);
			}		
		}
		fct.showPolynomial(pol[0]);
		fct.showPolynomial(pol[1]);
	}

	public void showCoeff() {
		for (int j = 0; j < 2; j++) {
			for (int i = 0; i <= pol[j].n; i++) {
				System.out.print(pol[j].coeff[i] + " ");
			}
			System.out.print("\n");
		}
	}
	
	public void showDegree() {
		System.out.println("First : " + pol[0].n + "\nSecond : " + pol[1].n);
	}
	
	public void showArray(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}
	
	public void readFct() {
		while(x.hasNextLine()) {
			
			String str = x.nextLine();
			String[] splited = str.split("\\s");
			
			if (splited[0].equals("ADD")) {
				System.out.print("\n");
				fct.add(pol);
				System.out.print("Addition : \n");
				fct.showPolynomial(fct.answer);
			}
			if (splited[0].equals("SUB")) {
				System.out.print("\n");
				System.out.println("Subtraction : ");
				fct.sub(pol);
				fct.showPolynomial(fct.answer);
			}
			if (splited[0].equals("MULTIPLY")) {
				System.out.print("\n");
				System.out.println("Multiply : ");
				fct.mul(pol);
				fct.showPolynomial(fct.answer);
			}
			if (splited[0].equals("EVAL")) {
				System.out.print("\n");
				fct.eval(pol, Integer.parseInt(splited[1]));
			}
			if (splited[0].equals("MUL_SCAL")) {
				System.out.print("\n");
				fct.mul_scl(pol, Integer.parseInt(splited[1]));
				System.out.println("Polynomial 1 multiplied by " + splited[1] + " : ");
				fct.showPolynomial(pol[0]);
				System.out.println("Polynomial 2 multiplied by " + splited[1] + " : ");
				fct.showPolynomial(pol[1]);
			}
		}
		
	}
}

