package BasicPrograms;

import java.util.Scanner;

public class choclatesEqually {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int result=choclatesDivided(n);
		System.out.println(result);
		

	}
	public static int choclatesDivided(int n)
	{
		return n/2;
		
	}

}
