package matrix;

public class Matrix {
	
	public int[][] matrixIn;
	private int[][] result;
	private final int[][] FAIL ={{0}};
	private int row;
	private int col;
	
		
	
	// adds  value to every element in matrixIn
	// returns a matrix of the same size as matrixIn
	// returns FAIL if matrix has no element
	public int[][] matrixAdd(int[][] matrixIn, int value) {
		
		if(matrixIn.length == 0){
			
			return FAIL;
			
		}
			
		for(row = 0; row < matrixIn.length; row++ ) {
			for(col = 0; col < matrixIn[0].length ;col++ ) {
				result[row][col] =matrixIn[row][col] + value;		
			}
		}
			
		return result;
		
	}
	
	
	// subtracts  value from  every element in matrixIn
	// returns a matrix of the same size as matrixIn
	// returns FAIL if matrix has no element
	public int[][] matrixSub(int[][] matrixIn, int value) {
		
		if(matrixIn.length == 0){
			
			return FAIL;
			
		}
		
		for(row = 0; row < matrixIn.length; row++ ) {
			for(col = 0; col < matrixIn[0].length ;col++ ) {
				result[row][col] =matrixIn[row][col] - value;		
			}
		}
		
		return result;
	
	}
	
	
	// Multiplies by value  every element in matrixIn
	// returns a matrix of the same size as matrixIn	
	// returns FAIL if matrix has no element
	public int[][] matrixProd(int[][] matrixIn, int value) {
		
		if(matrixIn.length == 0){
			
			return FAIL;
			
		}
		
		for(row = 0; row < matrixIn.length; row++ ) {
			for(col = 0; col < matrixIn[0].length ;col++ ) {
				result[row][col] =matrixIn[row][col] * value;		
			}
		}
		
		return result;
	
	}
	
	// Divides by value every element in matrixIn
	// returns a matrix of the same size as matrixIn	
	// returns FAIL if matrix has no element
	public int[][] matrixDiv(int[][] matrixIn, int value) {
		
		if(matrixIn.length == 0){
			
			return FAIL;
			
		}
		
		for(row = 0; row < matrixIn.length; row++ ) {
			for(col = 0; col < matrixIn[0].length ;col++ ) {
				result[row][col] =matrixIn[row][col] / value;		
			}
		}
		
		return result;
	
	}

	
}
