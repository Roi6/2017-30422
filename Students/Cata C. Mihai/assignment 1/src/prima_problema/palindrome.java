package prima_problema;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,max=0,iMax=0,jMax=0,myNum;
		for (i=1;i<=999;i++)
			for (j=i+1;j<=999;j++)
		{
				myNum=i*j;
			if (myNum==mirror(myNum))
					{
						if (max<myNum) 
						{
							max=myNum;
							iMax=i;
							jMax=j;
						}
					}
		}
		System.out.println("The largest palindrome less than the prduct of 2 numbers with 3 digits is: ");
		System.out.println(max + " and it is the product of " + iMax +" and "+jMax);
	}
	public static int mirror(int x)
	{
		int c,rez=0;
		while (x>0)
		{
			c=x%10;
			x/=10;
			rez=rez*10+c;
		}
		return rez;
	}
	
}
