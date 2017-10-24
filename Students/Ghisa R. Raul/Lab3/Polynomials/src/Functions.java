
public class Functions {
	
	Polynomial answer = new Polynomial(), degrees = new Polynomial();
	
	public void add(Polynomial[] pol) {
		if (pol[0].n > pol[1].n) {
			answer.n = pol[0].n;
			int dif = pol[0].n - pol[1].n;
			for (int i = 0; i < dif; i++) {
				answer.coeff[i] = pol[0].coeff[i];
			}
			for (int i = dif; i <= pol[0].n; i++) {
				answer.coeff[i] = pol[0].coeff[i] + pol[1].coeff[i - dif];
			}		
		}
		else {
			if(pol[0].n < pol[1].n) {
				answer.n = pol[0].n;
				int dif = pol[1].n - pol[0].n;
				for (int i = 0; i < dif ; i++) {
					answer.coeff[i] = pol[1].coeff[i];
				}
				for (int i = dif; i <= pol[1].n; i++) {
					answer.coeff[i] = pol[0].coeff[i] + pol[1].coeff[i];
				}		
			}
			else {
				for (int i = pol[0].n; i >= 0; i--) {
					answer.coeff[i] = pol[0].coeff[i] + pol[1].coeff[i];
				}
			}
		}
		
	}
	
	public void sub(Polynomial[] pol) {
		if (pol[0].n > pol[1].n) {
			answer.n = pol[0].n;
			int dif = pol[0].n - pol[1].n;
			for (int i = 0; i < dif; i++) {
				answer.coeff[i] = pol[0].coeff[i];
			}
			for (int i = dif; i <= pol[0].n; i++) {
				answer.coeff[i] = pol[0].coeff[i] - pol[1].coeff[i - dif];
			}		
		}
		else {
			if(pol[0].n < pol[1].n) {
				answer.n = pol[0].n;
				int dif = pol[1].n - pol[0].n;
				for (int i = 0; i < dif ; i++) {
					answer.coeff[i] = pol[1].coeff[i];
				}
				for (int i = dif; i <= pol[1].n; i++) {
					answer.coeff[i] = pol[0].coeff[i] - pol[1].coeff[i];
				}		
			}
			else {
				for (int i = pol[0].n; i >= 0; i--) {
					answer.coeff[i] = pol[0].coeff[i] - pol[1].coeff[i];
				}
			}
		}
	}
	
	public void shiftLeft(Polynomial pol, int pos) {
		for (int i = pos; i <= pol.n; i++) {
			pol.coeff[i] = pol.coeff[i + 1];
		}
		pol.n--;
	}
	
	public void showArray(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}
	
	public void simplify(Polynomial pol, Polynomial degrees) {
		for (int i = 1; i < pol.n; i++) {
			for (int j = i + 1; j <= pol.n; j++) {
				if (degrees.coeff[i] == degrees.coeff[j]) {
					pol.coeff[i] += pol.coeff[j];
					shiftLeft(pol, j);
					shiftLeft(degrees, j);
				}
			}
		}
	}
	
	public void mul(Polynomial[] pol) {
		int slots = (pol[0].n + 1) * (pol[1].n + 1);
		int index = 0;
		answer.n = slots - 1;
		degrees.n = slots - 1;
		for (int j = pol[0].n; j >= 0; j--) {
			for (int i = pol[1].n; i >= 0 ; i--) {
				answer.coeff[--slots] = pol[0].coeff[j] * pol[1].coeff[i];
				degrees.coeff[index++] = i + j;
			}
		}
		simplify(answer, degrees);
	}
	
	public void mul_scl(Polynomial[] pol, int n) {
		for (int j = 0; j < 2; j++) {
			for (int i = 0; i <= pol[j].n; i++) {
				pol[j].coeff[i] *= n;
			}
		}
	}
	
	public void eval(Polynomial[] pol, double x) {
		for (int i = 0; i < 2; i++) {
			double answer = 0;
			for (int j = 0; j <= pol[i].n; j++) {
				answer = answer + pol[i].coeff[j] * Math.pow(x, (double)(pol[i].n - j));
			}
			System.out.printf("Polynomial %d evaluate in %d : \n%f\n", i + 1, (int)x, answer);
		}
		
	}
	
	public String sign(int x) {
		if (x < 0)
			return "";
		return "+";
	}
	
	public void showPolynomial(Polynomial pol) {
		for (int j = 0; j <= pol.n; j++) {
			System.out.printf("%s%dx^%d", sign(pol.coeff[j]), pol.coeff[j], pol.n - j);
		}
		System.out.print("\n");
	}
	
}
