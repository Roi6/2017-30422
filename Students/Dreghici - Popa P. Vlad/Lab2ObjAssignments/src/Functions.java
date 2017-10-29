
public class Functions {

	private static Polynomial p1 = new Polynomial();
	private static Polynomial p2 = new Polynomial();
	
	public static void displayPolynomial(Polynomial p1) {
		
		for( int i = p1.getLength(); i > 0; i--) {
			System.out.println( p1.getCoef(i) + "x^" + i + " " );
		}
	}
	
	public static Polynomial addPolynomials(Polynomial p1, Polynomial p2) {
		
		int maxDegree;
		
		if ( p1.getDegree() > p2.getDegree()) {
			maxDegree = p1.getDegree();
			p2.setDegree(maxDegree);
		}
		else {
			maxDegree = p2.getDegree();
			p1.setDegree(maxDegree);
		}
		Polynomial rez = new Polynomial(maxDegree);
		
		for( int i = 0; i < maxDegree; i ++) {
			rez.setCoef(i,p1.getCoef(i) + p2.getCoef(i));
		}
		
		return rez;
	}
}
