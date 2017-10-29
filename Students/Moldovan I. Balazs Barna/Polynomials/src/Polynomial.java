
public class Polynomial {
	
	public String polynomial;
	public int degree;
	public int[] arrayPol = new int [degree];
	
	public Polynomial() {
		this.polynomial = "";
	}
	
	public void degree() {
		this.degree = 1;
	}
	
	private void calculateDegree( String polynomial) {
		int stringLength = polynomial.length();
		char c;
		int i;
		
		for (i = 0; i < stringLength; i++) {
			c = polynomial.charAt(i);
			if (c == ' ') {
				this.degree++;				
			}
		}
	}
	
	public  int getDegree(String polynomial) {
		calculateDegree(polynomial);
		return this.degree;
	}	
	
	public void toArray(String polynomial) {
		int[] array = new int[degree];
		int i = 0, temp = 0;
		int posArray = degree;
		polynomial = polynomial + ' ';
		int stringLength = polynomial.length();		
				
		while(i < stringLength-1) {
			while(polynomial.charAt(i) != ' ') {
				temp = temp * 10 + Character.getNumericValue(polynomial.charAt(i++));		
			}
					
			array[--posArray] = temp;
			if (posArray == degree -1) {
				
				if(array[posArray] != 0) {
					System.out.print(temp + "*x^" + posArray);
				}
			}
			else {
				if(array[posArray] != 0) {
					if (temp < 0) {
						if(posArray != 0) {
							System.out.print( temp + "*x^" + (posArray ));
						}
						else {
							System.out.print("+" + temp );
						}
					}
					else {
						if(posArray != 0) {
							System.out.print("+" + temp + "*x^" + posArray);
						}
						else {
							System.out.print("+" + temp );
						}
					}
				}		
			}
			i++;
			temp = 0;
		}
		arrayPol = array;
	}
}
