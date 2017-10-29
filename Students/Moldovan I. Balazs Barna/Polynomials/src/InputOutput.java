import java.io.IOException;
import java.lang.System;

/*import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;*/
//import java.io.Exception;

public class InputOutput {

	public static void main(String[] args) {
		
		Polynomial polynomialFirst = new Polynomial();
		Polynomial polynomialSecond = new Polynomial();
				
		FileHandler originFile = new FileHandler();
		originFile.openFile();
		try {
			originFile.readFromFile(polynomialFirst, polynomialSecond);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		polynomialFirst.degree = polynomialFirst.getDegree(polynomialFirst.polynomial);
		polynomialSecond.degree = polynomialSecond.getDegree(polynomialSecond.polynomial);
		
		polynomialFirst.toArray(polynomialFirst.polynomial);
		System.out.println();
		polynomialSecond.toArray(polynomialSecond.polynomial);
		
		originFile.closeFile();		
	}

}
