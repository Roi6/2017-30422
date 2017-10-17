
public class Largest_palindrom {

	public static boolean product_of_3digits(int number) { // it verifies if number is made from the product of two 3-digit numbers
		// TODO Auto-generated method stub
		int divizor=999;
		while (divizor>=100)
		{
			if ((number%divizor==0) && (number/divizor>=100) && (number/divizor<=999))
			{
				return true;
			}
			else
			{
				divizor--;
			}
				
		}
		return false;
	}

	public static boolean palindrom(int number) { // it verifies if number is a palindrom
		// TODO Auto-generated method stub
		int oglindit,aux;
		aux=number;
		oglindit=0;
		while (aux>0)
		{
			oglindit=oglindit*10+aux%10;
			aux=aux/10;
		}
		
		if (oglindit==number)
		{
			return true;
		}
		else
		{
			return false;
			
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		number=999*999;
		while (palindrom(number)==false || product_of_3digits(number)==false )
		{
			number--;
		}
		System.out.print(number);
	}
}
