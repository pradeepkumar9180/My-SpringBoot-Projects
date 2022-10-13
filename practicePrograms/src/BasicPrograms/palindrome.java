package BasicPrograms;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter an integer to check wheather it is palindrome or not");
		int num=input.nextInt();
		int res,sum=0;
		int temp=num;
		while(temp!=0)
		{
			res=temp%10;
			sum=sum*10+res;
			temp=temp/10;
		}
		
		if(sum==num)
		{
		System.out.println("palindrome");
		}
		else
		{
		System.out.println("not a palindrome");
		}
	}

}
