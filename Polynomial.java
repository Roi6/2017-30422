
public class Polynomial {
	private int grade;
	private int[] coefficients;
	
	
	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public int[] getCoefficients() {
		return coefficients;
	}

	public void setCoefficients(int[] coefficients) {
		this.coefficients = coefficients;
	}


	public Polynomial(int grade, int[] coefficients) {
		this.grade = grade;
		this.coefficients = coefficients;
	}
	
	public Polynomial() {
	}
}
