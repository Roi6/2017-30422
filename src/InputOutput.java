import java.io.*;
import java.util.*;

public class InputOutput {
	private Scanner input;
	Polynomial pol1 = new Polynomial(); 
	Polynomial pol2 = new Polynomial();
	Functions func = new Functions();
	public Formatter x;
	
	public void openFile() {
		try {
			input = new Scanner(new File("pol.txt"));
			PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
			System.setOut(out);
		}
		catch(Exception e) {
			System.out.println("could not find file");
		}
	}
	
	
	public void readFile() {
		int i=0;
		String[] coeff1S = input.nextLine().split(" ");
		String[] coeff2S = input.nextLine().split(" ");
		int[] coeff1I = new int[coeff1S.length];
		int[] coeff2I = new int[coeff2S.length];
		for (String value: coeff1S)
			coeff1I[i++] = Integer.parseInt(value);
		for (i=0 ; i<coeff2S.length ; i++)
			coeff2I[i] = Integer.parseInt(coeff2S[i]);
		pol1.setCoefficients(coeff1I);
		pol1.setGrade(coeff1I.length-1);
		pol2.setCoefficients(coeff2I);
		pol2.setGrade(coeff2I.length-1);
		while(input.hasNext()) {
			if(input.hasNext("ADD")) { 
				func.ADD(pol1, pol2);
				input.next();
			}
			if(input.hasNext("SUBSTRACT")) {
				func.SUBSTRACT(pol1, pol2);
				input.next();
			}
			if(input.hasNext("MULTIPLY")) {
				func.MULTIPLY(pol1,pol2);
				input.next();
			}
			if(input.hasNext("MUL_SCAL")) {
				input.next();
				int mulScalInt = Integer.parseInt(input.next());
				func.MUL_SCAL(mulScalInt, pol1, pol2);
			}	
			if(input.hasNext("EVAL")) {
				input.next();
				int valueX;
				valueX = Integer.parseInt(input.next());
				func.EVAL(valueX, pol1, pol2);
			}
		}
	}
	
	
	
	public void closeFile() {
		input.close();
	}
	
}
