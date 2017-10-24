
public class Functions {
	
	Polynomial solution = new Polynomial();
	
	public void add(Polynomial p1, Polynomial p2) {
		int minDegree, i;
		
		if (p1.degree < p2.degree) {
			minDegree = p1.degree;
			solution = p2;
		}else {
			minDegree = p2.degree;
			solution = p1;
		}
		
		for ( i = 0; i < minDegree; i++) {
			solution.arrayPol[i] = p1.arrayPol[i] + p2.arrayPol[i];
		}
		
	}
	
	public void subtract(Polynomial p1, Polynomial p2) {
		int minDegree, maxDegree, i;
		
		if (p1.degree < p2.degree) {
			minDegree = p1.degree;
			maxDegree = p2.degree;
			for ( i = 0; i < minDegree; i++) {
				solution.arrayPol[i] = p1.arrayPol[i];
			}
		}else {
			minDegree = p2.degree;
			maxDegree = p1.degree;
			solution = p1;
		}
	
		for ( i = minDegree; i < maxDegree; i++) {
			solution.arrayPol[i] = 0;
		}
		for ( i = 0; i < minDegree; i++) {
			solution.arrayPol[i] = solution.arrayPol[i] - p2.arrayPol[i];
		}
		
	}

}
