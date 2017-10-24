import java.util.Scanner;

public class KeyInput {
	
	private Scanner scn = new Scanner(System.in);
	public int[] coeff1 = new int[10], coeff2 = new int[10];
	public int n = 0, m = 0;
	
	public void readCoeff() {
		
		int c = scn.nextInt();
		while (c != -1) {
			coeff1[n++] = c;
			c = scn.nextInt();
		}
		
		c = 0;
		while (c != -1) {
			coeff2[m++] = c;
			c = scn.nextInt();
		}
	}
	
	public void showPol(int[] coeff) {
		for (int i = 0; i < coeff.length; i++) {
			System.out.printf("%d ", coeff[i]);
		}
	}

}
