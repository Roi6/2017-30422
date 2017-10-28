
public class Functions {
	public void add(Polynomial pol1, Polynomial pol2) {
		int i;
		int[] aux = new int[Math.max(pol1.getGrade(),pol2.getGrade())+1];
		Polynomial sumOfPolynomials = new Polynomial();
		sumOfPolynomials.setGrade(Math.max(pol1.getGrade(),pol2.getGrade()));
		for (i=0 ; i<=Math.max(pol1.getGrade(),pol2.getGrade()) ; i++) {
			if(i<=Math.min(pol1.getGrade(),pol2.getGrade()))
				aux[i] = pol1.getCoefficients()[i] + pol2.getCoefficients()[i];
			else {
				if(pol1.getGrade()>pol2.getGrade())
					aux[i] = pol1.getCoefficients()[i];
				else
					aux[i] = pol2.getCoefficients()[i];
			}
		}
		sumOfPolynomials.setCoefficients(aux);
		for (i=0 ; i<=Math.max(pol1.getGrade(),pol2.getGrade()) ; i++) {
			if (sumOfPolynomials.getCoefficients()[i] != 0)
				System.out.printf("%dx^%d ", sumOfPolynomials.getCoefficients()[i],Math.max(pol1.getGrade(),pol2.getGrade())-i);
			if (i != Math.max(pol1.getGrade(),pol2.getGrade()) && sumOfPolynomials.getCoefficients()[i+1]>0)
				System.out.printf("+ ");
		}
			System.out.println();
		System.out.println();
	}
	
	public void substract(Polynomial pol1, Polynomial pol2) {
		int i;
		int[] aux = new int[Math.max(pol1.getGrade(),pol2.getGrade())+1];
		Polynomial differenceOfPolynomials = new Polynomial();
		differenceOfPolynomials.setGrade(Math.max(pol1.getGrade(),pol2.getGrade()));
		for (i=0 ; i<=Math.max(pol1.getGrade(),pol2.getGrade()) ; i++) {
			if(i<=Math.min(pol1.getGrade(),pol2.getGrade()))
				aux[i] = pol1.getCoefficients()[i] - pol2.getCoefficients()[i];
			else {
				if(pol1.getGrade()>pol2.getGrade())
					aux[i] = pol1.getCoefficients()[i];
				else
					aux[i] = -pol2.getCoefficients()[i];
			}
		}
		differenceOfPolynomials.setCoefficients(aux);
		for (i=0 ; i<=Math.max(pol1.getGrade(),pol2.getGrade()) ; i++) {
			if (differenceOfPolynomials.getCoefficients()[i] != 0)
				System.out.printf("%dx^%d ", differenceOfPolynomials.getCoefficients()[i],Math.max(pol1.getGrade(),pol2.getGrade())-i);	
			if (i != Math.max(pol1.getGrade(),pol2.getGrade()) && differenceOfPolynomials.getCoefficients()[i+1]>0)
				System.out.printf("+ ");
		}
		System.out.println();
		System.out.println();
	}

	public void multiply(Polynomial pol1, Polynomial pol2) {
		int i,j;
		int[] aux = new int[pol1.getGrade() + pol2.getGrade() + 1];
		Polynomial productOfPolynomials = new Polynomial();
		productOfPolynomials.setGrade(pol1.getGrade() + pol2.getGrade());
		for(i=0 ; i<=pol1.getGrade() ; i++)
			for(j=0 ; j<=pol2.getGrade() ; j++)
				aux[i+j] = pol1.getCoefficients()[i] * pol2.getCoefficients()[j] + aux[i+j];
		productOfPolynomials.setCoefficients(aux);
		for (i=0 ; i<=pol1.getGrade() + pol2.getGrade() ; i++) {
			if(productOfPolynomials.getCoefficients()[i] != 0)
				System.out.printf("%dx^%d ", productOfPolynomials.getCoefficients()[i],pol1.getGrade() + pol2.getGrade()-i);
			if (i != pol1.getGrade() + pol2.getGrade() && productOfPolynomials.getCoefficients()[i+1]>0)
				System.out.printf("+ ");
		}
		System.out.println();
		System.out.println();
	}
	
	public void mul_scal(int scalar, Polynomial pol1, Polynomial pol2) {
		int i;
		int[] aux1 = new int[pol1.getGrade()+1], aux2 = new int[pol2.getGrade()+1];
		Polynomial pol1Nou = new Polynomial(), pol2Nou = new Polynomial();
		for(i=0 ; i<=pol1.getGrade() ; i++) {
			aux1[i] = pol1.getCoefficients()[i] * scalar;
		}
		for(i=0 ; i<=pol2.getGrade() ; i++) {
			aux2[i] = pol2.getCoefficients()[i] * scalar;
		}
		pol1Nou.setGrade(pol1.getGrade());
		pol1Nou.setCoefficients(aux1);
		pol2Nou.setGrade(pol2.getGrade());
		pol2Nou.setCoefficients(aux2);
		for (i=0 ; i<=pol1Nou.getGrade() ; i++) {
			if(pol1Nou.getCoefficients()[i] != 0)
				System.out.printf("%dx^%d ", pol1Nou.getCoefficients()[i], pol1Nou.getGrade()-i);
			if (i != pol1Nou.getGrade() && pol1Nou.getCoefficients()[i+1]>0)
				System.out.printf("+ ");
		}
		System.out.println();
		for (i=0 ; i<=pol2Nou.getGrade() ; i++) {
			if (pol2Nou.getCoefficients()[i] != 0)
				System.out.printf("%dx^%d ", pol2Nou.getCoefficients()[i], pol2Nou.getGrade()-i);	
			if (i != pol2Nou.getGrade() && pol2Nou.getCoefficients()[i+1]>0)
				System.out.printf("+ ");
		}
		System.out.println();
		System.out.println();
	}
	
	public int newPow(int a, int b) {
		int i,newA=1;
		for (i=0 ; i<b ; i++)
			newA = newA*a;
		return newA;
	}
	
	public void eval(int valueX, Polynomial pol1, Polynomial pol2) {
		double eval1=0, eval2=0;
		int i;
		for(i=0 ; i<=pol1.getGrade() ; i++) 
			eval1 = newPow(valueX, pol1.getGrade()-i) * pol1.getCoefficients()[i] + eval1;
		for(i=0 ; i<=pol2.getGrade() ; i++) 
			eval2 = newPow(valueX, pol2.getGrade()-i) * pol2.getCoefficients()[i] + eval2;
		System.out.printf("%f %f\n", eval1, eval2);
		System.out.println();
	}
}
