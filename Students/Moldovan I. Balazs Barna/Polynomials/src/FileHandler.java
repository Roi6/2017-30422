import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandler {
	
	private Scanner scan;
	
	public void openFile() {
		try {
			scan = new Scanner("pol.txt");
		}
		catch (Exception e) {
			System.out.println("Error");
		}
	}
	
	public void readFromFile(Polynomial polynomialFirst, Polynomial polynomialSecond) throws IOException {
		
		BufferedReader buffer = new BufferedReader(new FileReader ("pol.txt"));
		
		try{			
			polynomialFirst.polynomial = buffer .readLine();
			polynomialSecond.polynomial = buffer .readLine();
			
		}catch (FileNotFoundException ex ) {
			System.out.println("Problem with file");
		}
		
		try{
			buffer.close();	
		}catch (Exception e) {
			System.out.println("Error");;
		}
		
	}
	
	public void readOpsFromFile(String operation) throws IOException {
		BufferedReader buffer = new BufferedReader(new FileReader ("pol.txt"));
		
		try {
			buffer.readLine();
			buffer.readLine();
			buffer.readLine();
		}catch(IOException e) {
			System.out.println("Error");
		}
		
		try {
			buffer.close();
		} catch (IOException e ) {
			System.out.println("Error");
		}
		
	}
	
	public void closeFile() {
		scan.close();
	}
	
}
