package com.as2.pr1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import com.as2.pr1.Polynomial;
import com.as2.pr1.Functions;

public class InputOutput {

	static Functions functions = new Functions();
	
	public static void main(String[] args) {

	
		
	File file = new File("pol.txt");
	
	try {
		PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
		System.setOut(out);
		Scanner s = new Scanner(file);
			
		String[] coeff1 = s.nextLine().split(" "); //Reads the first polynomial as a string array, splitting by space
		String[] coeff2 = s.nextLine().split(" "); //Analog for this one
			
		int[] coeff1Int = new int[coeff1.length];
		int[] coeff2Int = new int[coeff2.length];
			
		for(int j = 0; j < coeff1.length; j ++) {
				
			try {
				coeff1Int[coeff1.length - j -1] = Integer.parseInt(coeff1[j]);
			} catch ( NumberFormatException e ) {
				throw e;
			}
		}
			
		for(int j = 0; j < coeff2.length; j ++) {
		
			try {
				coeff2Int[coeff2.length - j -1] = Integer.parseInt(coeff2[j]);
			} catch ( NumberFormatException e ) {
				throw e;
			}
		}
			
		Polynomial p1 = new Polynomial(coeff1.length, coeff1Int);
		Polynomial p2 = new Polynomial(coeff2.length, coeff2Int);
						
		while(s.hasNext()) {
				
			String operation = s.next();
			switch (operation) {
			
			case "ADD": 
				System.out.println("The result of the addition operation on the provided polynomials is: ");
				functions.displayPolynomial(functions.addPolynomials(p1, p2));
					
					break;	
			case "SUBTRACT":
				System.out.println("The result of the subtraction operation on the provided polynomials is: ");
				functions.displayPolynomial(functions.subtractPolynomials(p1, p2));
					
					break;
			case "MULTIPLY":
				System.out.println("The result of the multiplication operation on the provided polynomials is: ");
				functions.displayPolynomial(functions.multiplyPolynomials(p1, p2));
					
					break;
			case "MUL_SCAL":
				System.out.println("The result of the multiplication by a scalar on the provided polynomials is: ");
				int scalar = Integer.parseInt(s.next());
				functions.displayPolynomial((functions.multiplyByScalar(p1, scalar)));
				functions.displayPolynomial((functions.multiplyByScalar(p2, scalar)));					
					break;
						
			case "EVAL":
				int evalPoint = Integer.parseInt(s.next());
				System.out.println("The evaluation of the provided polynomials in the point " + evalPoint + " is: ");
				System.out.println("For the first: " +functions.evaluateAtValue(p1, evalPoint) + " For the second: " + functions.evaluateAtValue(p2, evalPoint));
		
			}
				
				
		}
		
	s.close();
		
	}
	catch (FileNotFoundException e) {
		e.printStackTrace();
	}
			
	
}

}
