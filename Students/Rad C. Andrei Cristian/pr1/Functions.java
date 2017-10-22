package com.as2.pr1;

import com.as2.pr1.Polynomial;

public class Functions {
	
	//Method for displaying a polynomial in its mathematical form
	public void  displayPolynomial(Polynomial p) {
		
		for (int i = p.getDegree() - 1; i >= 0; i --) {
			
			System.out.println(p.getCoefficient(i) + " X^" + i);
		}
		
		System.out.println("\n");

	}

	//Method for adding two polynomials (commutative)
	public  Polynomial addPolynomials(Polynomial p1, Polynomial p2) {
		         
		int maxDegree = (p1.getDegree() > p2.getDegree()) ? p1.getDegree() : p2.getDegree();
		int minDegree = (p1.getDegree() > p2.getDegree()) ? p2.getDegree() : p1.getDegree();
		
		Polynomial result = new Polynomial(maxDegree);
		
		int coefficient;
		
		for (int i = 0; i < minDegree; i ++) {
			
			result.setCoefficient(i, p1.getCoefficient(i) + p2.getCoefficient(i));
		}
		for (int i = minDegree ; i < maxDegree; i ++) {
			
			result.setCoefficient(i, coefficient = (p1.getDegree() > p2.getDegree()) ? p1.getCoefficient(i) : p2.getCoefficient(i));
		}
		
		return result;
	}
	
	//Method for subtracting two polynomials (not commutative, so we are always extracting the second from the first one in this method)
	public  Polynomial subtractPolynomials(Polynomial p1, Polynomial p2) {

		int maxDegree = (p1.getDegree() > p2.getDegree()) ? p1.getDegree() : p2.getDegree();
		int minDegree = (p1.getDegree() > p2.getDegree()) ? p2.getDegree() : p1.getDegree();
		int coefficient;

		Polynomial result = new Polynomial(maxDegree);
		

		for (int i = 0; i < minDegree; i ++) {
			
			result.setCoefficient(i, p1.getCoefficient(i) - p2.getCoefficient(i));
		}
		for (int i = minDegree ; i < maxDegree; i ++) {
			
			result.setCoefficient(i, coefficient = (p1.getDegree() > p2.getDegree()) ? p1.getCoefficient(i) : p2.getCoefficient(i));
		}
		return result;
	}
	
	//Method for multiplying two polynomials (commutative)
	public  Polynomial multiplyPolynomials(Polynomial p1, Polynomial p2) {
		
		int maxDegree = p1.getDegree() + p2.getDegree() + 1;
		
		Polynomial result = new Polynomial(maxDegree); //The maximum degree of the resulting polynomial cannot be greater than the sum of the degrees of the composing polynomials
		
		for(int i = 0; i < p1.getDegree(); i ++) {
			for(int j = 0; j < p2.getDegree(); j ++) {
				
				result.setCoefficient(i + j, result.getCoefficient(i + j) + p1.getCoefficient(i) * p2.getCoefficient(j));
			}
		}
		
		return result;
	}
	
	//Method for multiplication by a scalar
	public  Polynomial multiplyByScalar(Polynomial p, int scalar) {
		
		Polynomial result = new Polynomial(p.getDegree(), p.getCoefficients());
		for(int i = 0; i < p.getDegree(); i ++) {
			result.setCoefficient(i, p.getCoefficient(i) * scalar);
		}
		
		return result;
	}
	
	//Method to evaluate a polynomial at a given value
	public  int evaluateAtValue(Polynomial p, int value) {
		
		int result = 0;
		
		for(int i = 0; i < p.getDegree(); i ++){
			result += (p.getCoefficient(i) * Math.pow(value,i));
		}
		
		return result;
	}
}
