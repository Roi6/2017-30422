
public class Polynomial {
	
	public int[] coef;
	private int degree;
	
	public Polynomial(Integer[] coef) {
		for( int i = 0; i < coef.length; i++) {
			this.coef[i]=coef[i];
			degree = coef.length-1;
		}
	}
	
	public Polynomial(int degree) {
		this.degree = degree;
	}
	
	public Polynomial() {
		
	}

	public int[] getCoef() {
		return coef;
	}
	
	
	public int getLength() {
		return this.coef.length;
	}
	
	public int getDegree() {
		
		return this.coef.length - 1;
	}

	public void setDegree(int degree) {
		this.degree = degree;
	}
	
	public int getCoef(int i) {
		return this.coef[i];
	}
	public int setCoef(int i,int value) {
		this.coef[i] = value;
		return this.coef[i];
	}
	
	
}
