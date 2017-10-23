package assignment_2;
import java.io.*;
import java.util.Scanner;
public class InputOutput {

	@SuppressWarnings("null")
	public static void main(String[] args) {
        String fileName = "pol.txt";
        String outputFile="output.txt";

        

        try {
        	FileWriter fileWriter = new FileWriter(outputFile);
        	BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        	
        	Scanner scanner= new Scanner (fileName);
        	
        	
        		
        	
        	
        		while (scanner.hasNextLine())
        		{
        			String currentLine = scanner.nextLine();
        			String coeffs[] = currentLine.split("\\s");
        			
        			System.out.println(coeffs);
        			
        			int coeffValues[] = null;
        			
        			for (int i = 0; i < coeffs.length; i++)
        		    {
        		        coeffValues[i] = Integer.parseInt(coeffs[i]);
        		        bufferedWriter.write(new Integer(coeffValues[i]).toString());
            			bufferedWriter.newLine();            			
        		    }
        			
        			
        		scanner.close();	
        	     
        		}
        		
        	
            

            
            bufferedWriter.close();
            
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            
        }
	}

}
