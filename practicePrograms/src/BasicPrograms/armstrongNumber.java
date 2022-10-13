package BasicPrograms;

import java.util.Scanner;

public class armstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the intege number");
		int num=input.nextInt();
		int n = num;
		int total=0;
		while(n!=0)
		{
			int res=n%10;
			total=total+res*res*res;
			n=n/10;	
		}
		if(total==num)
		{
			System.out.println("armStrong");
		}
		else
		{
			System.out.println("not an armStrong");
		}

	}

}
