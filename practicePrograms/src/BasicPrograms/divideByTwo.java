package BasicPrograms;

import java.util.Scanner;

public class divideByTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n=input.nextInt();
	
int result=divideBy(n);
System.out.println(result);	
	}
	public static int divideBy(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}

}
