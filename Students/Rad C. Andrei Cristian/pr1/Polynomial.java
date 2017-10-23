package com.as2.pr1;

public class Polynomial {

	//Fields 
	
	public static final int MAX_DEGREE = 100; //We can assume a maximum degree for static allocation of the coefficients array; Values are initialized with 0 by default, so it won't affect the calculations 
	
	private Integer[] coefficients = new Integer[MAX_DEGREE]; //Assuming the int type of the coefficients of the polynomials, since the example only contained integer coefficients and was not otherwise specificied
	
	private int degree;
	
	//Constructors
	
	public Polynomial(int degree) throws IllegalArgumentException {
		
		if (degree < 0) {
			throw new IllegalArgumentException();
		}

			this.degree = degree;
		
	}
	
	public Polynomial(int degree, Integer[] coefficients) throws IllegalArgumentException {
		
		if(degree < 0) {
			throw new IllegalArgumentException();
		}
		
		this.degree = degree;
		
		for (int i = 0; i <= degree; i++) {
			
			this.coefficients[i]=coefficients[i];
		}
	}
	
	public Polynomial(int degree, int[] coefficients) throws IllegalArgumentException {
		
		if(degree < 0) {
			throw new IllegalArgumentException();
		}
		
		this.degree = degree;
		
		for (int i = 0; i < degree; i++) {
			
			this.coefficients[i]=coefficients[i];
		}
	}
	
	//Getters and Setters
	
	public Integer[] getCoefficients() {
		
		return coefficients;
	}

	public void setCoefficients(Integer[] coefficients) {
		
		this.coefficients = coefficients;
	}

	public int getDegree() {
		
		return degree;
	}
	
	public void setDegree(int degree) {
		
		this.degree = degree;
	}

	public int getCoefficient(int degree) {
		
		return this.coefficients[degree];
	}
	
	public void setCoefficient(int degree, int coefficient) throws IllegalArgumentException {
		
		if (degree < 0) {
			
			throw new IllegalArgumentException();
		}
		
		this.coefficients[degree] = coefficient;
	}
	
	
	
}
