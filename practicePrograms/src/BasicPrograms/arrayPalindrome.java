package BasicPrograms;

import java.util.Scanner;

public class arrayPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,res,sum,temp;
		Scanner input=new Scanner(System.in);
		System.out.println("enter the range");
		n=input.nextInt();
		int[] a=new int[n];
		System.out.println("enter the elements in the array");
		for(i=0;i<a.length;i++)
		{
			a[i]=input.nextInt();
		}
		for(i=0;i<a.length;i++)
		{
			temp=a[i];
			sum=0;
		while(a[i]!=0)
		{	
			res=a[i]%10;
			sum=sum*10+res;
			a[i]=a[i]/10;
		}
		if(temp==sum)
		{
			System.out.println("wins");
		}
		else
		{
			System.out.println("Losses");
		}
		}

	}

}
