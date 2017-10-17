
public class LargestPalindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	long produs,original,reversed=0,pf=0,i,j;
	for(i=999;i>100;i--)
	{
		for(j=999;j>100;j--)
		{	
			reversed=0;
			produs=i*j;
			original=produs;
			while(produs>0)
			{
				reversed=reversed*10 + produs%10;
				produs=produs/10;
			}
			if(original==reversed && reversed>pf) pf=reversed;  
				
		}
		if(pf>i*999) break;
	}
	System.out.println(pf + " Is the largest palindrome, product of two 3 digit numbers");
	}
}
